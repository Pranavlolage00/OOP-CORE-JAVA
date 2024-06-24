import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Game_applet extends Applet implements ActionListener
{
    int i=1,f=0;
    Button b1,b2;
    public void init()
    {
        b1=new Button("Forward");
        b2=new Button("Reverse");
        add(b1); add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawRect(100+i,100,100,50);
        g.fillOval(110+i,150,25,25);
        g.fillOval(170+i,150,25,25);      
     }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
           i=i+20;
           repaint();
        }
        if(ae.getSource()==b2)
        {
            i=i-20;
            repaint();
        }
    }
}

/*
<html>
    <body>
        <applet code="Game_applet" width='1000' height='1000'>
        </applet>
    </body>
</html>
*/