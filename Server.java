import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.rmi.Naming;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.*;

public class Server extends JFrame
{

    private JPanel contentpane;
    private JPanel RemoveIP;
    private JPanel jPanel2;
	private JButton AddIP;
    private JButton AddRes;
    private JButton RemoveRes;
    private JButton StartSer;
    private JButton Startview;
    private JButton Startmobilealert;
    private JButton Adduser;
	private JButton Addserver;
    private JButton removeIP;
    private JButton addIP;
    private JButton addRes;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel headlabl;
	 private JLabel headlab2;
    private JList jList1;
    private JList jList2;

    private JOptionPane op;
    private static JFrame frame = null;

    public Server()
    {
   op=new JOptionPane();
   
        contentpane = (JPanel) this.getContentPane(); 
		
        StartSer = new JButton();
        Startview = new JButton();
       Startmobilealert=new JButton();
        Adduser=new JButton();
		Addserver=new JButton();
        RemoveIP = new JPanel();
        jLabel1 = new JLabel();
        jList1 = new JList();
        AddIP = new JButton();
        removeIP = new JButton();
///
        addIP = new JButton();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        headlabl=new JLabel();
		 headlab2=new JLabel();
         jList2 = new JList();
        AddRes = new JButton();
        RemoveRes = new JButton();
        addRes = new JButton();
///////////
        contentpane.setLayout(null);
		contentpane.setBackground(new Color(70,150,180));
        this.setSize(new Dimension(900, 600));
		
//        


        this.setTitle("Nymble: Blocking Misbehaving Users in Anonymizing Networks");
	headlabl.setText("Nymble: Blocking Misbehaving Users in Anonymizing Networks");
	headlab2.setText("Nymble Manager");
	
	
		JLabel imageLabel1 = new JLabel();
        ImageIcon v1 = new ImageIcon(this.getClass().getResource("images/nm.png"));
			imageLabel1.setIcon(v1);
			
			imageLabel1.setBounds(140,30,800,86);
		getContentPane().add(imageLabel1);
	
	headlabl.setBackground(new Color(51, 0, 153));
    	//headlabl.setForeground(new Color(255, 255, 255));
		headlabl.setFont(new Font("Arial", 0, 20));
	headlabl.setBounds(130, 0, 600, 30);
	//contentpane.add(headlabl,null);
        //setBackground(new Color(254, 253, 184));

		headlab2.setBackground(new Color(0, 0, 225));
    	//headlabl.setForeground(new Color(255, 255, 255));
		headlab2.setFont(new Font("Arial", 0, 20));
	headlab2.setBounds(200, 0, 500, 70);
	//contentpane.add(headlab2,null);
		
        

        StartSer.setBackground(new Color(225, 0, 225));
        StartSer.setFont(new Font("Arial", 0, 18));
        StartSer.setForeground(new Color(255, 255, 255));
        StartSer.setText("Nymble Manager On..");
        StartSer.setBorder(new BevelBorder(0));
        StartSer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                StartSerActionPerformed(actionevent);
            }

        });
        contentpane.add(StartSer,null);
        StartSer.setBounds(110, 430, 190, 23);
///
        Startview.setBackground(new Color(225, 0, 225));
        Startview.setFont(new Font("Arial", 0, 20));
        Startview.setForeground(new Color(255, 255, 255));
        Startview.setText("Misbehaviour Details");
        Startview.setBorder(new BevelBorder(0));
        Startview.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                StartviewActionPerformed(actionevent);
            }

        });
        contentpane.add(Startview,null);
        Startview.setBounds(110, 490, 190, 23);

//////////
       // Startmobilealert.setBackground(new Color(225, 0, 225));
        //Startmobilealert.setFont(new Font("Arial", 0, 18));
        //Startmobilealert.setForeground(new Color(255, 255, 255));
       // Startmobilealert.setText("");
        //Startmobilealert.setBorder(new BevelBorder(0));
        //Startmobilealert.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                StartmobilealertActionPerformed(actionevent);
            }

        });
        contentpane.add(Startmobilealert,null);
        Startmobilealert.setBounds(110, 560, 190, 23);

///
//////////
        Adduser.setBackground(new Color(225, 0, 225));
        Adduser.setFont(new Font("Arial", 0, 18));
        Adduser.setForeground(new Color(255, 255, 255));
        Adduser.setText("Add NewUser");
        Adduser.setBorder(new BevelBorder(0));
        Adduser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                AdduserActionPerformed(actionevent);
            }

        });
        contentpane.add(Adduser,null);
        Adduser.setBounds(330, 430, 160, 23);
		
		
		Addserver.setBackground(new Color(225, 0, 225));
        Addserver.setFont(new Font("Arial", 0, 18));
        Addserver.setForeground(new Color(255, 255, 255));
        Addserver.setText("Server Registration");
        Addserver.setBorder(new BevelBorder(0));
        Addserver.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                AddserverActionPerformed(actionevent);
            }

        });
        contentpane.add(Addserver,null);
        Addserver.setBounds(330, 490, 160, 23);

///
        RemoveIP.setLayout(null);
        RemoveIP.setBackground(new Color(121, 123, 252));
        RemoveIP.setBorder(new EtchedBorder());
        jLabel1.setFont(new Font("Arial", 0, 18));
        jLabel1.setText("blocking IP addresses(blacklist)");
        RemoveIP.add(jLabel1);
        jLabel1.setBounds(10, 10, 580, 40);
        jList1.setBorder(new BevelBorder(1));
        RemoveIP.add(jList1);
        jList1.setBounds(200, 70, 150, 150);
        AddIP.setBackground(new Color(0, 51, 204));
        AddIP.setFont(new Font("Arial", 0, 15));
        AddIP.setForeground(new Color(255, 255, 255));
        AddIP.setText("View");
        AddIP.setBorder(new SoftBevelBorder(0));
        AddIP.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                AddIPActionPerformed(actionevent);
            }

        });
        RemoveIP.add(AddIP);
        AddIP.setBounds(50, 150, 110, 25);
//new ip
        removeIP.setBackground(new Color(0, 51, 204));
        removeIP.setFont(new Font("Arial", 0, 15));
        removeIP.setForeground(new Color(255, 255, 255));
        removeIP.setText("Delete IP");
        removeIP.setBorder(new SoftBevelBorder(0));
        removeIP.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                removeIPActionPerformed(actionevent);
            }

        });
        RemoveIP.add(removeIP);
        removeIP.setBounds(50, 110, 110, 25);

////////////new addip
        addIP.setBackground(new Color(0, 51, 204));
        addIP.setFont(new Font("Arial", 0, 15));
        addIP.setForeground(new Color(255, 255, 255));
        addIP.setText("Add New IP");
        addIP.setBorder(new SoftBevelBorder(0));
        addIP.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                addIPActionPerformed(actionevent);
            }

        });
        RemoveIP.add(addIP);
        addIP.setBounds(50, 70, 110, 25);

////////////
        contentpane.add(RemoveIP,null);
        RemoveIP.setBounds(100, 200, 400, 400);
        jPanel2.setLayout(null);
        jPanel2.setBackground(new Color(121, 123, 252));
        jPanel2.setBorder(new EtchedBorder());
        jLabel2.setFont(new Font("Arial", 0, 18));
        jLabel2.setText(" User Files:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 180, 40);
        jList2.setBorder(new BevelBorder(1));
        jPanel2.add(jList2);
        jList2.setBounds(10, 70, 150, 150);
        AddRes.setBackground(new Color(0, 51, 204));
        AddRes.setFont(new Font("Arial", 0, 15));
        AddRes.setForeground(new Color(255, 255, 255));
        AddRes.setText("Show File");
        AddRes.setBorder(new SoftBevelBorder(0));
        AddRes.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                AddResActionPerformed(actionevent);
            }

        });
        jPanel2.add(AddRes);
        AddRes.setBounds(250, 70, 110, 25);
        RemoveRes.setBackground(new Color(0, 51, 204));
        RemoveRes.setFont(new Font("Arial", 0, 15));
        RemoveRes.setForeground(new Color(255, 255, 255));
        RemoveRes.setText("Remove ");
        RemoveRes.setBorder(new SoftBevelBorder(0));
        RemoveRes.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                RemoveResActionPerformed(actionevent);
            }

        });
        jPanel2.add(RemoveRes);
        RemoveRes.setBounds(250, 110, 110, 25);
/////////////new Res
	addRes.setBackground(new Color(0, 51, 204));
        addRes.setFont(new Font("Arial", 0, 15));
        addRes.setForeground(new Color(255, 255, 255));
        addRes.setText("Add New File");
        addRes.setBorder(new SoftBevelBorder(0));
        addRes.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                addResActionPerformed(actionevent);
            }

        });
        jPanel2.add(addRes);
        addRes.setBounds(250, 150, 110, 25);
/////////////////
        contentpane.add(jPanel2,null);
        jPanel2.setBounds(550, 200, 400, 400);
        pack();
    }

    private void StartSerActionPerformed(ActionEvent actionevent)
    {
        try
        {
            RMISImpl rmisimpl = new RMISImpl();
            Naming.rebind("RMIServer", rmisimpl);
            System.out.println("Nymble Manger Is Runnig...");
        }
        catch(Exception exception)
        {
            System.out.println("Exception :" + exception);
        }
    }

//
    private void StartmobilealertActionPerformed(ActionEvent actionevent)
    {
        try
        {
emserver ob=new emserver();
ob.start();
       System.out.println("Mobile Service Running....... ");
        }
        catch(Exception exception)
        {
            System.out.println("Exception :" + exception);
        }
    }
//
//
private void AdduserActionPerformed(ActionEvent actionevent)
    {
        try
        {
     
	new NewUser().show();
	 }
        catch(Exception exception)
        {
            System.out.println("Exception :" + exception);
        }
    }
	
	private void AddserverActionPerformed(ActionEvent actionevent)
    {
        try
        {
     
	new NewServerRegistration().show();
	 }
        catch(Exception exception)
        {
            System.out.println("Exception :" + exception);
        }
    }

//

//
private void StartviewActionPerformed(ActionEvent actionevent)
    {
      new view();
    }
//
    private void RemoveResActionPerformed(ActionEvent actionevent)
    {	dbcon dbcon1 = new dbcon();
	String sss=(String) jList2.getSelectedValue();
	System.out.println("selected:"+sss);
	dbcon1.removede(sss,"RESOURCES","files");
	rss();
    }
    private void addResActionPerformed(ActionEvent actionevent)
    {
	String Fn=(String)JOptionPane.showInputDialog(this,"Enter The new FileName:");
	String fFn=(String)JOptionPane.showInputDialog(this,"Enter The fake FileName:");
	String op1=(String)JOptionPane.showInputDialog(this,"Enter The option of FileSecurity:","false");
	String ip=(String)JOptionPane.showInputDialog(this,"Enter The IP Address:");
	String url=(String)JOptionPane.showInputDialog(this,"Enter The URL:");

if(Fn==null || fFn==null || op1==null ||Fn.equals("")||fFn.equals("")||op1.equals(""))
	{
	op.showConfirmDialog(this,"Enter proper Data Only","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
	}
else
	{
	add_rss(Fn,fFn,op1,ip,url);
	}

    }

private void addIPActionPerformed(ActionEvent actionevent)
    {
String a=(String)JOptionPane.showInputDialog(this,"Enter The new IPAddress:");
new_addipr(a);
System.out.println("addip called"+a);
    }
private void rss()
{
dbcon dbcon1 = new dbcon();
        String s = dbcon1.listfile();
        Vector vector = new Vector(2);
        String s1;
        for(StringTokenizer stringtokenizer = new StringTokenizer(s, ";"); stringtokenizer.hasMoreTokens(); vector.addElement(s1))
        {
            s1 = stringtokenizer.nextToken();
        }

        jList2.setListData(vector);

}
private void add_rss(String f,String ff,String op,String allowedip,String url)
{
        dbcon dbcon1 = new dbcon();
       dbcon1.add_res(f,ff,op,allowedip,url);
        String s = dbcon1.listfile();
        Vector vector = new Vector(2);
        String s1;
        for(StringTokenizer stringtokenizer = new StringTokenizer(s, ";"); stringtokenizer.hasMoreTokens(); vector.addElement(s1))
        {
            s1 = stringtokenizer.nextToken();
        }

        jList2.setListData(vector);

}


    private void AddResActionPerformed(ActionEvent actionevent)
    {

rss();
     }
private void ipr()
{
	dbcon dbcon1 = new dbcon();
       	 String s = dbcon1.listip();
      	  Vector vector = new Vector(2);
      	  String s1;
      	  for(StringTokenizer stringtokenizer = new StringTokenizer(s, ";"); stringtokenizer.hasMoreTokens(); vector.addElement(s1))
      		  {
           		 s1 = stringtokenizer.nextToken();
        		  }

        jList1.setListData(vector);


}

private void new_addipr(String ip_n)
{
	dbcon dbcon1 = new dbcon();
	dbcon1.add_ip(ip_n);
	String s = dbcon1.listip();
      	Vector vector = new Vector(2);
      	String s1;
      	for(StringTokenizer stringtokenizer = new StringTokenizer(s, ";"); stringtokenizer.hasMoreTokens(); vector.addElement(s1))
      		  {
           		 s1 = stringtokenizer.nextToken();
        		  }

        jList1.setListData(vector);


}



    private void removeIPActionPerformed(ActionEvent actionevent)
    {	
	String a=(String)JOptionPane.showInputDialog(this,"Enter The Key Word");
	if(a.equals("nymble"))
	{	
	dbcon dbcon1 = new dbcon();
	String sss=(String) jList1.getSelectedValue();
	System.out.println("selected:"+sss);
	dbcon1.removede(sss,"ADDRESS","IPADDRESS");
	ipr();
	}
	else
	{
	op.showConfirmDialog(this,"Check The Key or Select Ip","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
	}

    }

    private void AddIPActionPerformed(ActionEvent actionevent)
    {
	ipr();
    }


    /* private void exitForm(WindowEvent windowevent)
    {
        System.exit(0);
    } */
static void showMiddle(){
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = frame.getSize();
    if (frameSize.height > screenSize.height) {
      frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
      frameSize.width = screenSize.width;
    }
    frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    frame.setVisible(true);
 
}



    public static void main(String args[])
    {
	Server frame = new Server();//).show();
	
	
	frame.setSize(950,700);
	frame.show();

		
	
      
    }
	
}
