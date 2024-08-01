import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class imageList extends Applet implements ItemListener
{
      Image i1;
      Choice c1;
      public void init()
      {
          c1=new Choice();
          c1.add("1-Rocket");
          c1.add("2-Ganesha");
          c1.add("3-Mahadev");        
          add(c1);
          c1.addItemListener(this);
      }
      public void itemStateChanged(ItemEvent ie)
      {
         if(ie.getSource()==c1)
         {
              String s1=c1.getSelectedItem();
              i1=getImage(getCodeBase(),s1+".png");
              repaint();
         }
      }
      public void paint(Graphics g)
      {
           g.drawImage(i1,100,100,this);
      }
}
/*
<html>
    <body>
        <applet code="imageList" width="500" height="500">
        </applet>
    </body>
</html>
*/
