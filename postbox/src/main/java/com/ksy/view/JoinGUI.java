/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ksy.view;


import com.model.MemberDAO;
import com.model.MemberDTO;
import com.model.MemberService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kcat2
 */
public class JoinGUI extends javax.swing.JFrame implements ActionListener {

    private MemberDAO mdao=new MemberDAO();
    private MainGUI maingui;
    private boolean dupCheck=false;
    private int memberFlag; //회원가입인지, 수정인지 구분해주는 값
    
    public static final int MEMBER_REGISTER=1;  //회원가입
    public static final int MEMBER_EDIT=2;      //회원정보 수정
     private String[] emailArr={"naver.com", "nate.com","daum.net","gmail.com","직접입력"};
   
     
    /**
     * Creates new form JoinGUI
     */
    public JoinGUI() {
        initComponents();
        init();
        addEvent();
    }
    
    public JoinGUI(int memberFlag) throws SQLException{
        this();
        this.memberFlag=memberFlag;
        joinSetting();
    }
/*
    public boolean isDupCheck() {
        return dupCheck;
    }

    public void setDupCheck(boolean dupCheck) {
        this.dupCheck = dupCheck;
    }
*/

    public JoinGUI(MainGUI maingui) {
        this();
        this.maingui=maingui;
    }

    public JoinGUI(MainGUI maingui, int memberFlag) throws SQLException {
       this();
       this.maingui=maingui;
       this.memberFlag=memberFlag;
       joinSetting();
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        tfPwd = new javax.swing.JPasswordField();
        tfHp = new javax.swing.JTextField();
        tfAddress1 = new javax.swing.JTextField();
        btDup = new javax.swing.JButton();
        tfZipode = new javax.swing.JTextField();
        tfAddress2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbEmail3 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btJoin = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btZipcode = new javax.swing.JButton();
        tfEmail1 = new javax.swing.JTextField();
        tfEmail2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("회원가입");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel2.setText("이름");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel3.setText("아이디");

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel4.setText("비밀번호");

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel5.setText("전화번호");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel6.setText("우편번호");

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel7.setText("주소");

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel8.setText("이메일");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel9.setText("상세주소");

        tfName.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        tfId.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        tfPwd.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        tfHp.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        tfHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHpActionPerformed(evt);
            }
        });

        tfAddress1.setEditable(false);
        tfAddress1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        btDup.setBackground(new java.awt.Color(0, 111, 62));
        btDup.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btDup.setForeground(new java.awt.Color(255, 255, 255));
        btDup.setText("중복확인");

        tfZipode.setEditable(false);
        tfZipode.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        tfAddress2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("@");

        cbEmail3.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        cbEmail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmail3ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel10.setText("ex) 01012345678");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btJoin.setBackground(new java.awt.Color(0, 111, 62));
        btJoin.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btJoin.setForeground(new java.awt.Color(255, 255, 255));
        btJoin.setText("확인");
        btJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJoinActionPerformed(evt);
            }
        });
        jPanel1.add(btJoin);

        btCancel.setBackground(new java.awt.Color(0, 111, 62));
        btCancel.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btCancel.setForeground(new java.awt.Color(255, 255, 255));
        btCancel.setText("취소");
        jPanel1.add(btCancel);

        btZipcode.setBackground(new java.awt.Color(0, 111, 62));
        btZipcode.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btZipcode.setForeground(new java.awt.Color(255, 255, 255));
        btZipcode.setText("주소검색");

        tfEmail1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        tfEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmail1ActionPerformed(evt);
            }
        });

        tfEmail2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        tfEmail2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        tfEmail2.setSelectionColor(new java.awt.Color(0, 0, 0));
        tfEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmail2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfId)
                                    .addComponent(tfPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btDup, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfHp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(tfZipode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btZipcode)
                                    .addGap(65, 65, 65))
                                .addComponent(tfAddress1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(40, 40, 40)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(tfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(jLabel1)
                                                            .addGap(167, 167, 167))
                                                        .addComponent(tfEmail2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(11, 11, 11))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfHp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfZipode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(tfEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(cbEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHpActionPerformed

    private void btJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btJoinActionPerformed

    private void tfEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmail1ActionPerformed

    private void tfEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmail2ActionPerformed

    private void cbEmail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmail3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmail3ActionPerformed

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
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoinGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDup;
    private javax.swing.JButton btJoin;
    private javax.swing.JButton btZipcode;
    private javax.swing.JComboBox<String> cbEmail3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField tfAddress1;
    private javax.swing.JTextField tfAddress2;
    private javax.swing.JTextField tfEmail1;
    private javax.swing.JTextField tfEmail2;
    private javax.swing.JTextField tfHp;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPwd;
    public javax.swing.JTextField tfZipode;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btJoin){
           try {
           if(memberFlag==MEMBER_REGISTER)
               join();
           else if(memberFlag==MEMBER_EDIT)
               memEdit();
           } catch (SQLException ex) {
               Logger.getLogger(JoinGUI.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else if(e.getSource()==btDup){
           try {
               idDupliate();
           } catch (SQLException ex) {
               Logger.getLogger(JoinGUI.class.getName()).log(Level.SEVERE, null, ex);
           }
       }    
        else if (e.getSource() == btZipcode) {
            SubZipcode f = new SubZipcode(this);
            f.setVisible(true);
        }
        else if(e.getSource()==btCancel)
            this.dispose();
        
    }
    
    private void addEvent() {
        btCancel.addActionListener(this);
        btDup.addActionListener(this);
        btJoin.addActionListener(this);
        btZipcode.addActionListener(this);
        cbEmail3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (e.getItem().equals("직접입력")) {
                        tfEmail2.setEnabled(true);
                       tfEmail2.setEditable(true);
                        tfEmail2.setText("");
                        tfEmail2.requestFocus();
                    } else {
                        tfEmail2.setEnabled(false);
                        tfEmail2.setText((String) e.getItem());
                    }
                }
            }
        });
    }

    private void join() throws SQLException {
        String name=tfName.getText();
        String id=tfId.getText();
        String pwd=tfPwd.getText();
        String hp=tfHp.getText();
        String zipcode=tfZipode.getText();
        String address1=tfAddress1.getText();
        String address2=tfAddress2.getText();
        String email1= tfEmail1.getText();
        String email2=tfEmail2.getText();
        
        if(checkData(name, id, pwd, hp, zipcode, email1, email2)<0)
            return;
       
        if(!dupCheck)
        {
           JOptionPane.showMessageDialog(this, "아이디 중복확인 필수");
           btDup.requestFocus();
           return;
        } 
        MemberDTO mdto=new MemberDTO();
        mdto.setId(id);
        mdto.setPwd(pwd);
        mdto.setName(name);
        mdto.setHp(hp);
        
        String email=email1+"@"+email2;
        mdto.setEmail(email);
        
        mdto.setZipcode(zipcode);
        mdto.setAddress1(address1);
        mdto.setAddress2(address2);
        
        
        int cnt=mdao.insertMember(mdto);
        
        String msg="";
        
        if(cnt>0){
            msg="회원가입 완료";
            maingui.tfId.setText(id);
            this.dispose();
        }else
            msg="회원가입 실패";
 
        JOptionPane.showMessageDialog(this, msg);
    }

    private void idDupliate() throws SQLException {
    
        String id=tfId.getText();
        
        if(id==null || id.isEmpty()){
            JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
            tfId.requestFocus();
            return;
        }
        
        MemberDAO mdao=new MemberDAO();
        int result=mdao.duplicate(id);
        
        if(result>0){
            JOptionPane.showMessageDialog(this, "해당 아이디가 이미 존재합니다. "
                    + "다른 아이디를 입력하세요");
            tfId.setText("");
        }
        else if(result==0){
            int type=JOptionPane.showConfirmDialog(this, "사용가능한 아이디입니다. 사용하시겠습니까?","아이디 확인",JOptionPane.YES_NO_OPTION);
            
            if(type==JOptionPane.YES_OPTION){
                dupCheck=true;
            }else{
                tfId.setText("");
            }
        }else
            JOptionPane.showMessageDialog(this, "아이디 중복확인 실패");
        
        
        
    }

    private void init() {
        DefaultComboBoxModel cmodel=new DefaultComboBoxModel(emailArr);
        cbEmail3.setModel(cmodel);
        cbEmail3.setSelectedItem("직접입력");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void memEdit() throws SQLException {
        
        String name=tfName.getText();
        String id=tfId.getText();
        String pwd=tfPwd.getText();
        String hp=tfHp.getText();
        String zipcode=tfZipode.getText();
        String address1=tfAddress1.getText();
        String address2=tfAddress2.getText();
        String email1= tfEmail1.getText();
        String email2=tfEmail2.getText();
        
        if(checkData(name, id, pwd, hp, zipcode, email1, email2)<0)
            return;
      
        String email=email1+"@"+email2;
        
        MemberDTO mdto=new MemberDTO();
        mdto.setName(name);
        mdto.setId(id);
        mdto.setPwd(pwd);
        mdto.setHp(hp);
        mdto.setZipcode(zipcode);
        mdto.setAddress1(address1);
        mdto.setAddress2(address2);
        mdto.setEmail(email);
        
        int cnt=mdao.updateMember(mdto);
        String msg="";
        if(cnt>0){
            msg="회원정보 수정 완료";
            this.dispose();
        }else
            msg="회원정보 수정 실패";
        
        JOptionPane.showMessageDialog(this, msg);
        
    
    }
    
    

    private void joinSetting() throws SQLException {
        //회원가입, 수정에 따라서 화면 처리
        if(memberFlag==MEMBER_REGISTER){
            setTitle("회원가입");
            btJoin.setText("확인");
        }else if(memberFlag==MEMBER_EDIT){
            setTitle("회원정보수정");
            btJoin.setText("수정");
            tfName.setEditable(false);
            tfId.setEditable(false);
            btDup.setEnabled(false);
            showById();
        }
    
    }

    private void showById() throws SQLException {
        String id=MemberService.getId();
        MemberDTO dto=mdao.getInfo();
        tfName.setText(dto.getName());
        tfId.setText(dto.getId());
        tfPwd.setText(dto.getPwd());
        tfHp.setText(dto.getHp());
        tfZipode.setText(dto.getZipcode());
        tfAddress1.setText(dto.getAddress1());
        tfAddress2.setText(dto.getAddress2());
        
        //이메일
        boolean existEmail=false;
        String email=dto.getEmail();
        if(email!=null && !email.isEmpty()){
            String[] arr=email.split("@");
            System.out.println("arr[0] : "+arr[0]);
            tfEmail1.setText(arr[0]);
            
            String email2=arr[1];
            for(String s:emailArr){
                if(email2.equals(s)){
                    existEmail=true;
                    break;
                }
                
            }
            if(existEmail){
                cbEmail3.setSelectedItem(email2);
                tfEmail2.setText(email2);
                tfEmail2.setEditable(false);
            }else{
                cbEmail3.setSelectedItem("직접입력");
                tfEmail2.setText(email2);
                
            }
            
        }
    }

    private int checkData(String name, String id, String pwd, String hp, 
            String zipcode, String email1, String email2) {
        
         if(name==null || name.isEmpty()){
            JOptionPane.showMessageDialog(this, "이름을 입력하세요");
            tfName.requestFocus();
             return -1;
        }
        
         if(id ==null || id.isEmpty()){
            JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
            tfId.requestFocus();
            return -1;
        }
         
        if(pwd ==null || pwd.isEmpty()){
            JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
            tfPwd.requestFocus();
          return -1;
        }
        
        if(hp ==null || hp.isEmpty()){
            JOptionPane.showMessageDialog(this, "전화번호를 입력하세요");
            tfHp.requestFocus();
            return -1;
        }
        if(zipcode ==null || zipcode.isEmpty()){
            JOptionPane.showMessageDialog(this, "주소를 입력하세요");
            tfZipode.requestFocus();
            return -1;
        }
         if(email1 ==null || email1.isEmpty() || email2==null ||email2.isEmpty()){
            JOptionPane.showMessageDialog(this, "이메일 입력하세요");
            tfEmail1.requestFocus();
             return -1;
        }
         
        
        return 0;
    }
}
