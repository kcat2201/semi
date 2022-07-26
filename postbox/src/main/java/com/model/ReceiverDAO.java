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
public class ReceiverDAO {

    public int insertReceiver(ReceiverDTO rcvdto, int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = DBUtil.getConnection();
            String sql = "insert into receiver values(RECEIVER_SEQ.nextval,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, resno);
            ps.setString(2, rcvdto.getReceiverName());
            ps.setString(3, rcvdto.getReceiverHp());
            ps.setString(4, rcvdto.getZipcode());
            ps.setString(5, rcvdto.getAddress1());
            ps.setString(6, rcvdto.getAddress2());
            ps.setString(7, rcvdto.getRequestMsg());
            ps.setString(8, rcvdto.getPayment());
            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }

    public ReceiverDTO selectByResno(int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ReceiverDTO rdto = new ReceiverDTO();
        try {

            con = DBUtil.getConnection();
            String sql = "select * from receiver where resno=?";
            ps = con.prepareStatement(sql);

            ps.setInt(1, resno);

            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("receivername");
                String hp = rs.getString("receiverHp");
                String zipcode = rs.getString("zipcode");
                String addr1 = rs.getString("address1");
                String addr2 = rs.getString("address2");
                String msg = rs.getString("requestmsg");
                String payment = rs.getString("payment");

                rdto.setResNo(resno);
                rdto.setReceiverName(name);
                rdto.setReceiverHp(hp);
                rdto.setZipcode(zipcode);
                rdto.setAddress1(addr1);
                rdto.setAddress2(addr2);
                rdto.setRequestMsg(msg);
                rdto.setPayment(payment);

            }
            return rdto;

        } finally {
            DBUtil.dbClose(rs, ps, con);
        }

    }

    public int updateReceiver(ReceiverDTO receiverdto, int resno) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUtil.getConnection();
            String sql = "update receiver "
                    + "set receivername=?, receiverhp=?, zipcode=?, address1=?, address2=?, requestmsg=?, payment=? "
                    + "where resno=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, receiverdto.getReceiverName());
            ps.setString(2,receiverdto.getReceiverHp());
            ps.setString(3,receiverdto.getZipcode());
            ps.setString(4, receiverdto.getAddress1());
            ps.setString(5, receiverdto.getAddress2());
            ps.setString(6,receiverdto.getRequestMsg() );
            ps.setString(7,receiverdto.getPayment());
            ps.setInt(8, resno);
            int cnt = ps.executeUpdate();

            return cnt;
        } finally {
            DBUtil.dbClose(ps, con);
        }
    }
}