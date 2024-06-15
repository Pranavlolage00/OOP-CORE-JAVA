import java.awt.*;
import java.awt.event.*;
class Add extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1;
    List lst;
    Button b1,b2,b3;
    Add()
    {
        setVisible(true);
        setSize(500,300);
        setLocation(100,200);
        setTitle("Product");
        setLayout(new FlowLayout());
        l1=new Label("enter product");
        l2=new Label("All Products=");
        t1=new TextField(10);
        b1=new Button("add");
        b2=new Button("remove");
        b3=new Button("remove all");
        lst=new List(10);
        add(l1);add(t1);add(l2);add(lst);
        add(b1);add(b2);add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String s1=t1.getText();
            lst.add(s1);
        }
        if(ae.getSource()==b2)
        {
            lst.remove(lst.getSelectedItem());
        }
        if(ae.getSource()==b3)
        {
            lst.clear();
        }
    }
public static void main(String arg[])
{
    Add ob=new Add();
}
}