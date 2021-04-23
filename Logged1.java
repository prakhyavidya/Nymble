
 
import java.awt.*;
import java.io.*;
import java.util.Vector;

public class Logged1 extends javax.swing.JFrame {
     
    
    
    public Logged1() {
        initComponents();
        
               
    }
    
   
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        
        jLabel1 = new javax.swing.JLabel();
	    jLabel3 = new javax.swing.JLabel();
		
        
        
		button = new javax.swing.JButton();
        
        jLabel2 = new javax.swing.JLabel();
        url = new  javax.swing.JTextField(20);
        getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(100,33,33));

        setBackground(new java.awt.Color(0, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(null);

        
        jLabel1.setFont(new java.awt.Font("Arial", 0, 25));
        jLabel1.setText("Authorized user Can Access Nymble web page");
         add(jLabel1);
        jLabel1.setBounds(120, 10, 550, 40);
		jLabel1.setForeground(new Color(255,255,255));
		
		jLabel3.setFont(new java.awt.Font("Arial", 0, 25));
        jLabel3.setText("Click Here => Nymble web page");
		jLabel3.setToolTipText("Access Here");
        add(jLabel3);
		jLabel3.setBackground(new java.awt.Color(204, 204, 254));
		jLabel3.setForeground(Color.RED);
        jLabel3.setBounds(200, 350, 480, 40);
         
		
		
        

       // getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 740, 200);

       
		button.setBackground(new java.awt.Color(204, 204, 254));
        button.setFont(new java.awt.Font("Arial", 0, 18));
        button.setText("Open Browser");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserActionPerformed(evt);
            }
        });

		 jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
              if(evt.getClickCount() > 0){
                try {
                        Process pc = Runtime.getRuntime().exec("cmd.exe /c start http://192.168.1.55:8080/nymble_source/");
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                        System.out.println();
                    }
               }
            }
            });
        getContentPane().add(button);
        button.setBounds(470, 170, 290, 50);
		
		add(url);
        url.setBounds(170, 174, 254,50);

       

        jLabel2.setFont(new java.awt.Font("Arial", 0, 22));
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Welcome to  Nymble User Authenticate page");
        jLabel2.setBorder(new javax.swing.border.EtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        add(jLabel2);
        jLabel2.setBounds(150, 70, 440, 40);
		jLabel2.setForeground(Color.red);

        pack();
		setTitle("Web Access");
		setSize(800,600);
    }
	 private void browserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        
       
try {

OpenBrowser.openURL(url.getText().trim());

} catch (Exception e) {
System.out.println("error executing browser " + evt);
}    
    }
	
	
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }
    
    
    public static void main(String args[]) {
        new Logged1().show();
    }
    
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
	private javax.swing.JButton button;
	private javax.swing.JTextField url;
   
    
}
