
import java.sql.*;
import javax.swing.*;

public class NewUser extends javax.swing.JFrame {
    
    
    public NewUser() {
        initComponents();
    }
    
    private void initComponents() {
        jpNewUser = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPh = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        butOk = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();
        txtPass = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        op= new JOptionPane();

        getContentPane().setLayout(null);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jpNewUser.setLayout(null);

        jpNewUser.setBackground(new java.awt.Color(50, 145, 145));
        jpNewUser.setPreferredSize(new java.awt.Dimension(800, 500));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 25));
        jLabel7.setForeground(new java.awt.Color(187, 154, 252));
        jLabel7.setText("New User Registration");
        jpNewUser.add(jLabel7);
        jLabel7.setBounds(100, 40, 500, 30);

        jPanel3.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 80, 0));
        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Name:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 20, 70, 30);

        jPanel3.add(txtName);
        txtName.setBounds(150, 20, 110, 21);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Age:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 60, 70, 30);

        jPanel3.add(txtAge);
        txtAge.setBounds(150, 60, 110, 21);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Gender:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 100, 70, 30);

        jPanel3.add(txtGender);
        txtGender.setBounds(150, 100, 110, 21);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Address:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 140, 70, 30);

        jPanel3.add(txtAdd);
        txtAdd.setBounds(150, 140, 110, 21);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Phone No:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 180, 80, 30);

        jPanel3.add(txtPh);
        txtPh.setBounds(150, 180, 110, 21);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Department:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 220, 120, 30);

        jPanel3.add(txtUser);
        txtUser.setBounds(150, 220, 110, 21);

        butOk.setBackground(new java.awt.Color(153, 0, 0));
        butOk.setFont(new java.awt.Font("Arial", 1, 13));
        butOk.setForeground(new java.awt.Color(255, 255, 204));
        butOk.setText("OK");
        butOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOkActionPerformed(evt);
            }
        });

        jPanel3.add(butOk);
        butOk.setBounds(50, 300, 90, 25);

        butCancel.setBackground(new java.awt.Color(153, 0, 0));
        butCancel.setFont(new java.awt.Font("Arial", 1, 13));
        butCancel.setForeground(new java.awt.Color(255, 255, 204));
        butCancel.setText("Cancel");
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Mobile NO:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 260, 120, 30);

        jPanel3.add(txtPass);
        txtPass.setBounds(150, 260, 110, 21);

        jPanel3.add(butCancel);
        butCancel.setBounds(170, 300, 80, 25);

        jpNewUser.add(jPanel3);
        jPanel3.setBounds(110, 110, 320, 370);

        getContentPane().add(jpNewUser);
        jpNewUser.setBounds(0, 0, 810, 590);
        setResizable(false);

        pack();
        setSize(600,600);
		setTitle("Client Registration");
    }

    private void butOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOkActionPerformed
        

		
	try{

		String name=txtName.getText();
		int age=Integer.parseInt(txtAge.getText());
		String gen = txtGender.getText();
		String addr = txtAdd.getText();
		String ph = txtPh.getText();
		String date = txtUser.getText();
		String mobile = txtPass.getText();
		System.out.println("valued received");

dbcon ob=new dbcon();
PasswordGenerator passwordGenerator = new PasswordGenerator();
String pass_a=passwordGenerator.getPassword();
String code_a=passwordGenerator.getPassword();
ob.add_user(name,name,name,age,gen,ph,addr,mobile);
		op.showConfirmDialog(this,"New User Added","Confirmation",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
emserver.msg="Password="+pass_a+":User key="+code_a;

		System.out.println("New User Added");
		txtName.setText("");
		txtAge.setText("");
		txtGender.setText("");
		txtAdd.setText("");
		txtPh.setText("");
		txtUser.setText("");
		txtPass.setText("");
		




	}catch(Exception e){System.out.println(e);} 


    }

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        
	 dispose();

    }
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        dispose();
    }
    
    
public static void main(String a[]) {

	new NewUser().show();
}    

    private javax.swing.JButton butCancel;
    private javax.swing.JButton butOk;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpNewUser;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPh;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JTextField txtPass;
    Connection con;
            Statement st;
            ResultSet rs;
    JOptionPane op;
   
    
}
