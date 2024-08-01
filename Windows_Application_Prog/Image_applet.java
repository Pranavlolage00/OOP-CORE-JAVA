import java.awt.*;
import java.applet.*;
public class Image_applet extends Applet
{
    Image i1;

    public void init()
    {
         i1=getImage(getCodeBase(),"a.png");
    }
    public void paint(Graphics g)
    {
        g.drawImage(i1,100,100,this);
    }
}

/*
<html>
     <body>
         <applet code="Image_applet" width="500" height="500">
         </applet>
    </body>
</html>
*/