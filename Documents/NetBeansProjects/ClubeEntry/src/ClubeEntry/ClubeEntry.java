/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubeEntry;


import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author franklin chidera
 */
public class ClubeEntry extends javax.swing.JFrame {
double bothnum;
    /**
     * Creates new form ClubeEntry
     */
    public ClubeEntry() {
        initComponents();
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
        DashBoard = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        txtone = new javax.swing.JButton();
        txttwo = new javax.swing.JButton();
        txtthree = new javax.swing.JButton();
        txtfour = new javax.swing.JButton();
        txtfive = new javax.swing.JButton();
        txtsix = new javax.swing.JButton();
        txtseven = new javax.swing.JButton();
        txteight = new javax.swing.JButton();
        txtnine = new javax.swing.JButton();
        txtzero = new javax.swing.JButton();
        txtExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12), "Club Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DashBoard");

        DashBoard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DashBoard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DashBoardKeyTyped(evt);
            }
        });

        Enter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        txtone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtone.setText("1");
        txtone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoneActionPerformed(evt);
            }
        });

        txttwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttwo.setText("2");
        txttwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttwoActionPerformed(evt);
            }
        });

        txtthree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtthree.setText("3");
        txtthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthreeActionPerformed(evt);
            }
        });

        txtfour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfour.setText("4");
        txtfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfourActionPerformed(evt);
            }
        });

        txtfive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfive.setText("5");
        txtfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiveActionPerformed(evt);
            }
        });

        txtsix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsix.setText("6");
        txtsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsixActionPerformed(evt);
            }
        });

        txtseven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtseven.setText("7");
        txtseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsevenActionPerformed(evt);
            }
        });

        txteight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txteight.setText("8");
        txteight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteightActionPerformed(evt);
            }
        });

        txtnine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnine.setText("9");
        txtnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnineActionPerformed(evt);
            }
        });

        txtzero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtzero.setText("0");
        txtzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzeroActionPerformed(evt);
            }
        });

        txtExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtExit.setText("Exit");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtseven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txteight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtzero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtthree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttwo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthree, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfour, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txtfive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtseven, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txteight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtzero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DashBoardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DashBoardKeyTyped
             char iNumber = evt.getKeyChar() ;
      if(!(Character.isDigit(iNumber))
    || (iNumber == KeyEvent.VK_BACK_SPACE)
    || (iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    
    }//GEN-LAST:event_DashBoardKeyTyped

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
  bothnum = Double.parseDouble(DashBoard.getText());
  int age = 18;
       if(bothnum >= age ){
           JOptionPane.showMessageDialog(null, "you are welcome to JBX club");
       }else{
                     JOptionPane.showMessageDialog(null, "you are under age to enter this club");
 
       }
    }//GEN-LAST:event_EnterActionPerformed

    private void txtoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoneActionPerformed
String Enternumber = DashBoard.getText() + txtone.getText();
        DashBoard.setText(Enternumber);

    }//GEN-LAST:event_txtoneActionPerformed

    private void txttwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttwoActionPerformed
String Enternumber = DashBoard.getText() + txttwo.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txttwoActionPerformed

    private void txtthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthreeActionPerformed
String Enternumber = DashBoard.getText() + txtthree.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtthreeActionPerformed

    private void txtfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfourActionPerformed
String Enternumber = DashBoard.getText() + txtfour.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtfourActionPerformed

    private void txtfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiveActionPerformed
String Enternumber = DashBoard.getText() + txtfive.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtfiveActionPerformed

    private void txtsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsixActionPerformed
String Enternumber = DashBoard.getText() + txtsix.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtsixActionPerformed

    private void txtsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsevenActionPerformed
String Enternumber = DashBoard.getText() + txtseven.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtsevenActionPerformed

    private void txteightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteightActionPerformed
String Enternumber = DashBoard.getText() + txteight.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txteightActionPerformed

    private void txtnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnineActionPerformed
String Enternumber = DashBoard.getText() + txtnine.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtnineActionPerformed

    private void txtzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzeroActionPerformed
String Enternumber = DashBoard.getText() + txtzero.getText();
        DashBoard.setText(Enternumber);    }//GEN-LAST:event_txtzeroActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
      DashBoard.setText("");
    }//GEN-LAST:event_ResetActionPerformed
 private JFrame frame;
    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
frame = new JFrame("Exit");
if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "student Result System",
JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
System.exit(0);
}    }//GEN-LAST:event_txtExitActionPerformed

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
            java.util.logging.Logger.getLogger(ClubeEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClubeEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClubeEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClubeEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClubeEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DashBoard;
    private javax.swing.JButton Enter;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtExit;
    private javax.swing.JButton txteight;
    private javax.swing.JButton txtfive;
    private javax.swing.JButton txtfour;
    private javax.swing.JButton txtnine;
    private javax.swing.JButton txtone;
    private javax.swing.JButton txtseven;
    private javax.swing.JButton txtsix;
    private javax.swing.JButton txtthree;
    private javax.swing.JButton txttwo;
    private javax.swing.JButton txtzero;
    // End of variables declaration//GEN-END:variables
}