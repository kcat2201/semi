package com.model;

import com.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ZipcodeDAO {
    
    public List<ZipcodeDTO> selectZipcode(String dong) throws SQLException{

        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<ZipcodeDTO> alist = new ArrayList<ZipcodeDTO>();                
        
        try{
            con=DBUtil.getConnection();

            String sql = "select * from zipcode where dong like '%'||?||'%'";
            ps = con.prepareStatement(sql);
            ps.setString(1, dong);
            
            //4
            rs = ps.executeQuery();
            while(rs.next()){
                String zipcode = rs.getString("zipcode");
                String sido = rs.getString("sido");
                String gugun = rs.getString("gugun");
                String dong2 = rs.getString("dong");
                String startbunji = rs.getString("startbunji");
                String endbunji = rs.getString("endbunji");
                int seq = rs.getInt("seq");
                
                ZipcodeDTO dto = new ZipcodeDTO(zipcode,sido,gugun,dong2, startbunji,endbunji,seq);
                alist.add(dto);
            }
            return alist;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
}
