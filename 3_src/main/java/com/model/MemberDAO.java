package com.model;

import com.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

    public int insertMember(MemberDTO dto) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = DBUtil.getConnection();

            String sql = "insert into member(id,pwd, name, hp, email, zipcode, address1, address2)"
                    + "values(?, ?, ?, ?, ?, ?, ?, ?)";

            ps = con.prepareStatement(sql);

            ps.setString(1, dto.getId());
            ps.setString(2, dto.getPwd());
            ps.setString(3, dto.getName());
            ps.setString(4, dto.getHp());
            ps.setString(5, dto.getEmail());
            ps.setString(6, dto.getZipcode());
            ps.setString(7, dto.getAddress1());
            ps.setString(8, dto.getAddress2());

            int cnt = ps.executeUpdate();
            System.out.println("회원가입 결과 cnt=" + cnt + ", 입력값 dto=" + dto);
            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }

    public int duplicate(String id) throws SQLException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;

        try {
            con = DBUtil.getConnection();
            String sql = "select count(*) from member where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getInt(1);
            }

            return result;
        } finally {
            DBUtil.dbClose(ps, con);
        }

    }

    public int loginCheck(String id, String pwd) throws SQLException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;

        try {
            con = DBUtil.getConnection();

            String sql = "select pwd from member where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                String checkPwd = rs.getString(1);
                if (pwd.equals(checkPwd)) {
                    result = MemberService.LOGIN_OK;
                } else {
                    result = MemberService.PWD_DISAGREE;
                }
            } else {
                result = MemberService.NONE_USERID;
            }

            return result;

        } finally {
            DBUtil.dbClose(rs, ps, con);
        }

    }

    public MemberDTO getInfo() throws SQLException {
        //회원 이름, 전화번호, 우편번호, 상세주소 1, 상세주소2
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String id = MemberService.getId();
        MemberDTO mdto = new MemberDTO();
        try {
            con = DBUtil.getConnection();

            String sql = "select * from member where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                mdto.setId(id);
                mdto.setPwd(rs.getString("pwd"));
                mdto.setName(rs.getString("name"));
                mdto.setHp(rs.getString("hp"));
                mdto.setEmail(rs.getString("email"));
                mdto.setZipcode(rs.getString("zipcode"));
                mdto.setAddress1(rs.getString("address1"));
                mdto.setAddress2(rs.getString("address2"));
                mdto.setRegDate(rs.getTimestamp("regdate"));
            }
            return mdto;
        } finally {
            DBUtil.dbClose(rs, ps, con);
        }
    }

    public int updateMember(MemberDTO mdto) throws SQLException {

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtil.getConnection();

            String sql = "update member set pwd=?, hp=?,email=?,zipcode=?,address1=?,address2=? "
                    + "where id=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, mdto.getPwd());
            ps.setString(2, mdto.getHp());
            ps.setString(3, mdto.getEmail());
            ps.setString(4, mdto.getZipcode());
            ps.setString(5, mdto.getAddress1());
            ps.setString(6, mdto.getAddress2());
            ps.setString(7, mdto.getId());
           
            int cnt = ps.executeUpdate();
           
            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }

    }

}
