import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;

class NymbleServer extends JFrame 
{
	 JLabel jl1;
	 JLabel jl2;
	 
	 
	 JButton jb1;
	 JButton jb2;
	 
	 JTextField jt1;
	 JPasswordField jt2;
	 String msg="";
	 
	 
	 Container c;
	 ImageIcon ii;
	 ImageIcon i2;
	 JLabel jl4;
	 JLabel jl6;
	 
	 
	 String str="";
	 String pass="";
	 String path="";
	 String coreaddr="";
	 String core="";
	 String nextcore="";
	 String dest="";
	 String dest1="";
	 File f;
	 File fgs;
	 Vector v = new Vector();

	 NymbleServer()

	 {
		 
		 jl1=new JLabel("Nymble Server Name ");
		 jl2=new JLabel("Server Key ");
		 
		 
		 jb1=new JButton("Send");
		 jb2=new JButton("Reset");
		 
		 jt1=new JTextField(10);
		 jt2=new JPasswordField(10);
		 ii=new ImageIcon("nymbleserver.png");
		 i2=new ImageIcon("nymbleserver1.PNG");
		 jl4=new JLabel(ii);
		 jl6=new JLabel(i2);
		 
		 c = getContentPane();
         c.setLayout(null);
		 c.setBackground(new Color(0,0,120));
		 c.show();
		 c.add(jl1);
		 c.add(jt1);
		 c.add(jl2);
		 c.add(jb1);
		 c.add(jb2);
		 c.add(jl4);
		 c.add(jl6);
		 c.add(jt2);
		 
		    addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
		 
		 
		
		 
		
		 jl4.setBounds(30,20,728,68);
		 jl1.setBounds(20,110,200,25);
		 jt1.setBounds(150,110,100,25);
		 jl2.setBounds(50,145,200,25);
		 jt2.setBounds(150,145,100,25);
		 jb1.setBounds(70,235,100,25);
		 jb2.setBounds(180,235,100,25);
		 jl6.setBounds(300,105,485,309);
		 
		 
		 
		 
		 setSize(800,500);
		 setVisible(true);
		 setTitle("Server");
         
		
		

		
		jb1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae)
			{
				
				
				try {	
      
      if(!jt1.getText().equals("") && !jt2.getText().equals("")){
          
		  JOptionPane.showMessageDialog (null, "Authorised User", "Login Seccess", JOptionPane.INFORMATION_MESSAGE);
		    
		     VerifAdminLogin();
		         
             }
			 else
			 JOptionPane.showMessageDialog((Component) null, "Invalid password. Please try again. ", "Login Error", JOptionPane.INFORMATION_MESSAGE);

			}
			catch(Exception e) { System.out.println(e);
			}

			}
});
	 
		
	
		jb2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae)
			{
			jt1.setText("");
			jt2.setText("");
			} 
			});
			

			 
   }
   
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        dispose();
    }	

	 public static void main(String a[])

	 {
		 new FileOpen();
	 }
	 
	 void VerifAdminLogin() 
		{
				Connection con=null;
				String url="jdbc:odbc:nymble";
				Statement st=null;
				
			  try
			  {
					
						 String val1=jt1.getText();
						 val1 = val1.trim();
						 String val2 =  (String)jt2.getText();
						 val2 = val2.trim();					
					
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					
			   		con=DriverManager.getConnection(url);
					
			   		st = con.createStatement();
					
	
				ResultSet rs=st.executeQuery("Select Key from Server where SerName='"+val1+"'");
				
				while(rs.next()){
					String user = rs.getString(1);
					
					boolean b=user.equals(val2);				
				
					if(b)
					{
					
					  new Server().show();
				}
					 else
					{
						JOptionPane.showMessageDialog((Component) null, "Invalid password. Please try again. ", "Login Error", JOptionPane.INFORMATION_MESSAGE);
						jt1.setText("");
						jt2.requestFocus();
					}
					}
			  }
			  catch(SQLException ex)
			   {
			    System.out.println("Unable to access the database");
			   }
			  catch(ClassNotFoundException ex)
			   {
			    System.out.println("Class not found");
			   }
			  catch(Exception ex)
			  {
               System.out.println("Exception raised is:"+ex);
			  }
			  finally {
			  con=null;
			  }
		}

 }
