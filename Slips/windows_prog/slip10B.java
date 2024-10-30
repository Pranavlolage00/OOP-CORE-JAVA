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
       l1=new Label("Principle Amount");
       l1=new Label("Intrest Rate");
       l1=new Label("Time(Yrs)");
       l1=new Label("Total Amount");
       l1=new Label("Intrest Amount");

       t1=new TextField();

       t1.setBounds(50,50,100,20);
       add(t1);
    }
 public static void main(String arg[])
 {
         new Demo();
 }
}