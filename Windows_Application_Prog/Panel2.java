import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ItemListener
{
    Checkbox ch1,ch2,ch3,ch4,ch5,ch6;
    CheckboxGroup chg1,chg2;

    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        chg1=new CheckboxGroup();
        chg2=new CheckboxGroup();

        ch1=new Checkbox("BCA",chg1,false);
        ch2=new Checkbox("BCS",chg1,false);
        ch3=new Checkbox("BSC",chg1,false);
        ch4=new Checkbox("MSC",chg2,false);
        ch5=new Checkbox("MCA",chg2,false);
        ch6=new Checkbox("MCS",chg2,false);
        
        Panel p1=new Panel();
        p1.setLayout(new GridLayout(3,1));
        p1.add(ch1);
        p1.add(ch2);
        p1.add(ch3);
        Panel p2=new Panel();
        p2.setLayout(new GridLayout(3,1));
         p2.add(ch4);
        p2.add(ch5);
        p2.add(ch6);
        Panel p3=new Panel();
        p3.setLayout(new GridLayout(1,2));
        p3.add(p1);
        p3.add(p2);
        add(p3);
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);
        ch4.addItemListener(this);
        ch5.addItemListener(this);
        ch6.addItemListener(this);
        
    }
     public void itemStateChanged(ItemEvent  ie)
     {
        if(ch1.getState())
        ch5.setState(true);
        if(ch2.getState())
        ch6.setState(true);
        if(ch3.getState())
        ch4.setState(true); 
     }
    public static void main(String arg[])
    {
        new Demo();
    }
}