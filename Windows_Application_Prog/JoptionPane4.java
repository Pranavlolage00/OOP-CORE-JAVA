import java.awt.*;
import javax.swing.*;
class Demo extends JFrame
{
    Label l1;
     Demo()
     {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        l1=new Label("I am Label");
        add(l1);

        JOptionPane.showMessageDialog(this,"i am Information","Alert",JOptionPane.INFORMATION_MESSAGE);
     }
    public static void main(String arg[])
    {
           new Demo();
    }
}