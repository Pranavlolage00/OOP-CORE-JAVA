import java.awt.*;
import java.applet.*;
public class DesignFace_applet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(100,100,300,200);
         g.drawOval(100,100,50,50);
    }
}
/*
<html>
   <body>
       <applet code="DsignFace_applet" width='500' height='500'>
       </applet>
    </body>
</html>
*/