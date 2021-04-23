
 
import java.awt.*;
import java.io.*;
import java.util.Vector;

public class PseudonymManager extends javax.swing.JFrame {
     
    
    
    public PseudonymManager() {
        initComponents();
        
               
    }
    
   
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        download = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
		
        getContentPane().setLayout(null);
		getContentPane().setBackground(new java.awt.Color(104, 174, 254));

        setBackground(new java.awt.Color(0, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(null);
		jPanel1.setBackground(new java.awt.Color(104, 174, 254));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 25));
        jLabel1.setText("");
        //jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 10, 480, 40);
		
		
        
        download.setBackground(new java.awt.Color(204, 204, 254));
        download.setFont(new java.awt.Font("Arial", 0, 18));
        download.setText("Start Pseudonym Manager");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        jPanel1.add(download);
        download.setBounds(200, 100, 320, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 740, 200);

        save.setBackground(new java.awt.Color(204, 174, 254));
        save.setFont(new java.awt.Font("Arial", 0, 18));
        save.setText("Stop Pseudonym Manager");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        getContentPane().add(save);
        save.setBounds(200, 290, 320, 50);
		
		
		

		
       

       
		jLabel2.setFont(new Font("Arial", 0, 25));
        jLabel2.setForeground(new java.awt.Color(222,20, 202));
		jLabel2.setBackground(new java.awt.Color(114, 74, 54));
        jLabel2.setText("Pseudonym Manager");
         getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 30, 270, 40);

        pack();
		setTitle("Nymble_Pseudonym Manager");
		setSize(800,600);
    }
	
	

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        Runtime r = Runtime.getRuntime();
Process p = null;
String cmd = "../nymble/shutdown.bat";
try {
p = r.exec(cmd);

p.waitFor(); 

} catch (Exception e) {
System.out.println("error executing " + cmd);
}
System.out.println(cmd + " returned " + p.exitValue());
        
        
    }
	

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        
               
		Runtime r = Runtime.getRuntime();
Process p = null;
String cmd = "../nymble/startup.bat";
try {
p = r.exec(cmd);

p.waitFor(); 

} catch (Exception e) {
System.out.println("error executing " + cmd);
}
System.out.println(cmd + " returned " + p.exitValue());
        
        
    }
	
	
	 private void browserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        
       
try {



} catch (Exception e) {
System.out.println("error executing browser " + evt);
}    
    }
	
	
	
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }
    
    
    public static void main(String args[]) {
        new PseudonymManager().show();
    }
    
     private javax.swing.JButton download;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
	
    
    
}
