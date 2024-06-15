import java.awt.*;
import java.awt.event.*;
class Arithmatic extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5,b6;
        Arithmatic()
        {
            setVisible(true);
            setSize(200,300);
            setTitle("Arithmatic Opreations..");
            setLocation(200,500);
            l1=new Label("Enter number 1:");
            l2=new Label("Enter number 2:");
            l3=new Label("Result=");

            t1=new TextField(10);
            t2=new TextField(10);
            t3=new TextField(10);

            b1=new Button("ADdition");
            b2=new Button("subtraction");
            b3=new Button("multiplication");
            b4=new Button("Divison");
            b5=new Button("REset");
            b6=new Button("Exit");
            setLayout(new GridLayout(7,2,20,20));
            add(l1);add(t1);
            add(l2);add(t2);
            add(l3);add(t3);
            add(b1);add(b2);
            add(b3);add(b4);
            add(b5);add(b6);
    
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
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b2)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a-b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b3)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a*b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b4)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a/b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b5)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        if(ae.getSource()==b6)
        {
            dispose();
        }
    }
    public static void main(String args[])
    {
        Arithmatic ob=new Arithmatic();
    }

}
