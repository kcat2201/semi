/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ksy.view;

import com.model.ResDAO;
import com.model.ResDTO;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kcat2
 */
public class ReserveListGUI extends javax.swing.JFrame implements ActionListener {

    private String colNames[] = {"예약번호", "예약명", "송장번호", "예약일"};
    private DefaultTableModel model = new DefaultTableModel();
    private ResDAO resdao = new ResDAO();
    private int resno;

    public ReserveListGUI() throws SQLException {
        initComponents();
        init();
        addEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reslist = new javax.swing.JTable();
        btDel = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("택배예약현황");

        jLabel1.setFont(new java.awt.Font("휴먼둥근헤드라인", 0, 36)); // NOI18N
        jLabel1.setText("택배예약현황");

        reslist.setFont(new java.awt.Font("맑은 고딕", 0, 17)); // NOI18N
        reslist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(reslist);

        btDel.setBackground(new java.awt.Color(255, 49, 30));
        btDel.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btDel.setForeground(new java.awt.Color(255, 255, 255));
        btDel.setText("삭제");
        btDel.setAlignmentY(0.0F);

        btEdit.setBackground(new java.awt.Color(0, 51, 153));
        btEdit.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btEdit.setForeground(new java.awt.Color(255, 255, 255));
        btEdit.setText("수정");
        btEdit.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btDel)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDel)
                    .addComponent(btEdit))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReserveListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReserveListGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ReserveListGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reslist;
    // End of variables declaration//GEN-END:variables

    private void init() throws SQLException {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showList();
    }

    private void addEvent() {
        btEdit.addActionListener(this);
        btDel.addActionListener(this);
        reslist.addMouseListener(new EventHandler());
    }

    class EventHandler extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getSource() == reslist) {
                int row = reslist.getSelectedRow();
                resno = Integer.parseInt((String) reslist.getValueAt(row, 0));
               
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btEdit) {

            try {
                String invoiceno = resdao.getinvoiceNo(resno);
              
                if(resno==0){
                    JOptionPane.showMessageDialog(this, "수정/삭제할 항목을 선택하세요");
                    return;
                }
                else if (invoiceno==null || invoiceno.isEmpty()) {
                  
                    ReserveGUI f = new ReserveGUI(this, ReserveGUI.RES_EDIT, resno);
                    f.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "택배접수완료! 수정 불가");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ReserveListGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == btDel) {
            int cnt;
            try {
                cnt = resdao.delRes(resno);
                System.out.println("cnt=" + cnt);
                String msg = "";
                if (cnt > 0) {
                    msg = "삭제 완료";
                    showList();
                } else {
                    msg = "삭제 실패";
                }
                JOptionPane.showMessageDialog(this, msg);
            } catch (SQLException ex) {
                Logger.getLogger(ReserveListGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void showList() throws SQLException {
        List<ResDTO> list = resdao.getList();
        
        String[][] data = new String[list.size()][colNames.length];

        for (int i = 0; i < list.size(); i++) {
            ResDTO dto = list.get(i);

            data[i][0] = Integer.toString(dto.getResNo());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
            String resdate = sdf.format(dto.getResDate());
            data[i][1] = dto.getResAlias();
            data[i][2] = dto.getInvoiceNo();
            data[i][3] = resdate;
        }
        model.setDataVector(data, colNames);
        reslist.setModel(model);

        //tableheader설정
        reslist.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));

        //각 칼럼 사이즈 조절
        reslist.getColumnModel().getColumn(0).setPreferredWidth(100);
        reslist.getColumnModel().getColumn(1).setPreferredWidth(150);
        reslist.getColumnModel().getColumn(2).setPreferredWidth(200);
        reslist.getColumnModel().getColumn(3).setPreferredWidth(150);

        reslist.setRowHeight(22);
    }

}
