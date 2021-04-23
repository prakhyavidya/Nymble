import java.io.IOException;
import javax.swing.*;
import java.awt.*;
 
public class LabelLink extends JFrame {

private static final long serialVersionUID = 1L;

public LabelLink() {
  super() ;
  setTitle( "Click on the JLabel to start the webpage." ) ;
  setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
              
     JPanel pane = new JPanel();
     setContentPane(pane);
     setLayout(new FlowLayout());
                              
     JLabel label= new JLabel( "Visit iWebie" ,  JLabel.CENTER );
     label.setBackground(Color.RED);
     getContentPane().add(label) ;
              
     label.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
              if(evt.getClickCount() > 0){
                try {
                        Process pc = Runtime.getRuntime().exec("cmd.exe /c start http://localhost:8080/nymble_source/");
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                        System.out.println();
                    }
               }
            }
            });
            setSize( 400 , 100 );              
            setVisible( true );              
  }
 
 public static void main(String[] args) {
  new LabelLink () ;
 }
}