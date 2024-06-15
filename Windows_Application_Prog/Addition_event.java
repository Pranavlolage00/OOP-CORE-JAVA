import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    Button b1,b2;
    TextField t1,t2,t3;
    Demo()
    {
        setVisible(true);
        setSize(500,300);
        setTitle("Addition Design");
        setBackground(Color.pink);
        l1=new Label("enter no1:");
        l2=new Label("enter no2:");
        l3=new Label("Result:");
        b1=new Button("Submit");
        b2=new Button("reset");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        setLayout(new GridLayout(4,2,12,60));
        add(l1);add(t1); 
        add(l2);add(t2);
        add(b1);add(b2);
        add(l3);add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
   public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }


public static void main(String arg[])
{
      Demo ob=new Demo();
}
} 