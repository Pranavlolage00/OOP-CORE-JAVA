//  Write a java program to accept the details of employee (Eno, EName, Sal) and 
// display it on next frame using appropriate event
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1;
    Demo()
    {
        setVisible(true);
        setTitle("Accept infromation");
        setLayout(new FlowLayout());
        setSize(500,500);
        l1=new Label("Enter Employee Number:");
        l2=new Label("Enter Employee Name:");
        l3=new Label("Enter salary :");
        
        t1=new TextField(30);
        t2=new TextField(30);
        t3=new TextField(30);
        b1=new Button("submit");
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3);add(t3);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String eno=t1.getText();
            String ename=t2.getText();
            String sal=t3.getText();
            Frame f1=new Frame();
            f1.setVisible(true);
            f1.setSize(500,500);
            f1.setLayout(new FlowLayout());
            f1.setTitle("Display infromation..");
            Label l1=new Label("Employee Number="+eno);
            Label l2=new Label("Employee Number="+ename);
            Label l3=new Label("Employee Number="+sal);
            f1.add(l1);
            f1.add(l2);
            f1.add(l3);
        }
    }
    public static void main(String arg[])
    {
        new Demo();
    }
}