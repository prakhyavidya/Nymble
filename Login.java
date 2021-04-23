import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.awt.*;
import javax.swing.filechooser.FileSystemView;
import java.util.StringTokenizer;
import java.net.InetAddress;
import java.rmi.Naming;
import java.util.Date;
import java.util.Vector;
import java.util.Random;
public class Login extends javax.swing.JFrame 
{
	    RMISIntf ref;
	   JOptionPane op;
	    Vector v= new Vector(2);
	    String sss=null;
		static String username;

    /** Creates new form Login */

	    public Login()
	 {
	        initComponents();
    	 }
  
  	  private void initComponents() 
		{
		
        	         jPan = new javax.swing.JPanel();
	         jLabel1 = new javax.swing.JLabel();
	        user = new javax.swing.JTextField();
	        jLabel2 = new javax.swing.JLabel();
	        submit = new javax.swing.JButton();
	        reset = new javax.swing.JButton();
	        exit = new javax.swing.JButton();
	        pass = new javax.swing.JPasswordField();
	        jLabel3 = new javax.swing.JLabel();
	       op=new JOptionPane();
	       getContentPane().setLayout(null);
	
       	       jPanel1 = new javax.swing.JPanel();
	       listres = new javax.swing.JList();
	        jLab = new javax.swing.JLabel();
	        download = new javax.swing.JButton();
	        resArea = new TextArea();
	        save = new javax.swing.JButton();

	        getContentPane().setLayout(null);
			getContentPane().setBackground(new Color(200,40,50));

	        addWindowListener(new java.awt.event.WindowAdapter() 
		{
		            public void windowClosing(java.awt.event.WindowEvent evt) 
			{
	
                		exitForm(evt);
	
            			}
		  });

	        jPan.setLayout(null);

	        jPan.setBackground(new java.awt.Color(200, 113, 181));
	        jPan.setBorder(new javax.swing.border.EtchedBorder());
	        jLab.setFont(new java.awt.Font("Arial", 0, 14));
	        jLab.setText("User ID:");
	        jPan.add(jLab);
	        jLab.setBounds(40, 40, 90, 30);

	        jPan.add(user);
	        user.setBounds(140, 40, 100, 30);

	        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
	        jLabel2.setText("Password:");
	        jPan.add(jLabel2);
	        jLabel2.setBounds(40, 90, 90, 30);

	        submit.setBackground(new java.awt.Color(204, 204, 255));
	        submit.setFont(new java.awt.Font("Arial", 0, 14));
	        submit.setForeground(new java.awt.Color(0, 0, 153));
	        submit.setText("Submit");

	        submit.addActionListener(new java.awt.event.ActionListener() 
		{
		        public void actionPerformed(java.awt.event.ActionEvent evt)
			 {
			                submitActionPerformed(evt);
           			 }
        		});

	        jPan.add(submit);
	        submit.setBounds(20, 150, 80, 27);

	        reset.setBackground(new java.awt.Color(204, 204, 255));
	        reset.setFont(new java.awt.Font("Arial", 0, 14));
	        reset.setForeground(new java.awt.Color(0, 0, 153));
	        reset.setLabel("Reset");

	        reset.addActionListener(new java.awt.event.ActionListener()
		 {
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
		                resetActionPerformed(evt);
            			}
        		});

	        jPan.add(reset);
	        reset.setBounds(120, 150, 80, 27);

	        exit.setBackground(new java.awt.Color(204, 204, 255));
	        exit.setFont(new java.awt.Font("Arial", 0, 14));
	        exit.setForeground(new java.awt.Color(0, 0, 153));
	        exit.setLabel("Exit");
	        exit.addActionListener(new java.awt.event.ActionListener() 
		{
	            		public void actionPerformed(java.awt.event.ActionEvent evt) 
				{
			                exitActionPerformed(evt);
           				 }
		  });

	        jPan.add(exit);
	        exit.setBounds(220, 150, 70, 27);

	        jPan.add(pass);
	        pass.setBounds(140, 91, 100, 30);

	        getContentPane().add(jPan);
	        jPan.setBounds(250, 140, 320, 200);

	        jLabel3.setFont(new java.awt.Font("Arial", 0, 24));
	        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel3.setText("Nymble: Blocking Misbehaving Users in Anonymizing Networks");
			jLabel3.setFont(new java.awt.Font("Arial", 0, 18));
	        getContentPane().add(jLabel3);
	        jLabel3.setBounds(100, 30, 570, 30);
		

	        pack();

	        jPanel1.setLayout(null);

	        jPanel1.setBorder(new javax.swing.border.EtchedBorder());
	        listres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	        jPanel1.add(listres);
	        listres.setBounds(10, 60, 150, 220);

	        jLabel1.setFont(new java.awt.Font("Arial", 0, 15));
	        jLabel1.setText("Resources Available:");
	        jPanel1.add(jLabel1);
	        jLabel1.setBounds(10, 10, 180, 40);

	        download.setBackground(new java.awt.Color(204, 204, 254));
	        download.setFont(new java.awt.Font("Arial", 0, 15));
	        download.setText("Access File..");
	
	        download.addActionListener(new java.awt.event.ActionListener() 
		{
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
			                downloadActionPerformed(evt);
            			}
		   });

	        jPanel1.add(download);
	        download.setBounds(180, 60, 140, 27);
	
	        getContentPane().add(jPanel1);
	        jPanel1.setBounds(20, 70, 340, 300);
	
	
	        getContentPane().add(resArea);
	        resArea.setBounds(400, 90, 240, 250);

	        save.setBackground(new java.awt.Color(204, 204, 254));
	        save.setFont(new java.awt.Font("Arial", 0, 15));
	        save.setText("Save");
	        save.addActionListener(new java.awt.event.ActionListener() 
		{
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{

		                saveActionPerformed(evt);
				
            			}
        		});

	        getContentPane().add(save);
	        save.setBounds(470, 370, 70, 27);
	       resArea.setVisible(false);
	       save.setVisible(false);
       
	        jPanel1.setVisible(false);
	        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
	
    	}
	//GEN-END:initComponents

	    private void exitActionPerformed(java.awt.event.ActionEvent evt)
		 {
		//GEN-FIRST:event_exitActionPerformed
	
		          System.exit(0);
		    }


	    private void resetActionPerformed(java.awt.event.ActionEvent evt) 
		{
		//GEN-FIRST:event_resetActionPerformed

		        user.setText("");
		        pass.setText("");
		    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) 
	{
	try
	{

		ref= (RMISIntf)Naming.lookup("rmi://"+"127.0.0.1"+"/RMIServer");
		//System.out.println(ref.res("sdsd","dsa"));


if(user.getText().trim().equals(""))
			{
			   op.showConfirmDialog(this,"Enter The User Name","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
			   user.grabFocus();
			}
	else
	{
			   if(pass.getText().trim().equals(""))
			   	{
	                            		 op.showConfirmDialog(this,"Enter The PassWord","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
				 pass.grabFocus();
				 }
			else
			{
				InetAddress Address = InetAddress.getLocalHost();	
				String c =Address.getHostAddress();
				ref= (RMISIntf)Naming.lookup("rmi://"+"127.0.0.1"+"/RMIServer");
					String ss=ref.CliDet(user.getText(),pass.getText(),c);
					if(ss.equals("notok"))
					{
					op.showConfirmDialog(this,"UnAuthorised User","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
					user.grabFocus();
					}

else
{

username=user.getText();
String key=(String)JOptionPane.showInputDialog(this,"Enter your Key:");
ref=(RMISIntf)Naming.lookup("rmi://"+"127.0.0.1"+"/RMIServer");
String status=ref.CliDet_key(user.getText(),key);
	if(status.equals("ok"))
	{
	
	username=user.getText();	
	//getContentPane().remove(jPan);//.visible(false);
	jPan.setVisible(false);
	jPanel1.setVisible(true);
	resArea.setVisible(true);
	save.setVisible(true);
	StringTokenizer token=new StringTokenizer(ss,";");
	while(token.hasMoreTokens())
	{
	String nextToken = token.nextToken();
	v.addElement(nextToken);
	System.out.println(nextToken);
	}
	listres.setListData(v);	
	}///inner if
	
	
	else
	{
	op.showConfirmDialog(this,"UnAuthorised User","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
					user.grabFocus();
	}
}

}
		
		}
	
	}catch(Exception e){System.out.println(e);}



    }

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) 
		{
		        

	               sss=(String)listres.getSelectedValue();
	               System.out.println(sss);
		int ch=0;
		try{
			InetAddress Address = InetAddress.getLocalHost();	
			String c =Address.getHostAddress();	
			/////////////////////////////////////////////////////

			String aa[]=new String[4];
			ref= (RMISIntf)Naming.lookup("rmi://"+"127.0.0.1"+"/RMIServer");
		/////////////////////////
		String chh=ref.checkipp(c,sss);
		StringTokenizer st=new StringTokenizer(chh,";");
		String ipp=null;
		String opp=null;
		//while(st.hasMoreTokens()) {
	
			 ipp=st.nextToken();
			System.out.println(ipp+"hai");

			opp=st.nextToken();
			System.out.println(opp);
		
			//}			
			

		String optiontest="null";	
			if(ipp.equals("ok")||opp.equals("true"))
			{
			optiontest="true";
						
			String a=(String)JOptionPane.showInputDialog(this,"Enter your password:");
				aa[0]=a;
				a=(String)JOptionPane.showInputDialog(this,"Enter your  correct password:");
				aa[1]=a;
				a=(String)JOptionPane.showInputDialog(this,"Enter correct password:");	
				aa[2]=a;
				System.out.println(aa[0]+aa[1]);
				aa[3]=new Date().toString();
			ref.store(aa,c,username,sss);
			JOptionPane.showMessageDialog (null, "IP Blocked & you are Misbehaving User &you Can't Access Nymble web Page & Cant downlod the file", "you Can't Access Nymble web Page", JOptionPane.ERROR_MESSAGE);
			}
/////////change
			String ssss=ref.res(sss,c,optiontest);
			/********File ss=ref.res(sss,c,);
				
                	        //File file = new File(ss);
	                	FileInputStream in = new FileInputStream(ss);
	                	int i = in.available();
			char st[]=new char[i];
			int j =0;                 			
			while((ch=in.read())!=-1) 
				{
					st[j] = (char) ch;
					j++;
				}
		                   String str=new String(st);
			   resArea.setText(str);
					***********/		
				System.out.println("new	"+ssss);
			    resArea.setText(ssss);
			Logged1 l1=new Logged1();
		    l1.show();


  		} catch(Exception e) 
			{
			 System.out.println(e);      
			}
        
    }


    private void saveActionPerformed(java.awt.event.ActionEvent evt) 
		{
			//GEN-FIRST:event_saveActionPerformed

		try {
			FileDialog fd=new FileDialog(this,"File Store", FileDialog.SAVE);
			fd.setVisible(true);
			String f= fd.getFile();
			fd.setFile(f); // Filename filter
			fd.setDirectory("."); // Current directory
			
			//fd.show();
			FileOutputStream out=new FileOutputStream(f);	
			String s=resArea.getText();
			System.out.println(s);
			byte b[]=s.getBytes();
			out.write(b);
		} catch(Exception e)
			{
			System.out.println(e);
			}
    }
    
    /** Exit the Application */

    private void exitForm(java.awt.event.WindowEvent evt)
	 {
	//GEN-FIRST:event_exitForm
	        System.exit(0);
    	}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	JFrame jf1=new Login();
	 jf1.setResizable(false);
	 jf1.setSize(680,500);
	 jf1.setTitle("Nymble: User Login");
	jf1.show();


    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPan;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField user;
    private javax.swing.JButton download;
    private javax.swing.JLabel jLab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList listres;
    private java.awt.TextArea resArea;
    private javax.swing.JButton save;

    // End of variables declaration//GEN-END:variables
    
}

