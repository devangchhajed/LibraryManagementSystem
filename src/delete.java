
import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class delete extends javax.swing.JFrame {

    /**
     * Creates new form delete
     */
    public delete() {
        initComponents();
        update();
    }
public void update(){

    deleteClass ob=new deleteClass();
  try{

            
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
            java.sql.Statement s=conn.createStatement();
            String q= "select * from books where RegNo =\""+ob.tbldel+"\"";
            ResultSet rs=s.executeQuery(q);
            while(rs.next())
            {delname.setText(rs.getString("Name"));
                delauthor.setText(rs.getString("Author"));
                delgenre.setText(rs.getString("Genere"));
                publisher1.setText(rs.getString("Publisher"));
                int tty=rs.getInt("RegNo");
                delregno.setText(tty+"");
                
                
                  String path3=rs.getString("photo");

                if(path3.compareTo("null")==0)
                { path3="/Images/bookdef.png";

                }

                    ImageIcon image = new ImageIcon(path3);
                    // Get width and height of picLabel
                    Image scaledImage = image.getImage().getScaledInstance(200, 240, Image.SCALE_DEFAULT);
                    // Converting the image back to ImageIcon to make it acceptable by picLabel
                    image = new ImageIcon(scaledImage);
                    delphoto.setIcon(image);
                

            }

        }catch(Exception e){
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

        FrameBar1 = new javax.swing.JLabel();
        delregno = new javax.swing.JTextField();
        delname = new javax.swing.JTextField();
        delgenre = new javax.swing.JTextField();
        delauthor = new javax.swing.JTextField();
        delphoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        publisher1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FrameBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        FrameBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameBar1MousePressed(evt);
            }
        });
        FrameBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameBar1MouseDragged(evt);
            }
        });
        getContentPane().add(FrameBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        delregno.setEditable(false);
        getContentPane().add(delregno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 113, 180, 30));

        delname.setEditable(false);
        getContentPane().add(delname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 169, 180, 30));

        delgenre.setEditable(false);
        getContentPane().add(delgenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 225, 180, 30));

        delauthor.setEditable(false);
        delauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delauthorActionPerformed(evt);
            }
        });
        getContentPane().add(delauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 279, 180, 30));
        getContentPane().add(delphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 200, 240));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 40));

        publisher1.setEditable(false);
        getContentPane().add(publisher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 333, 180, 30));

        jButton1.setText("Delete Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/deleteback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        setSize(new java.awt.Dimension(685, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int xMouse, yMouse;
    private void FrameBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameBar1MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_FrameBar1MousePressed

    private void FrameBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameBar1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();

        this.setLocation(x-xMouse, y-yMouse);

        // TODO add your handling code here:
    }//GEN-LAST:event_FrameBar1MouseDragged

    private void delauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delauthorActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    deleteClass ob=new deleteClass();
        int regnum=Integer.parseInt(delregno.getText());
        try {
 // Open an audio input stream.
 URL url = this.getClass().getClassLoader().getResource("Sound/delete.wav");
 AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
 // Get a sound clip resource.
 Clip clip = AudioSystem.getClip();
 // Open audio clip and load samples from the audio input stream.
 clip.open(audioIn);
 clip.start();
 } catch (Exception e) {
 e.printStackTrace();
 } 
       
        int p = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this Record..","Delete",JOptionPane.YES_NO_OPTION);
        if (p==0)
        {
            try{
                Class.forName("java.sql.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
                java.sql.Statement s=conn.createStatement();
                String q= "delete from books where RegNo="+ob.tbldel;

                int rs=s.executeUpdate(q);
                if (rs>0)
                JOptionPane.showMessageDialog(null, "Data Deleted Successfully..");
                else
                JOptionPane.showMessageDialog(null, "Data Not Deleted..");
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, e);
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrameBar1;
    private javax.swing.JTextField delauthor;
    private javax.swing.JTextField delgenre;
    private javax.swing.JTextField delname;
    private javax.swing.JLabel delphoto;
    private javax.swing.JTextField delregno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField publisher1;
    // End of variables declaration//GEN-END:variables
}
