import java.awt.*;
import java.applet.*;
public class appletDemo extends Applet
{
    public void init()
    {
         start();
         System.out.println("I am Init Method...");
    }
    public void paint(Graphics g)
    {
        g.drawString("i am Paint method",100,100);
         //stop();
         //repaint();
    }
       
    public void destroy()
    {
         System.out.println("Memeory Free");
    }
}

/*
<html>
  <body>
  <applet code="appletDemo" width='500' height='500'>
  </applet>
  </body>
</html>
*/
