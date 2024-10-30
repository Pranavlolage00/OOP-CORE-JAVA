import java.awt.*;
import java.applet.*;
class demo extends Applet
{
     public void init()
     {
        start();
        System.out.println("I am init..")  ;
     }
     public void paint(Graphics g)
     {
         g.drawRect(100,100,100,100);
     }
}
/*
<html>
  <body>
  <applet code="demo.class" width='500' height='500'>
  </applet>
  </body>
</html>
*/