import java.awt.*;
import java.awt.event.*;
class Intrest extends Frame
{
    Label l,l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;

     Intrest()
     {
        setVisible(true);
        setSize(500,500);
        setTitle("Intrest Rate Calculator..");
        setLayout(null);
        l=new Label("Compund Intrest Calculator");
        l1=new Label("Principle Amount:");
        l2=new Label("Intrest Rate(%):");
        l3=new Label("Time(yrs):");
        l4=new Label("Total Amount:");
        l5=new Label("Intrest Amount:");
        t1=new TextField(10);
        t2=new TextField(3);
        t3=new TextField(5);
        t4=new TextField(8);
        t5=new TextField(10);
        b1=new Button("Calculate");
        b2=new Button("Clear");
        b3=new Button("Close");
        l.setBounds(160,50,200,50);
        add(l);
        l1.setBounds(50,100,110,50);
        add(l1);
        l2.setBounds(50,150,100,50);
        add(l2);
        l3.setBounds(250,150,100,50);
        add(l3);
        l4.setBounds(50,200,100,50);
        add(l4);
        l5.setBounds(50,250,100,50);
        add(l5);
        t1.setBounds(160,110,250,25);
        add(t1);
        t2.setBounds(160,160,50,25);
        add(t2);
        t3.setBounds(350,160,80,25);
        add(t3);
        t4.setBounds(160,210,100,25);
        add(t4);
        t5.setBounds(160,260,150,25);
        add(t5);
        b1.setBounds(50,310,100,30);
        add(b1);
        b2.setBounds(160,310,100,30);
        add(b2);
        b3.setBounds(280,310,100,30);
        add(b3);
     }

   public static void main(String arg[])
   {
      Intrest ob=new Intrest();
   }

}