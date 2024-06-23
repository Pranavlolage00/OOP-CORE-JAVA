import java.awt.*;
class Demo extends Frame
{
    Label l1;

    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());;

        l1=new Label("I am a Frame");
        Panel p1=new Panel();
        p1.setBorder(BorderFactory.createLineBorder(Color.red));
        
        p1.setSize(250,250);
        p1.setForeground(Color.red);
        add(p1);
        //p1.setBackground(Color.black);
        p1.add(l1);

    }
    public static void main(String arg[])
    {
         new Demo();
    }

}