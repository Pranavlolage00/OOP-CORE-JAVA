import java.awt.*;
import java.awt.event.*;
class User extends Frame implements ActionListener
{
   Button b1,b2,b3;
   Label l1,l2;
   TextField t1,t2;

   User()
   {
       setVisible(true);
       setSize(200,300);
       setTitle("User login");
       setLocation(200,300);
       setLayout(new GridLayout(3,2,20,40));

       l1=new Label("enter Username:");
       l2=new Label("Message=");

       t1=new TextField(10);
       t2=new TextField(10);

       b1=new Button("Login");
       b2=new Button("Reset");
       b3=new Button("Exit");

       add(l1);add(t1);
       add(l2);add(t2);
       add(b1);//add(b2);
       add(b3);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
   }
 public void actionPerformed(ActionEvent ae)
 {
    if(ae.getSource()==b1)
    {
        String s1=t1.getText();
        s1=s1.toUpperCase();
        t2.setText("Hello "+s1+" Nice to Meet You..");
    }
    if(ae.getSource()==b2)
    {
        t1.setText("");
        t2.setText("");
    }
    if(ae.getSource()==b3)
    {
        dispose();
    }
 }
public static void main(String arg[])
{
    User ob=new User();
}
}