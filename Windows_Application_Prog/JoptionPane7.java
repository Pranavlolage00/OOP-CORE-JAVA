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
        
        l1=new Label("I am Label..!");
        add(l1);

       String s1=JOptionPane.showInputDialog(this,"Enter Number:");
       System.out.println("Input Number="+s1);

     }
     public static void main(String arg[])
     {
         new Demo();
     }
}
