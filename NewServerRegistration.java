
import java.sql.*;
import java.math.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;



public class NewServerRegistration extends JFrame implements ActionListener {

private JButton btnok,btnexit,btnaddnew; 
private JTextField tf1,tf2,tf3;
private JLabel lblname,lbladd,lblip,lblmsg; 

private JPanel p1,p2,p3,psouth; 


public NewServerRegistration() 
{

btnok = new JButton("OK");
btnok.addActionListener(this);
btnexit = new JButton("Exit");
btnexit.addActionListener(this);
btnaddnew = new JButton("Reset");
btnaddnew.addActionListener(this);


tf1 = new JTextField(12);
tf2 = new JTextField(12);
tf3 = new JTextField(12);


lblname = new JLabel("Server Name:");
lbladd = new JLabel("Secret Password:");
lblip = new JLabel("Server IP");

lblmsg = new JLabel("",JLabel.CENTER);


p1 = new JPanel();
p2 = new JPanel();
p3 = new JPanel();
psouth = new JPanel();


p1.setLayout(new FlowLayout());
p1.setBackground(new Color(220,100,190));

addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

p1.add(btnok);
p1.add(btnexit);
p1.add(btnaddnew);

p3.add(lblmsg);
p3.setBackground(new Color(220,100,190));


psouth.setLayout(new GridLayout(2,1));
psouth.add(p3);
psouth.add(p1);



p2.setLayout(new GridLayout(3,1));
p2.setBackground(new Color(220,100,190));

p2.setBorder(BorderFactory.createLineBorder(Color.red));
p2.setBorder(BorderFactory.createTitledBorder("Enter New Registration"));
p2.add(lblname);
p2.add(tf1);
p2.add(lbladd);
p2.add(tf2);
p2.add(lblip);
p2.add(tf3);


this.getContentPane().add(p2,"Center");
this.getContentPane().add(psouth,"South");

this.setSize(350,400);
this.setTitle("New Server Register Here");
this.setLocation(100,200);
this.show();


}
/** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        dispose();
    }//GEN-LAST:event_exitForm
    
public static void main(String args[])
{
NewServerRegistration ad = new NewServerRegistration();
}


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btnok)
{
PreparedStatement pstm;

String sql;

if((tf1.getText().equals("")&&(tf2.getText().equals(""))&&(tf3.getText().equals(""))))
{
lblmsg.setText("Enter your details ");
lblmsg.setForeground(Color.magenta);
}


else
{

try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


Connection connect = DriverManager.getConnection("jdbc:odbc:nymble");


pstm=connect.prepareStatement("insert into Server values(?,?,?)");
pstm.setString(1,tf1.getText());
pstm.setString(2,tf2.getText());
pstm.setString(3,tf3.getText());

pstm.executeUpdate();
lblmsg.setText("Details have been added to database");




pstm.close();
connect.close();
}
catch(SQLException sqe)
{
System.out.println("SQl error");
}
catch(ClassNotFoundException cnf)
{
System.out.println("Class not found error");
}
}
}

if(e.getSource()==btnaddnew)
{
tf1.setText("");
tf2.setText("");
tf3.setText("");
}

if(e.getSource()==btnexit)
{
System.exit(1);
}
}
}