import java.applet.*;
import java.awt.*;
public class DrawPolygon_applet extends Applet
{

    public void paint(Graphics g)
    {
       int  x[]={50,150,200};
        int  y[]={200,50,200};
        g.drawPolygon(x,y,3);
    }
}
/*
<html>
  <body>
    <applet code="DrawPolygon_applet" width="500" height="500">
    </applet>
  </body>
</html>
*/