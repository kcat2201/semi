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

/**
 *
 * @author kcat2
 */
public class SenderDAO {

    public int insertSender(SenderDTO sdrdto, int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = DBUtil.getConnection();
            String sql = "insert into sender values(SENDER_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, resno);
            ps.setString(2, sdrdto.getSenderName());
            ps.setString(3, sdrdto.getSenderHp());
            ps.setString(4, sdrdto.getZipcode());
            ps.setString(5, sdrdto.getAddress1());
            ps.setString(6, sdrdto.getAddress2());
            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }

    public SenderDTO selectByResno(int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        SenderDTO sdto = new SenderDTO();
        try {

            con = DBUtil.getConnection();
            String sql = "select * from sender where resno=?";
            ps = con.prepareStatement(sql);

            ps.setInt(1, resno);

            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("senderName");
                String hp = rs.getString("senderHp");
                String zipcode = rs.getString("zipcode");
                String addr1 = rs.getString("address1");
                String addr2 = rs.getString("address2");
                sdto.setResNo(resno);
                sdto.setSenderName(name);
                sdto.setSenderHp(hp);
                sdto.setZipcode(zipcode);
                sdto.setAddress1(addr1);
                sdto.setAddress2(addr2);

                System.out.println(sdto);
            }
            return sdto;

        } finally {
            DBUtil.dbClose(rs, ps, con);
        }

    }

    public int updateSender(SenderDTO senderdto, int resno) throws SQLException {

        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUtil.getConnection();
            String sql = "update sender "
                    + "set sendername=?, senderhp=?, zipcode=?, address1=?, address2=? "
                    + "where resno=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, senderdto.getSenderName());
            ps.setString(2, senderdto.getSenderHp());
            ps.setString(3, senderdto.getZipcode());
            ps.setString(4, senderdto.getAddress1());
            ps.setString(5, senderdto.getAddress2());
            ps.setInt(6, resno);
            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }
}
