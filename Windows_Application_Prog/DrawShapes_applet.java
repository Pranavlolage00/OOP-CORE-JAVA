import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class DrawShapes_applet extends Applet implements ItemListener,MouseListener
{
    int f=0,x1,y1,x2,y2;
    CheckboxGroup chg;
    Checkbox ch1,ch2,ch3;

    public void init()
    {
        chg=new CheckboxGroup();
        ch1=new Checkbox("Line",chg,true);
        ch2=new Checkbox("Square",chg,false);
        ch3=new Checkbox("Oval",chg,false);
        add(ch1); add(ch2);
        add(ch3);

        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);        
        addMouseListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
         if(ch1.getState()==true)
            f=1;
        if(ch2.getState()==true)
            f=2;
        if(ch3.getState()==true)
            f=3;
    }
    public void mousePressed(MouseEvent me)
    {
       x1=me.getX();
       y1=me.getY();
    }
    public void mouseReleased(MouseEvent me)
    {
        x2=me.getX();
        y2=me.getY();
        repaint();
    }
    public void mouseClicked(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void update(Graphics g)
    {
       // System.out.println("i am paint");
        if(f==1)
        g.drawLine(x1,y1,x2,y2);
        if(f==2)
        g.drawRect(x1,y1,x2-x1,y2-y1);
        if(f==3)
        g.drawOval(x1,y1,x2-x1,y2-y1);
    }
}
/*
<html>
     <body>
         <applet code="DrawShapes_applet" width='500' height='500'>
         </applet>
    </body>
</html>
 */
