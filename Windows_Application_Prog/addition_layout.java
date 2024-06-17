import java.awt.*;
import java.awt.event.*;
class Demo extends Frame
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Button b1,b2,b3;

    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        setLocation(200,300);
        l1=new Label("Number Addition");
        l2=new Label("First number :");
        l3=new Label("Second Number :");
        l4=new Label("Result:");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Add");
        b2=new Button("Clear");
        b3=new Button("Exit");

        l1.setBounds(30,50,200,50);
        add(l1);
        l2.setBounds(60,100,100,50);
        add(l2);
        l3.setBounds(60,150,100,50);
        add(l3);
        l4.setBounds(60,200,100,50);
        add(l4);
        t1.setBounds(170,115,200,25);
        add(t1);
        t2.setBounds(170,165,200,25);
        add(t2);
        t3.setBounds(170,215,200,25);
        add(t3);
        b1.setBounds(160,260,70,25);
        add(b1);
        b2.setBounds(240,260,70,25);
        add(b2);
        b3.setBounds(320,320,70,25);
        add(b3);    }
public static void main(String arg[])
{
   Demo ob=new Demo();
}

}