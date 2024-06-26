package cafe.management.system;

import javax.swing.JOptionPane;
import model.User;
import dao.UserDao;

public class ForgotPassword extends javax.swing.JFrame {
    private String dbAnswer = null;
    private String email = null;
    private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";



    public ForgotPassword() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtSecQue.setEnabled(false);
    }
    
    public void clear(){
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtEmail.setEditable(true);
        txtEmail.setText("");
        txtSecQue.setText("");
        txtAnswer.setText("");
        txtNewPassword.setText("");
        
    }
    
    public void validateEmail(){
        email = txtEmail.getText();
        if(email.matches(emailPattern)){
            btnSearch.setEnabled(true);
        }
        else{
            btnSearch.setEnabled(false);
        }
    }
    
    public void validateFields(){
        String password = txtNewPassword.getText();
        String answer = txtAnswer.getText();
        String securityQuestion = txtSecQue.getText();
        if(!password.equals("") && !answer.equals("") && !securityQuestion.equals("")){
            btnUpdate.setEnabled(true);
        }
        else{
            btnUpdate.setEnabled(false);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSecQue = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        Hide = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("Forgot Password?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Your Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Your Answer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        txtEmail.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 420, -1));

        txtSecQue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtSecQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecQueActionPerformed(evt);
            }
        });
        txtSecQue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecQueKeyReleased(evt);
            }
        });
        getContentPane().add(txtSecQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 420, -1));

        txtAnswer.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 420, -1));

        txtNewPassword.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 420, -1));

        btnSearch.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(102, 51, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 90, 20));

        btnUpdate.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, 90, -1));

        btnClear.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(102, 51, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 90, -1));

        jButton4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 90, -1));

        jButton5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 0));
        jButton5.setText("Signup");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 90, -1));

        jButton6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 0));
        jButton6.setText("Login");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 90, -1));

        Show.setFont(new java.awt.Font("Garamond", 1, 11)); // NOI18N
        Show.setForeground(new java.awt.Color(102, 51, 0));
        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        getContentPane().add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 60, 20));

        Hide.setFont(new java.awt.Font("Garamond", 1, 11)); // NOI18N
        Hide.setForeground(new java.awt.Color(102, 51, 0));
        Hide.setText("Hide");
        Hide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HideActionPerformed(evt);
            }
        });
        getContentPane().add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 60, 20));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("© PBS Café 2024");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 740, 130, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Page_01_edit.PNG"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSecQueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecQueKeyReleased
        validateFields();
    }//GEN-LAST:event_txtSecQueKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        validateFields();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String answer = txtAnswer.getText();
        String newPassword = txtNewPassword.getText();
        if(answer.equals(dbAnswer)){
            UserDao.update(email, newPassword);
            clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect Answer","Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
                email = txtEmail.getText();
        User user = null;
        user = UserDao.getSecurityQuestion(email);
        if(user == null){
            JOptionPane.showMessageDialog(null,"Incorrect Email","Message",JOptionPane.ERROR_MESSAGE); 
        }
        else{
            btnSearch.setEnabled(false);
            txtEmail.setEditable(false);
            dbAnswer = user.getAnswer();
            txtSecQue.setText(user.getSecurityQuestion());
            validateFields();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtSecQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecQueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecQueActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        Show.setVisible(false);
        Hide.setVisible(true);
        txtNewPassword.setEchoChar((char)0);
    }//GEN-LAST:event_ShowActionPerformed

    private void HideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideActionPerformed
        // TODO add your handling code here:
        Show.setVisible(true);
        Hide.setVisible(false);
        txtNewPassword.setEchoChar('*');
    }//GEN-LAST:event_HideActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hide;
    private javax.swing.JButton Show;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtSecQue;
    // End of variables declaration//GEN-END:variables
}
