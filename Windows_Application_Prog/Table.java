import java.awt.*;
import java.awt.event.*;
class Table extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1;
    List lst;
    Button b1,b2;
    Table()
    {
        setVisible(true);
        setSize(500,300);
        setLocation(100,200);
        setTitle("Table");
        setLayout(new FlowLayout());
        l1=new Label("enter number:");
        l2=new Label("multiplication table=");
        lst=new List(10);
        b1=new Button("Print");
        b2=new Button("clear");
        t1=new TextField(10);
        add(l1);add(t1);add(l2);
        add(lst); add(b1); add(b2);
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
              lst.add(""+i*n);
        }
     }
     if(ae.getSource()==b2)
     {
        lst.clear();
     }

}
 public static void main(String arg[])
 {
    Table ob=new Table();
 }

}