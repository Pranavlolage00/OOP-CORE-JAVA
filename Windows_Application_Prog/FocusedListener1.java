import java.awt.*;
import java.awt.event.*;
class Focus extends Frame implements FocusListener
{
   TextField t1,t2,t3,t4;
   Button b1,b2,b3;

    Focus()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(7,1,10,10));

        t1=new TextField(30);
        t2=new TextField(30);
        t3=new TextField(30);
        t4=new TextField(30);

        b1=new Button("ok");
        b2=new Button("cancel");
        b3=new Button("Submit");

        add(t1); add(t2); add(t3);
        add(t4); add(b1); add(b2);
        add(b3);
        t1.addFucusListener(this);
        t2.addFucusListener(this);
        t3.addFucusListener(this);
        t4.addFucusListener(this);

        b1.addFucusListener(this);
        b2.addFucusListener(this);
        b3.addFucusListener(this);
    }
    public void focusLost(FocusEvent fe)
    {
          if(fe.getSource()==t1)
          {
            t1.setBackground(Color.white);
          }
          if(fe.getSource()==t2)
          {
            t2.setBackground(Color.white);
          }
           if(fe.getSource()==t3)
          {
            t3.setBackground(Color.white);
          } if(fe.getSource()==t4)
          {
            t4.setBackground(Color.white);
          }
    }
public static void main(String arg[])
{
    Focus ob=new Focus();
}

