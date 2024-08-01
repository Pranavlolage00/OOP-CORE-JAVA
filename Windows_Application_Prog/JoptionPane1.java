import java.awt.*;
import javax.swing.*;
class Demo extends JFrame
{
    JLabel l1;
     Demo()
     {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

      l1=new JLabel("i am JFrame");
        add(l1);
        JOptionPane.showMessageDialog(this,"i am dialog box");
     }
    public static void main(String arg[])
    {
              new Demo();
    }
}