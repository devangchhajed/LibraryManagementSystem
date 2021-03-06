
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devang Chhajed
 */
public class dataimp extends javax.swing.JFrame {

    /**
     * Creates new form dataimp
     */
    public dataimp() {
        initComponents();
            read();
             this.setIconImage(new ImageIcon(getClass().getResource("ico.png")).getImage());
        Toolkit toolkit = Toolkit.getDefaultToolkit();

Image img = toolkit.getImage("cur1.png");

Point point = new Point(0,0);
        Cursor cursor=toolkit.createCustomCursor(img, point, "Cursor"); 

   setCursor(cursor);
        
    }
    
    void read(){
    try
{
    FileReader reader= new FileReader("src//import database.txt");
    BufferedReader br= new BufferedReader(reader);
    jta.read(br, null);
    br.close();
    jta.requestFocus();
} catch(Exception e) {
JOptionPane.showMessageDialog(null, e);
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Import Database");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 170, 35));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 40, 40));

        jta.setEditable(false);
        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 440, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impdabbg.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        setSize(new java.awt.Dimension(520, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
this.dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
try{
        Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost","root","");
Statement s=conn.createStatement();
String c1="Drop database if exists devangproject";
String c2="create database devangproject";
String c3="use devangproject";

String q1= "create table books( RegNo int(10) primary key, Name varchar(50), Genere varchar(50), Author varchar(50), Publisher varchar(50), EntDate date, EntName varchar(50), photo varchar(200))";
String q2="create table discarded( RegNo int(10) primary key, Name varchar(50), Genere varchar(50), Author varchar(50), Publisher varchar(50), EntDate date, EntName varchar(50), photo varchar(200))";
String q3="create table admina( Name varchar(50), UserID varchar(50) Unique, UserPass varchar(50), SecQue varchar(100), SecAns varchar(100), photo varchar(500))";
String q4="insert into books values(1 ,\"Informatic Pratices\",\"Computers\",\"Sumita Arora\",\"Dhanpat Rai Publi\",null,null,\"null\")";        
String q5="insert into books values(2 ,\"Business Studies\",\"Theory\",\"Unknown\",\"CBSE\",null,null,\"null\")";        
String q6="insert into books values(3 ,\"Accountancy\",\"Accounts\",\"Sumita Arora\",\"Dhanpat Rai Publi\",null,null,\"null\")";
String q7="insert into books values(4 ,\"Economics\",\"Economics\",\"TR Jain\",\"Saraswati Rai Publi\",null,null,\"null\")";
String q8="insert into books values(5 ,\"Moral Science\",\"Moral Values\",\"Private\",\"Golden Rai Publi\",null,null,\"null\")";
String q9="insert into admina values(\"SuperUser\", \"root1\", \"pass\", \"What is your Hobby??\" ,\"Computers\", \"src/Images/devang.png\")";
String q10="insert into admina values(\"Devang\", \"devang1\", \"devang\", \"What is your Hobby??\" ,\"Computers\", \"src/Images/devang.png\")";
String q11="insert into admina values(\"Super User\", \"root\", \"toor\", \"Who are you??\" ,\"superman\", \"src/Images/devang.png\")";
String q12="create table history( ddate date,  UserID varchar(50),  Name varchar(50),  Time varchar(100), Status varchar(50))";


s.executeUpdate(c1);
s.executeUpdate(c2);
s.executeUpdate(c3);
s.executeUpdate(q1);
s.executeUpdate(q2);
s.executeUpdate(q3);
s.executeUpdate(q4);
s.executeUpdate(q5);
s.executeUpdate(q6);
s.executeUpdate(q7);
s.executeUpdate(q8);
s.executeUpdate(q9);
s.executeUpdate(q12);
s.executeUpdate(q11);



int x=s.executeUpdate(q10);
         
          if(x>0)
          { try {
 // Open an audio input stream.
 URL url = this.getClass().getClassLoader().getResource("Sound/data.wav");
 AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
 // Get a sound clip resource.
 Clip clip = AudioSystem.getClip();
 // Open audio clip and load samples from the audio input stream.
 clip.open(audioIn);
 clip.start();
 } catch (Exception e1) {
 e1.printStackTrace();
 } 
              JOptionPane.showMessageDialog(null, "Database Transfer Complete.");}
else
       JOptionPane.showMessageDialog(null, "Database Not Updated.");
         
         }
         catch(Exception e){
         
         JOptionPane.showMessageDialog(null, e);
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(dataimp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataimp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataimp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataimp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataimp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta;
    // End of variables declaration//GEN-END:variables
}
