import java.awt.*;
import java.awt.event.*;
class InvalidUserPAss extends Exception
{
   public String toString()
    {
        return "INvaildUSER oR PAss";
    }
}
class User extends Frame implements ActionListener
{
    static int cnt=0;
     Label l1,l2,l3;
     TextField t1,t2,t3;
     Button b1,b2;
     User()
     {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setTitle("Login-");
        l1=new Label("enter user-name:");
        l2=new Label("enter Password");
        l3=new Label("Result:");
        t1=new TextField(10);
        t2=new TextField(10);
        t2.setEchoChar('*');
        t3=new TextField(10);
        b1=new Button("Login");
        b2=new Button("clear");
        add(l1);add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
     }
    public void actionPerformed(ActionEvent ae)
    {
        try{
              if(ae.getSource()==b1)
              {
                  String us=t1.getText();
                  String pass=t2.getText();
                  if(!(us.equals(pass)))
                  {
                    if(cnt==3)
                     b1.setVisible(false);

                      cnt++;
                      throw new InvalidUserPAss();
                  }
                  else
                      t3.setText("Login Successfully...");
              }
              if(ae.getSource()==b2)
              {
                t1.setText("");
                t2.setText("");
                t3.setText("");
              }
           }
           catch(InvalidUserPAss e1)
           {
            t3.setText(""+e1);        
          }
    }
    public static void main(String arg[])
    {
        User ob=new User();
    }
}