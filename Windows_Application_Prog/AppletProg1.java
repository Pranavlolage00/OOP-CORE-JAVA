import java.awt.*;
import java.applet.*;
public class AppletProg1 extends Applet
{
    public void paint(Graphics g)
    {
        Font f=new Font("Arial",Font.BOLD,25);
        g.setFont(f);
        g.drawString("Wel-Come to BBA(ca)",100,100);

        g.drawLine(100,100,400,400); // x1,y1,x2,y2
       g.drawRect(50,200,100,100); //x,y,W,H
       g.drawOval(50,310,100,100); // x,y,w,h
       g.drawRoundRect(50,410,100,100,50,50);
       g.fillRect(100,410,100,100);
       g.fillRoundRect(100,510,50,50,10,10);
       g.setColor(Color.cyan);
       g.fillArc(300,300,100,100,180,180);
       g.drawArc(200,200,100,100,180,180);

       // g.drawOval(150,150,200,200);            /*
       // g.drawOval(200,200,25,25);                smile face 
        //g.drawOval(270,200,25,25);              /*
      //  g.drawArc(200,220,100,100,180,180);    
    }
}
/*
<html>
   <body>
       <applet code="AppletProg1" width='500' height='500'>
       </applet>
   </body>
</html>
*/