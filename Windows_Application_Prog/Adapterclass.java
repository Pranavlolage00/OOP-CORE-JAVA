import java.awt.*;
import java.awt.event.*;
class Demo extends Frame
{
    TextField t1;
    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        t1=new TextField(100);
        t1.setBounds(100,50,200,50);
        add(t1);
        addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent me)
           {
                int a=me.getX();
                int b=me.getY();
               t1.setText("value of x="+a+" value of y="+b);
           }
        }
        );
    }
    public static void main(String arg[])
    {
         new Demo();
    }
}
