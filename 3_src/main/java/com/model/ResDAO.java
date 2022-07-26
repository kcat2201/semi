/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import com.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResDAO {

    public int getresNo() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            con = DBUtil.getConnection();
            String sql = "select sender_seq.nextval from dual";
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            if (!rs.next()) {
                return 0;
            }

            return rs.getInt(1);
        } finally {
            DBUtil.dbClose(rs, ps, con);
        }
    }

    public String  getinvoiceNo(int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String invoceno="";
        try {

            con = DBUtil.getConnection();
            String sql = "select invoiceno from reservation where resno=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, resno);
            
            rs = ps.executeQuery();
            if (rs.next()) {
               invoceno=rs.getString(1);
            }
return invoceno;
            
        } finally {
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
    
    public int insertRes(ResDTO rdto, int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = DBUtil.getConnection();
            String sql = "insert into reservation(resno, resalias, id)"
                    + "values(?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, resno);
            ps.setString(2, rdto.getResAlias());
            ps.setString(3, rdto.getId());

            int cnt = ps.executeUpdate();
            System.out.println(sql);
            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }

    public List<ResDTO> getList() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ResDTO> list = new ArrayList();
        try {

            con = DBUtil.getConnection();
            String sql = "select * from reservation where id=? order by resno desc";

            ps = con.prepareStatement(sql);
            ps.setString(1, MemberService.getId());

            rs = ps.executeQuery();

            while (rs.next()) {
                //예약번호,예약일자,예약내용, 운송장번호
                int resno = rs.getInt("resno");
                Timestamp resdate = rs.getTimestamp("resdate");
                String invoiceno = rs.getString("invoiceno");
                String alias = rs.getString("resalias");

                ResDTO dto = new ResDTO();
                dto.setResNo(resno);
                dto.setResDate(resdate);
                dto.setResAlias(alias);
                dto.setInvoiceNo(invoiceno);
                list.add(dto);
            }
            System.out.println("조회 결과 list.size=" + list.size());

            return list;

        } finally {
            DBUtil.dbClose(rs, ps, con);
        }
    }

    public int completeReg(int weight, int fare, int resno) throws SQLException {

        //무게, 가격, 송장번호 업데이트
        Connection con = null;
        PreparedStatement ps = null;

        String invoiceno = makeInvoiceno(resno);
        try {
            con = DBUtil.getConnection();
            String sql = "update reservation set weight=?, fare=?, invoiceno=? where resno=?";
            ps = con.prepareStatement(sql);

            ps.setInt(1, weight);
            ps.setInt(2, fare);
            ps.setString(3, invoiceno);
            ps.setInt(4, resno);

            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }

    }

    public int delRes(int resno) throws SQLException {

        //무게, 가격 수정
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUtil.getConnection();
            String sql = "delete from reservation where resno=?";
            ps = con.prepareStatement(sql);

            ps.setInt(1, resno);

            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }

    }

    public ResDTO selectByResno(int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ResDTO dto = new ResDTO();
        try {
            con = DBUtil.getConnection();
            String sql = "select resalias from reservation where resno=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, resno);

            rs = ps.executeQuery();

            if (rs.next()) {
                String alias = rs.getString(1);
                dto.setResAlias(alias);
            }
            return dto;

        } finally {
            DBUtil.dbClose(rs, ps, con);

        }

    }

    public int updateRes(int resno, String alias) throws SQLException {
        //resno=?인 예약테이블의 예약정보 수정(alias)

        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUtil.getConnection();
            String sql = "update reservation set resalias=? where resno=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, alias);
            ps.setInt(2, resno);

            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }

    private String makeInvoiceno(int resno) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date today = new Date();
        String no1 = sdf.format(today);

        DecimalFormat df = new DecimalFormat("00000");
        String no2 = df.format(resno);

        String invoiceno = no1 + no2;

        return invoiceno;

    }

    public List<ResDTO> getReslist() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ResDTO> list = new ArrayList();
        try {

            con = DBUtil.getConnection();
            String sql = "select * from reservation where id=? and invoiceno is null order by resno desc";

            ps = con.prepareStatement(sql);
            ps.setString(1, MemberService.getId());

            rs = ps.executeQuery();

            while (rs.next()) {
                //예약번호,예약일자,예약내용, 운송장번호
                int resno = rs.getInt("resno");
                Timestamp resdate = rs.getTimestamp("resdate");
                String alias = rs.getString("resalias");

                ResDTO dto = new ResDTO();
                dto.setResNo(resno);
                dto.setResDate(resdate);
                dto.setResAlias(alias);
                list.add(dto);
            }
            System.out.println("조회 결과 list.size=" + list.size());

            return list;

        } finally {
            DBUtil.dbClose(rs, ps, con);
        }

    }

}
