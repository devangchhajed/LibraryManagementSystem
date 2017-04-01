import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devang Chhajed
 */
public class Email extends javax.swing.JFrame {

    /**
     * Creates new form Email
     */
    public Email() {
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

        jt2 = new javax.swing.JTextField();
        jt1 = new javax.swing.JTextField();
        jt8 = new javax.swing.JTextField();
        jt7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt4 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt3 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        attachname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gmail E-mail Sender by Devang");
        setMinimumSize(new java.awt.Dimension(650, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jt2);
        jt2.setBounds(180, 230, 420, 30);
        getContentPane().add(jt1);
        jt1.setBounds(180, 190, 420, 30);

        jt8.setEditable(false);
        jt8.setText("@gmail.com");
        jt8.setRequestFocusEnabled(false);
        jt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt8ActionPerformed(evt);
            }
        });
        getContentPane().add(jt8);
        jt8.setBounds(510, 100, 90, 30);

        jt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt7ActionPerformed(evt);
            }
        });
        getContentPane().add(jt7);
        jt7.setBounds(180, 100, 320, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gmail Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 100, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gmail Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 160, 110, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 200, 50, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subject");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 230, 50, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Message");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 290, 60, 20);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 0, 40, 40);

        jt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jt4);
        jt4.setBounds(180, 150, 420, 30);

        jButton2.setText("Choose File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 270, 120, 30);

        jt3.setColumns(20);
        jt3.setRows(5);
        jScrollPane1.setViewportView(jt3);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 310, 420, 180);

        jButton4.setText("Mail It");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 500, 110, 30);
        getContentPane().add(attachname);
        attachname.setBounds(310, 270, 290, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mailback.PNG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 650, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt8ActionPerformed
String attach,filename;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        attach=f.getAbsolutePath();
        filename=f.getName();
attachname.setText(filename);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String to=jt1.getText();
        String subje=jt2.getText();
        String messag=jt3.getText();
        final String user=jt7.getText();
        final String pass=new String (jt4.getPassword());
         
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user,pass);
                }
            });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(user+"@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
                message.setSubject(subje);
                
                MimeBodyPart mbp=new MimeBodyPart();
              mbp.setText(messag);
              Multipart multipart=new MimeMultipart();
              multipart.addBodyPart(mbp);
              mbp=new MimeBodyPart();
              javax.activation.DataSource source=new FileDataSource(attach);
              mbp.setDataHandler(new DataHandler(source));
              mbp.setFileName(filename);
              multipart.addBodyPart(mbp);
              message.setContent(multipart);
              
                Transport.send(message);

                System.out.println("Done");
                JOptionPane.showMessageDialog(null, "Email Sent.:)");

            } catch (MessagingException e) {
                JOptionPane.showMessageDialog(null, e);
                throw new RuntimeException(e);}

            
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt7ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Email().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attachname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextArea jt3;
    private javax.swing.JPasswordField jt4;
    private javax.swing.JTextField jt7;
    private javax.swing.JTextField jt8;
    // End of variables declaration//GEN-END:variables
}
