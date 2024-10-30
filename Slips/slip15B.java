import java.applet.*;
import java.awt.*;
public class slip15B extends Applet
{
    public void init()
    {
         System.out.println("i am Now Init");
    }
    public void paint(Graphics g)
    {
        g.drawOval(100,100,300,300);
        g.drawOval(160,150,50,50);
        g.drawOval(295,150,50,50);
        g.drawArc(200,220,100,100,180,180);
    }
}

/*
<html>
    <body>
        <applet code="slip15B" width="500" height="500"></applet>
    </body>
</html>
 */