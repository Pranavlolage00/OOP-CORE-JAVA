import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements MouseListener
{
    TextField t1;
    Demo()
    {
         setVisible(true);
         setSize(500,500);
         setTitle("Mouse Listener");
         setLayout(new FlowLayout());
         t1=new TextField(10);
         add(t1);
         addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        int x=me.getX();
        int y=me.getY();
        t1.setText(x+" "+y);
    }
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseReleased(MouseEvent me)
    {}   
    public static void main(String arg[])
    {
          new Demo();
    }
}