import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Addition extends JFrame implements ActionListener
{
   Label l1,l2,l3;
   TextField t1,t2,t3;
   Button b1;

   Addition()
   {
       setVisible(true);
       setSize(500,500);
       setLayout(null);

       l1=new Label("First Number:");
       l2=new Label("Second Number:");
       l3=new Label("REsult");
    
       t1=new TextField();
       t2=new TextField();
       t3=new TextField();

       l1.setBounds(100,50,150,20);
       l2.setBounds(100,100,150,20);
       l3.setBounds(100,150,150,20);

       t1.setBounds(270,50,150,20);
       t2.setBounds(270,100,150,20);
       t3.setBounds(270,150,150,20);
        Random r=new Random();
    int a=r.nextInt(100);
    int b=r.nextInt(100);
     
    t1.setText(""+a);
    t2.setText(""+b);
     int c=a+b;
   t3.setText(""+c);

       add(l1);
       add(l2);
       add(l3);
       add(t1);
       add(t2);
       add(t3);
    b1=new Button("Exit");
    b1.setBounds(200,200,70,25);
    add(b1);

  
   b1.addActionListener(this);
   }
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
        dispose();
    }
}
  public static void main(String arg[])
  {
     Addition ob=new Addition();
  }

}