import java.awt.*;
class Demo extends Frame
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;
    Demo()
        {
            setVisible(true);
            setSize(500,500);
            setLayout(null);
            //  Font f=new Font("",Font.BOLD,20);
            //  setFont(f);
            l1=new Label("Compund Intrest Calculator");
            l1.setBounds(160,50,180,50);
            add(l1);
            l2=new Label("Principle Amount");
            l2.setBounds(50,100,150,50);
            add(l2);
            l3=new Label("Intrest Rate(%)");
            l3.setBounds(50,150,100,50);
            add(l3);
            l4=new Label("Total Amount");
            l4.setBounds(50,200,100,50);
            add(l4);
            l5=new Label("Intrest Amount");
            l5.setBounds(50,250,100,50);
            add(l5);
            t1=new TextField(100);
            t1.setBounds(50,110,350,30);
            add(t1);
            t2=new TextField(30);
            t2.setBounds(50,160,160,30);
            add(t2);
            l6=new Label("Time(Yrs)");
            l6.setBounds(250,160,100,30);
            add(l6);
            t3=new TextField(30);
            t3.setBounds(260,160,160,30);
            add(t3);
            t4=new TextField(30);
            t4.setBounds(150,210,200,30);
            add(t4);
            t5=new TextField(30);
            t5.setBounds(150,260,200,30);
            add(t5);
            b1=new Button("Calculate");
            b1.setBounds(50,310,60,30);
            add(b1);
            b2=new Button("Clear");
            b2.setBounds(150,310,60,30);
            add(b2);
            b3=new Button("Clear");
            b3.setBounds(250,310,70,30);
            add(b3);
        }
    public static void main(String arg[])
    {
        new Demo();
    }
}