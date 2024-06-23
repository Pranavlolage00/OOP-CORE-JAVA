import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class DrawLine_applet extends Applet implements MouseListener
{
    int x1,y1,x2,y2;
   public void init()
   {
       addMouseListener(this);
   }
   public void mousePressed(MouseEvent me)
   {
      x1=me.getX();
      y1=me.getY();
   }
   public void mouseReleased(MouseEvent me)
   {
     y2=me.getY();
     x2=me.getX();
     repaint();
   }
   public void mouseClicked(MouseEvent me)
   {
   }
   public void mouseEntered(MouseEvent me)
   {
   }
   public void mouseExited(MouseEvent me)
   {
   }
   public void update(Graphics g)
   {
       g.drawLine(x1,y1,x2,y2);
   }
}
/*
<html>
    <body>
       <applet code="DrawLine_applet" width='500' height='500'>
       </applet>
    </body>
</html>
*/