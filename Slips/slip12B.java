import java.awt.*;
import java.awt.event.*;
class Mult extends Frame implements ActionListener
{
    TextField t1;
    List l1;
    Button b1,b2;
    Mult()
    {
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        t1=new TextField(10);
        l1=new List(10);
        b1=new Button("Display");
        b2=new Button("clear");
        add(t1);add(l1);
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int n=Integer.parseInt(t1.getText());
            for(int i=1; i<=10; i++)
            {
                l1.add(""+n*i);
            }
        }
        if(ae.getSource()==b2)
        {
            t1.setText("");
            l1.clear();
        }
    }
    public static void main(String arg[])
    {
        new Mult();
    }
}