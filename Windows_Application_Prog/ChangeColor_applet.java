import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ChangeColor_applet extends Applet implements ItemListener
{
    Checkbox ch1,ch2,ch3;
    CheckboxGroup chg;

    public void init()
    {
        chg=new CheckboxGroup();
        ch1=new Checkbox("red",chg,true);
        ch2=new Checkbox("green",chg,false);
        ch3=new Checkbox("Blue",chg,false);
        add(ch1); add(ch2); add(ch3);

        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
         if(ch1.getState()==true)
             setBackground(Color.red);
         if(ch2.getState()==true)
             setBackground(Color.green);
         if(ch3.getState()==true)
             setBackground(Color.blue);
    } 
}
/*
<html>
    <body>
        <applet code="ChangeColor_applet" width='500' height='500'>
        </applet>
    </body>
</html>
*/