import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Clr extends Frame implements AdjustmentListener
{
    Scrollbar s1,s2,s3;
    Label l1,l2,l3;

    Clr()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        s1=new Scrollbar();
        s1.setMinimum(0);
        s1.setMaximum(265);
        s1.setBounds(125,100,60,300);
        add(s1);
        s2=new Scrollbar();
        s2.setMinimum(0);
        s2.setMaximum(265);
        s2.setBounds(200,100,60,300);
        add(s2);

        s3=new Scrollbar();
        s3.setMinimum(0);
        s3.setMaximum(265);
        s3.setBounds(275,100,60,300);
        add(s3);

        l1=new Label("R");
        l2=new Label("G");
        l3=new Label("B");

        l1.setBounds(140,50,50,20);
        add(l1);
        l2.setBounds(225,50,50,20);
        add(l2);
        l3.setBounds(290,50,50,20);
        add(l3);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }
    
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
            int a=s1.getValue();
            int b=s2.getValue();
            int c=s3.getValue();
            l1.setText("R="+a);
            l2.setText("G="+b);
            l3.setText("B="+c);
            
            Color col=new Color(a,b,c);
            setBackground(col);   
     }
public static void main(String arg[])
{
    Clr ob=new Clr();
}
}
