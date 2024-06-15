import java.awt.*;
import java.awt.event.*;
class Color1 extends Frame implements ActionListener
{
   Button b1,b2,b3,b4,b5,b6;
     Color1()
     {
        setVisible(true);
        setSize(100,200);
        setTitle("colors");
        setLayout(new FlowLayout());
        b1=new Button("pink");
        b2=new Button("orange");
        b3=new Button("yellow");
        b4=new Button("green");
        b5=new Button("blue");
        b6=new Button("exit");
        add(b1);add(b2);add(b3);
        add(b4);add(b5);add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
     }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
           setBackground(Color.pink);
        }
        if(ae.getSource()==b2)
        {
           setBackground(Color.orange);
        }
        if(ae.getSource()==b3)
        {
           setBackground(Color.yellow);
        }
        if(ae.getSource()==b4)
        {
           setBackground(Color.green);
        }
        if(ae.getSource()==b5)
        {
           setBackground(Color.blue);
        }
        if(ae.getSource()==b6)
        {
          dispose();
        }
    }
    public static void main(String arg[])
    {
        Color1 ob=new Color1();
    }
}