package com.ksy.view;

import com.model.ResDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kcat2
 */
public class WeightGUI extends javax.swing.JFrame implements ActionListener {

    private RegisterGUI reggui;
    private ResDAO resdao = new ResDAO();
    private String weight;

    public WeightGUI() {
        initComponents();
        init();
        addEvent();
    }

    public WeightGUI(RegisterGUI reggui) {
        this();
        this.reggui = reggui;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfWeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btConfirm = new javax.swing.JButton();
        btCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("무게측정");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\lecture\\workspace_list\\nb_ws\\postbox\\src\\main\\java\\img\\faretable.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("휴먼둥근헤드라인", 0, 40)); // NOI18N
        jLabel2.setText("운임안내");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "무게측정", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("맑은 고딕", 0, 24))); // NOI18N

        tfWeight.setEditable(false);
        tfWeight.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        tfWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWeightActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 40)); // NOI18N
        jLabel3.setText("g");

        btConfirm.setBackground(new java.awt.Color(254, 254, 254));
        btConfirm.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btConfirm.setText("확인");

        btCheck.setBackground(new java.awt.Color(0, 111, 62));
        btCheck.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btCheck.setForeground(new java.awt.Color(255, 255, 255));
        btCheck.setText("측정");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCheck)
                    .addComponent(btConfirm))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWeightActionPerformed

    private void btCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCheckActionPerformed

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
            java.util.logging.Logger.getLogger(WeightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeightGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCheck;
    private javax.swing.JButton btConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables

    private void addEvent() {
        btCheck.addActionListener(this);
        btConfirm.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btCheck) {
            int w = (int) (Math.random() * 25000 + 1);
            weight = Integer.toString(w);
            tfWeight.setText(weight);
            
        }
        if (e.getSource() == btConfirm) {
            int fare=calFare();
            reggui.tfWeight.setText(weight);
            reggui.tfFare.setText(Integer.toString(fare));
            this.dispose();
        }

    }

    private int calFare() {
       
        int fare=0;
        int w=Integer.parseInt(weight);
        if(w<=350) fare=2900;       else if(w<=400) fare=3100;
        else if(w<=450) fare=3200;  else if(w<=500) fare=3400;
        else if(w<=600) fare=3600;  else if(w<=700) fare=3700;
        else if(w<=800) fare=3800;  else if(w<=900) fare=3900;
        else if(w<=1000) fare=4000; else if(w<=1500) fare=4300;
        else if(w<=2000) fare=4600; else if(w<=3000) fare=4900;
        else if(w<=4000) fare=5000; else if(w<=5000) fare=5400;
        else if(w<=7000) fare=6500; else if(w<=10000) fare=7000;
        else if(w<=15000) fare=7800;
        else if(w<=20000) fare=8800;
        else if(w<=25000) fare=10000;
        else 
            JOptionPane.showMessageDialog(this, "무게측정오류");
        System.out.println("w="+w+", fare="+fare);
        return fare;
    }

    private void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    }

}
