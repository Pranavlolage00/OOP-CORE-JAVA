import java.awt.*;
import java.applet.*; 
public class ParamAddition_applet extends Applet
{
    int a,b,c;
    public void init()
    {
        a=Integer.parseInt(getParameter("a"));
        b=Integer.parseInt(getParameter("b"));
        c=a+b;
    }
    public void paint(Graphics g)
    {
        g.drawString("addition="+c,100,100);
    }
}
/*
<html>
   <body>
       <applet code="ParamAddition_applet" width='500' height='500'>
       <param name='a' value='10'>
       </param>
       <param name='b' value='20'>
       </param>
       </applet>
    </body>
</html>
 */