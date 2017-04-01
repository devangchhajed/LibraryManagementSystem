import AppPackage.AnimationClass;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devang Chhajed
 */
public final class Adminpanel extends javax.swing.JFrame {
String usna;
    
    /**
     * Creates new form Adminpanel
     */
    public Adminpanel() {        
        initComponents();
     updat();
        datetime();        
  this.setIconImage(new ImageIcon(getClass().getResource("ico.png")).getImage());
         
    }
    
    
    
    
        public void updat(){
          
        Toolkit toolkit = Toolkit.getDefaultToolkit();
Image img = toolkit.getImage("cur1.png");
Point point = new Point(0,0);
        Cursor cursor=toolkit.createCustomCursor(img, point, "Cursor"); 
   setCursor(cursor);
        
            
            
  main1 ob = new main1();
   jLabel3.setText(ob.vusnam+"");
   jLabel5.setText(ob.vusnam+"");
   userlabel.setText(ob.vusnam+"");
   System.out.print(ob.vusnam+"");  
   
  
    
          
        try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "select * from admina where UserID=\""+ob.vusid+"\"";
ResultSet rs=s.executeQuery(q);
rs.first();
pic=rs.getString("photo");
            ImageIcon image = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect = picLabel1.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image = new ImageIcon(scaledImage);
            picLabel1.setIcon(image);
            
             ImageIcon image1 = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect1 = picLabel.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage1= image1.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image1 = new ImageIcon(scaledImage);
            picLabel.setIcon(image);
          
            
             
             ImageIcon image2 = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect2 = userpic.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage2= image2.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image1 = new ImageIcon(scaledImage);
            userpic.setIcon(image);

}catch(Exception e){
   
}
                                                                                           }
        private static final String VOICENAME="kevin16";

    public Adminpanel(String user) {
        usna=user;
        initComponents();
    }

     
     
public void datetime(){
    
    logout.setVisible(false);
    editpro.setVisible(false);
    editpro1.setVisible(false);
    
                        startmen.setVisible(false);
    Calendar cal=new GregorianCalendar();
    int m=cal.get(Calendar.MONTH);
    int y=cal.get(Calendar.YEAR);
    int d=cal.get(Calendar.DAY_OF_MONTH);
    date.setText("Date : "+d+"/"+(m+1)+"/"+y);
    
    
    int sec=cal.get(Calendar.SECOND);
    int min2=cal.get(Calendar.MINUTE);
    int hr=cal.get(Calendar.HOUR);
    int mm=cal.get(Calendar.AM);
    String mmm;
    if (mm==0)
        mmm="AM";
    else
        mmm="PM";
    time.setText("Time : "+hr+"-"+min2+"-"+sec+" "+mmm);
    
    
    Thread clock;
        clock = new Thread(){
    @Override
    
    
    @SuppressWarnings("SleepWhileInLoop")
    public void run(){
         for(;;){

         Calendar cal=new GregorianCalendar();
         int m=cal.get(Calendar.MONTH);
         int y=cal.get(Calendar.YEAR);
         int d=cal.get(Calendar.DAY_OF_MONTH);
         String month;

         date.setText("Date : "+d+"/"+(m+1)+"/"+y);
   
   
         int sec=cal.get(Calendar.SECOND);
         int min=cal.get(Calendar.MINUTE);
         int hr=cal.get(Calendar.HOUR);
         int mm=cal.get(Calendar.AM_PM);
         String mmm;
         if (mm==0)
             mmm="AM";
         else
             mmm="PM";
         time.setText("Time : "+hr+"-"+min+"-"+sec+" "+mmm);  
             try {
                 sleep(1000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
   
   }
   };
    clock.start();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Useracc = new javax.swing.JFrame();
        FrameBar2 = new javax.swing.JLabel();
        UploadBtn = new javax.swing.JButton();
        userid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        secque = new javax.swing.JTextField();
        secans = new javax.swing.JTextField();
        badgePanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        savebutton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        credit = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dateandtime = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        badgePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        picLabel1 = new javax.swing.JLabel();
        editpro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editpro1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        startmen = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        userpic = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        FrameBar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        loginhistory = new javax.swing.JLabel();
        importdatabase = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search123 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        addbook1 = new javax.swing.JLabel();
        addbook = new javax.swing.JLabel();
        tablename = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        dockcalc = new javax.swing.JLabel();
        dockkeyboard = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        dockdeveloper = new javax.swing.JLabel();
        dock = new javax.swing.JLabel();
        starticon = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        docknotepad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        Useracc.setMinimumSize(new java.awt.Dimension(565, 411));
        Useracc.setUndecorated(true);
        Useracc.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FrameBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        FrameBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameBar2MousePressed(evt);
            }
        });
        FrameBar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameBar2MouseDragged(evt);
            }
        });
        Useracc.getContentPane().add(FrameBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        UploadBtn.setText("Upload");
        UploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadBtnActionPerformed(evt);
            }
        });
        Useracc.getContentPane().add(UploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 94, -1));

        userid.setEditable(false);
        userid.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Useracc.getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        name.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Useracc.getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        secque.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Useracc.getContentPane().add(secque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        secans.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Useracc.getContentPane().add(secans, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 20));

        badgePanel1.setForeground(new java.awt.Color(102, 255, 102));
        badgePanel1.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Administrator");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");

        picLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/guest.png"))); // NOI18N

        javax.swing.GroupLayout badgePanel1Layout = new javax.swing.GroupLayout(badgePanel1);
        badgePanel1.setLayout(badgePanel1Layout);
        badgePanel1Layout.setHorizontalGroup(
            badgePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(badgePanel1Layout.createSequentialGroup()
                .addGroup(badgePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(badgePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(badgePanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(badgePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        badgePanel1Layout.setVerticalGroup(
            badgePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(badgePanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );

        Useracc.getContentPane().add(badgePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, 190));

        savebutton1.setText("Save");
        savebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebutton1ActionPerformed(evt);
            }
        });
        Useracc.getContentPane().add(savebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 90, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Useracc.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/useracc.PNG"))); // NOI18N
        Useracc.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        credit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/credits.PNG"))); // NOI18N
        credit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        credit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                creditMouseReleased(evt);
            }
        });
        getContentPane().add(credit);
        credit.setBounds(1320, 340, 220, 280);

        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Administrator Account");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(690, 20, 106, 14);

        dateandtime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dateandtime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateandtimeMouseClicked(evt);
            }
        });
        getContentPane().add(dateandtime);
        dateandtime.setBounds(1110, 620, 260, 30);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(1330, 0, 30, 30);

        badgePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        badgePanel.setOpaque(false);
        badgePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                badgePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                badgePanelMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Administrator");

        picLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/guest.png"))); // NOI18N
        picLabel1.setAlignmentX(0.1F);
        picLabel1.setAlignmentY(0.6F);

        javax.swing.GroupLayout badgePanelLayout = new javax.swing.GroupLayout(badgePanel);
        badgePanel.setLayout(badgePanelLayout);
        badgePanelLayout.setHorizontalGroup(
            badgePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(badgePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(badgePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(badgePanelLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        badgePanelLayout.setVerticalGroup(
            badgePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, badgePanelLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(badgePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(badgePanelLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        getContentPane().add(badgePanel);
        badgePanel.setBounds(1240, 60, 100, 130);

        editpro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editproMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editproMouseEntered(evt);
            }
        });
        getContentPane().add(editpro);
        editpro.setBounds(1250, 210, 80, 20);

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 30, 110, 80);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(840, 290, 80, 70);

        editpro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editpro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editpro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editpro1MouseEntered(evt);
            }
        });
        getContentPane().add(editpro1);
        editpro1.setBounds(1250, 243, 60, 20);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/dropmenu.PNG"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(1227, 45, 130, 240);

        startmen.setOpaque(false);
        startmen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/notepad.gif"))); // NOI18N
        jLabel21.setText("            Add New Book Record");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel21MouseReleased(evt);
            }
        });
        startmen.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 215, 24));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/notepad.gif"))); // NOI18N
        jLabel16.setText("                                 Notepad");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel16MouseReleased(evt);
            }
        });
        startmen.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 215, 24));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/about.png"))); // NOI18N
        jLabel15.setText("                                   About");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel15MouseReleased(evt);
            }
        });
        startmen.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/database.gif"))); // NOI18N
        jLabel14.setText("                    Import Database");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });
        startmen.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 205, 20));

        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        startmen.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 130, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/home.png"))); // NOI18N
        startmen.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/developer.png"))); // NOI18N
        jLabel22.setText("                               Developer");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel22MouseReleased(evt);
            }
        });
        startmen.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 24));

        userpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/guest.png"))); // NOI18N
        userpic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpicMouseClicked(evt);
            }
        });
        startmen.add(userpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 80, 80));

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userlabel.setText("Admin");
        startmen.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 90, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/calc.png"))); // NOI18N
        jLabel20.setText("                          Login History");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel20MouseReleased(evt);
            }
        });
        startmen.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 215, 24));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/keyboard1.png"))); // NOI18N
        jLabel19.setText("              On-Screen Keyboard");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel19MouseReleased(evt);
            }
        });
        startmen.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 215, 24));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/notepad.gif"))); // NOI18N
        jLabel18.setText("                                     E-mail");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
        });
        startmen.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 215, 24));

        start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/menu.png"))); // NOI18N
        startmen.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 380));

        getContentPane().add(startmen);
        startmen.setBounds(-10, 220, 370, 400);

        FrameBar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        FrameBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameBarMousePressed(evt);
            }
        });
        FrameBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameBarMouseDragged(evt);
            }
        });
        getContentPane().add(FrameBar);
        FrameBar.setBounds(0, 0, 1300, 40);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(750, 290, 60, 70);

        developer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        developer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                developerMouseClicked(evt);
            }
        });
        getContentPane().add(developer);
        developer.setBounds(630, 380, 80, 80);

        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about);
        about.setBounds(540, 380, 60, 80);

        loginhistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginhistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginhistoryMouseClicked(evt);
            }
        });
        getContentPane().add(loginhistory);
        loginhistory.setBounds(630, 290, 80, 80);

        importdatabase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importdatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importdatabaseMouseClicked(evt);
            }
        });
        getContentPane().add(importdatabase);
        importdatabase.setBounds(530, 290, 80, 80);

        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(840, 180, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cctv.gif"))); // NOI18N
        jLabel1.setToolTipText("You Are Under Surveillance");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1120, 0, 110, 100);

        search123.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search123MouseClicked(evt);
            }
        });
        getContentPane().add(search123);
        search123.setBounds(740, 180, 80, 80);

        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        getContentPane().add(date);
        date.setBounds(1130, 623, 99, 20);

        addbook1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbook1MouseClicked(evt);
            }
        });
        getContentPane().add(addbook1);
        addbook1.setBounds(630, 180, 80, 80);

        addbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbookMouseClicked(evt);
            }
        });
        getContentPane().add(addbook);
        addbook.setBounds(540, 180, 70, 80);

        tablename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablenameMouseReleased(evt);
            }
        });
        getContentPane().add(tablename);
        tablename.setBounds(50, 210, 140, 50);

        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        getContentPane().add(min);
        min.setBounds(1300, 0, 30, 30);

        dockcalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dockcalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dockcalcMouseClicked(evt);
            }
        });
        getContentPane().add(dockcalc);
        dockcalc.setBounds(600, 560, 40, 40);

        dockkeyboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dockkeyboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dockkeyboardMouseClicked(evt);
            }
        });
        getContentPane().add(dockkeyboard);
        dockkeyboard.setBounds(650, 560, 60, 40);

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/panel.png"))); // NOI18N
        getContentPane().add(panel);
        panel.setBounds(440, 150, 560, 360);

        dockdeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dockdeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dockdeveloperMouseClicked(evt);
            }
        });
        getContentPane().add(dockdeveloper);
        dockdeveloper.setBounds(830, 560, 40, 40);

        dock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dock.PNG"))); // NOI18N
        dock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dockMouseClicked(evt);
            }
        });
        getContentPane().add(dock);
        dock.setBounds(485, 506, 440, 170);

        starticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/log2.png"))); // NOI18N
        starticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                starticonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                starticonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                starticonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                starticonMouseReleased(evt);
            }
        });
        getContentPane().add(starticon);
        starticon.setBounds(10, 590, 70, 60);

        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time");
        getContentPane().add(time);
        time.setBounds(1240, 623, 109, 20);

        titlebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBarx.png"))); // NOI18N
        getContentPane().add(titlebar);
        titlebar.setBounds(0, -35, 1366, 200);

        docknotepad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docknotepad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docknotepadMouseClicked(evt);
            }
        });
        getContentPane().add(docknotepad);
        docknotepad.setBounds(550, 560, 40, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/back.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1367, 650);

        setSize(new java.awt.Dimension(1365, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
main1 ob = new main1();
        
         Calendar cal=new GregorianCalendar();
         int m=cal.get(Calendar.MONTH);
         int y=cal.get(Calendar.YEAR);
         int d=cal.get(Calendar.DAY_OF_MONTH);
         String month;

        String date=y+"-"+(m+1)+"-"+d;
   
   
         int sec=cal.get(Calendar.SECOND);
         int min=cal.get(Calendar.MINUTE);
         int hr=cal.get(Calendar.HOUR);
         int mm=cal.get(Calendar.AM_PM);
         String mmm;
         if (mm==0)
             mmm="AM";
         else
             mmm="PM";
         String time=+hr+"-"+min+"-"+sec+" "+mmm;  
       
       
       
       
       
       try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "insert into history values(\""+date+"\" , \""+ob.vusid+"\" , \""+ob.vusnam+"\" , \""+time+"\" , \" Loggged Out \" )";
int rs=s.executeUpdate(q);
       
       }catch(Exception e){}
       
        JOptionPane.showMessageDialog(null,"System Shuting Down..\nGud Bye "+ob.vusnam+"\nPress OK to Continue");
       try {
 // Open an audio input stream.
 URL url = this.getClass().getClassLoader().getResource("Sound/prog terminated.wav");
 AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
 // Get a sound clip resource.
 Clip clip = AudioSystem.getClip();
 // Open audio clip and load samples from the audio input stream.
 clip.open(audioIn);
 clip.start();
 } catch (Exception e1) {
 e1.printStackTrace();
 } 
        
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
 try {
 // Open an audio input stream.
 URL url = this.getClass().getClassLoader().getResource("Sound/hibernation activated.wav");
 AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
 // Get a sound clip resource.
 Clip clip = AudioSystem.getClip();
 // Open audio clip and load samples from the audio input stream.
 clip.open(audioIn);
 clip.start();
 } catch (Exception e1) {
 e1.printStackTrace();
 } 
        this.setState(Main.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_minMouseClicked

    private void starticonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starticonMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/BackgroundImages/log.png"));

        starticon.setIcon(ii);

        // TODO add your handling code here:
    }//GEN-LAST:event_starticonMouseEntered

    private void starticonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starticonMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/BackgroundImages/log2.png"));

        starticon.setIcon(ii);

        // TODO add your handling code here:
    }//GEN-LAST:event_starticonMouseExited

    private void starticonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starticonMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/BackgroundImages/log2.png"));

        starticon.setIcon(ii);

        // TODO add your handling code here:
    }//GEN-LAST:event_starticonMousePressed

    private void starticonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starticonMouseReleased

        if(startmen.isVisible())
        {
            startmen.setVisible(false);
            ImageIcon ii = new ImageIcon(getClass().getResource("/BackgroundImages/log.png"));
            starticon.setIcon(ii);
        }
        else
        {
            startmen.setVisible(true);

            ImageIcon ii = new ImageIcon(getClass().getResource("/BackgroundImages/log2.png"));
            starticon.setIcon(ii); }

        // TODO add your handling code here:
    }//GEN-LAST:event_starticonMouseReleased

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
         try
        {
            Process p;
            String sysroot = System.getenv("SystemRoot");
            p = Runtime.getRuntime().exec("cmd /c " + sysroot + "/system32/Notepad.exe");
        }
        catch (Exception ex)
        {

        }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseReleased

    private void jLabel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseReleased
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseReleased

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        dataimp s=new dataimp();
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
main1 ob = new main1();
        
         Calendar cal=new GregorianCalendar();
         int m=cal.get(Calendar.MONTH);
         int y=cal.get(Calendar.YEAR);
         int d=cal.get(Calendar.DAY_OF_MONTH);
         String month;

        String date=y+"-"+(m+1)+"-"+d;
   
   
         int sec=cal.get(Calendar.SECOND);
         int min=cal.get(Calendar.MINUTE);
         int hr=cal.get(Calendar.HOUR);
         int mm=cal.get(Calendar.AM_PM);
         String mmm;
         if (mm==0)
             mmm="AM";
         else
             mmm="PM";
         String time=+hr+"-"+min+"-"+sec+" "+mmm;  
       
       
       
       
       
       try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "insert into history values(\""+date+"\" , \""+ob.vusid+"\" , \""+ob.vusnam+"\" , \""+time+"\" , \" Loggged Out \" )";
int rs=s.executeUpdate(q);
       
       }catch(Exception e){}
       
        try {
 // Open an audio input stream.
 URL url = this.getClass().getClassLoader().getResource("Sound/shutting down.wav");
 AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
 // Get a sound clip resource.
 Clip clip = AudioSystem.getClip();
 // Open audio clip and load samples from the audio input stream.
 clip.open(audioIn);
 clip.start();
 } catch (Exception e1) {
 e1.printStackTrace();
 } 
        
        Runtime runtime = Runtime.getRuntime();
        try {
            Process proc = runtime.exec("shutdown -s -t 0");

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(Adminpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseReleased
     history s=new history();
     s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseReleased

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        try
        {
            Process p;
            String sysroot = System.getenv("SystemRoot");
            p = Runtime.getRuntime().exec("cmd /c " + sysroot + "/system32/osk.exe");
        }
        catch (Exception ex)
        {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseReleased

    private void userpicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpicMouseClicked
main1 ob = new main1();
    String nn1, sq1, sa1;   
        try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "select * from admina where UserID=\""+ob.vusid+"\"";
ResultSet rs=s.executeQuery(q);
rs.first();
nn1=rs.getString("Name");
sq1=rs.getString("SecQue");
sa1=rs.getString("SecAns");

userid.setText(ob.vusid+"");
name.setText(nn1+"");
secque.setText(sq1+"");
secans.setText(sa1+"");



}catch(Exception e){
}
        
        Useracc.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_userpicMouseClicked

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
Email s=new Email();
s.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseReleased

    private void dockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dockMouseClicked

    private void dockcalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dockcalcMouseClicked
        try
        {
            Process p;
            String sysroot = System.getenv("SystemRoot");
            p = Runtime.getRuntime().exec("cmd /c " + sysroot + "/system32/calc.exe");
        }
        catch (Exception ex)
        {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_dockcalcMouseClicked

    private void docknotepadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docknotepadMouseClicked
        Runtime runtime = Runtime.getRuntime();
        try {
            Process proc = runtime.exec("notepad");

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(Adminpanel.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_docknotepadMouseClicked

    private void dockkeyboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dockkeyboardMouseClicked
        try
        {
            Process p;
            String sysroot = System.getenv("SystemRoot");
            p = Runtime.getRuntime().exec("cmd /c " + sysroot + "/system32/osk.exe");
        }
        catch (Exception ex)
        {

        }           // TODO add your handling code here:
    }//GEN-LAST:event_dockkeyboardMouseClicked

    private void dockdeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dockdeveloperMouseClicked
  Email s=new Email();
s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_dockdeveloperMouseClicked
int xMouse, yMouse;
    private void FrameBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameBarMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_FrameBarMousePressed

    private void FrameBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameBarMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();

        this.setLocation(x-xMouse, y-yMouse);

        // TODO add your handling code here:
    }//GEN-LAST:event_FrameBarMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
int reg;
    private void tablenameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenameMouseReleased

      

        // TODO add your handling code here:
    }//GEN-LAST:event_tablenameMouseReleased
 String path;
    private void jLabel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseReleased
insert s=new insert();
s.setVisible(true);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseReleased

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
about s=new about();
s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbookMouseClicked
insert s=new insert();
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_addbookMouseClicked

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
        developer s=new developer();
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseReleased

    private void badgePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badgePanelMouseEntered
logout.setVisible(true);
    editpro.setVisible(true);
    editpro1.setVisible(true);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_badgePanelMouseEntered

    private void editproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editproMouseClicked
main1 ob = new main1();
    String nn1, sq1, sa1, pic;   
        try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "select * from admina where UserID=\""+ob.vusid+"\"";
ResultSet rs=s.executeQuery(q);
rs.first();
nn1=rs.getString("Name");
sq1=rs.getString("SecQue");
sa1=rs.getString("SecAns");

userid.setText(ob.vusid+"");
name.setText(nn1+"");
secque.setText(sq1+"");
secans.setText(sa1+"");
pic=rs.getString("photo");
if(pic.compareTo("null")==0)
                {    ImageIcon ii = new ImageIcon(getClass().getResource("/Images/bookdef.png"));
     
                        picLabel.setIcon(ii); 
                
                }else{
                 
            ImageIcon image = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect = picLabel.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image = new ImageIcon(scaledImage);
            picLabel.setIcon(image);
                    
                }



}catch(Exception e){
}
        
        Useracc.setVisible(true);
        

  

// TODO add your handling code here:
    }//GEN-LAST:event_editproMouseClicked

    private void editpro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpro1MouseClicked
main1 ob = new main1();
        
         Calendar cal=new GregorianCalendar();
         int m=cal.get(Calendar.MONTH);
         int y=cal.get(Calendar.YEAR);
         int d=cal.get(Calendar.DAY_OF_MONTH);
         String month;

        String date=y+"-"+(m+1)+"-"+d;
   
   
         int sec=cal.get(Calendar.SECOND);
         int min=cal.get(Calendar.MINUTE);
         int hr=cal.get(Calendar.HOUR);
         int mm=cal.get(Calendar.AM_PM);
         String mmm;
         if (mm==0)
             mmm="AM";
         else
             mmm="PM";
         String time=+hr+"-"+min+"-"+sec+" "+mmm;  
       
       
       
       
       
       try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "insert into history values(\""+date+"\" , \""+ob.vusid+"\" , \""+ob.vusnam+"\" , \""+time+"\" , \" Loggged Out \" )";
int rs=s.executeUpdate(q);
       
       }catch(Exception e){}
       
       
        
        
        
        this.dispose();
Login s=new Login();
s.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_editpro1MouseClicked

    private void badgePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badgePanelMouseExited
       // TODO add your handling code here:
    }//GEN-LAST:event_badgePanelMouseExited

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
logout.setVisible(false);
    editpro.setVisible(false);
    editpro1.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseExited

    private void editproMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editproMouseEntered
logout.setVisible(true);
    editpro.setVisible(true);
    editpro1.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_editproMouseEntered

    private void editpro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpro1MouseEntered
logout.setVisible(true);
    editpro.setVisible(true);
    editpro1.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_editpro1MouseEntered
String upath;String pic; 
    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
 main1 ob = new main1();
    
          
        try{
        
Class.forName("java.sql.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
Statement s=conn.createStatement();
String q= "select * from admina where UserID=\""+ob.vusid+"\"";
ResultSet rs=s.executeQuery(q);
rs.first();


pic=rs.getString("photo");


                
            ImageIcon image = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect = picLabel1.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image = new ImageIcon(scaledImage);
            picLabel1.setIcon(image);
            
             ImageIcon image1 = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect1 = picLabel.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage1= image1.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image1 = new ImageIcon(scaledImage);
            picLabel.setIcon(image);
            
            
             
             ImageIcon image2 = new ImageIcon(pic);
            // Get width and height of picLabel
            Rectangle rect2 = userpic.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage2= image2.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image1 = new ImageIcon(scaledImage);
            userpic.setIcon(image);
            
                   
                



}catch(Exception e){
 
}
           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void FrameBar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameBar2MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_FrameBar2MousePressed

    private void FrameBar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameBar2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();

        Useracc.setLocation(x-xMouse, y-yMouse);

        // TODO add your handling code here:
    }//GEN-LAST:event_FrameBar2MouseDragged
File f;
    private void UploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadBtnActionPerformed

        
        // Setting user's Picture folder as the current directory
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home") + System.getProperty("file.separator")+ "Pictures");
        
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // We're not dealing with directories
        chooser.setAcceptAllFileFilterUsed(false); // Disabling 'All Files' Filter
        chooser.setDialogTitle("Choose a photo"); // Setting a custom title for our chooser
        chooser.setApproveButtonText("Upload"); // Replacing 'Open' with 'Upload'
              
        //chooser.setFileHidingEnabled(false);  // Show hidden files        
        //chooser.setMultiSelectionEnabled(true); // Allow multiple selections by pressing CTRL
        
        // Display all directories but only gif, jpg, jpeg or png files.
        chooser.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                return "All supported image formats";
            }

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".png")
                            || f.getName().toLowerCase().endsWith(".jpeg")
                            || f.getName().toLowerCase().endsWith(".jpg")
                            || f.getName().toLowerCase().endsWith(".gif");
                }
            }
        }); 
       
        // Show Dialog and store result in res
        int res = chooser.showOpenDialog(this);
        
        // Revert back to Metal L&F
      
        
        // If user clicked on Upload
        if (res == JFileChooser.APPROVE_OPTION) {            
            File file = chooser.getSelectedFile();
            // Creating ImageIcon out of the selected file
            
             path=file.getAbsolutePath();
            if(path.isEmpty())
                { path="/Images/bookdef.png";

                }
            
            
            ImageIcon image = new ImageIcon(path);
            // Get width and height of picLabel
            Rectangle rect = picLabel.getBounds();
            // Scaling the Image to fit in the picLabel
            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            // Converting the image back to ImageIcon to make it acceptable by picLabel
            image = new ImageIcon(scaledImage);
           picLabel.setIcon(image);
            path=file.getAbsolutePath().replace('\\','/');
            
             
            
            
            
            
            
            
        } else {  // If the user clicked on cancel            JOptionPane.showMessageDialog(this, "Dialog cancelled by the user");

            JOptionPane.showMessageDialog(this, "Dialog cancelled by the user");
        }       
        
        
        
        

    }//GEN-LAST:event_UploadBtnActionPerformed

    private void savebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebutton1ActionPerformed

        
        String user=userid.getText();
        String nam=name.getText();
        String secq=secque.getText();
        String seca=secans.getText();
        String path1=path;
        String disp;

        try{
            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/devangproject","root","");
            Statement s=conn.createStatement();
            String q = "update admina set Name=\""+nam+"\", SecQue=\""+secq+"\", SecAns=\""+seca+"\", photo=\""+path1+"\" where UserID=\""+user+"\"";

            int rs=s.executeUpdate(q);
            if (rs>0)
            JOptionPane.showMessageDialog(null, "Data Updated Successfully..");
            else
            JOptionPane.showMessageDialog(null, "Data Not Updated..");
            Useracc.dispose();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_savebutton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Useracc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addbook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbook1MouseClicked
search s=new search();
s.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addbook1MouseClicked

    private void search123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search123MouseClicked
 search s=new search();
s.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_search123MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
    search s=new search();
s.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

    private void importdatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importdatabaseMouseClicked
  dataimp s=new dataimp();
s.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_importdatabaseMouseClicked

    private void loginhistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginhistoryMouseClicked
    history s=new history();
s.setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_loginhistoryMouseClicked

    private void developerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developerMouseClicked
      developer s=new developer();
s.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_developerMouseClicked

    private void dateandtimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateandtimeMouseClicked
        Clock s=new Clock();
        s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_dateandtimeMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
nuser s=new nuser();
s.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
ruser s=new ruser();
s.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.facebook.com/thevernex"));
        }catch(Exception e){}

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void creditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditMouseReleased

        
        // TODO add your handling code here:
    }//GEN-LAST:event_creditMouseReleased

    private void creditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditMouseEntered
AnimationClass ac=new AnimationClass();

ac.jLabelXLeft(1320, 1144, 7, 2, credit);
        // TODO add your handling code here:
    }//GEN-LAST:event_creditMouseEntered

    private void creditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditMouseExited
AnimationClass ac=new AnimationClass();

ac.jLabelXRight(1144, 1320, 7, 2, credit);
        // TODO add your handling code here:
    }//GEN-LAST:event_creditMouseExited

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
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
      
                new Adminpanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrameBar;
    private javax.swing.JLabel FrameBar2;
    private javax.swing.JButton UploadBtn;
    private javax.swing.JFrame Useracc;
    private javax.swing.JLabel about;
    private javax.swing.JLabel addbook;
    private javax.swing.JLabel addbook1;
    private javax.swing.JPanel badgePanel;
    private javax.swing.JPanel badgePanel1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel credit;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateandtime;
    private javax.swing.JLabel developer;
    private javax.swing.JLabel dock;
    private javax.swing.JLabel dockcalc;
    private javax.swing.JLabel dockdeveloper;
    private javax.swing.JLabel dockkeyboard;
    private javax.swing.JLabel docknotepad;
    private javax.swing.JLabel editpro;
    private javax.swing.JLabel editpro1;
    private javax.swing.JLabel importdatabase;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel loginhistory;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel min;
    private javax.swing.JTextField name;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel picLabel;
    private javax.swing.JLabel picLabel1;
    private javax.swing.JButton savebutton1;
    private javax.swing.JLabel search123;
    private javax.swing.JTextField secans;
    private javax.swing.JTextField secque;
    private javax.swing.JLabel start;
    private javax.swing.JLabel starticon;
    private javax.swing.JPanel startmen;
    private javax.swing.JLabel tablename;
    private javax.swing.JLabel time;
    private javax.swing.JLabel titlebar;
    private javax.swing.JLabel update;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel userlabel;
    private javax.swing.JLabel userpic;
    // End of variables declaration//GEN-END:variables

    private String getString(String publisher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
