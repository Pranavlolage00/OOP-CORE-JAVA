import java.awt.*;
import javax.swing.*;
class Demo extends JFrame
{
    Label l1,l2;
      Demo()
      {
           setVisible(true);
           setSize(500,500);
           setLayout(new FlowLayout());

        l1=new Label("Check Even Or Odd");
        add(l1);
    String s1=JOptionPane.showInputDialog(this,"Enter Number:");
    int num=Integer.parseInt(s1);
      if(num%2==0)
      {
        System.out.println("Number is Even");
        //l2=new Label("Number is Even");
        //add(l2);
        l1.setText("Number is even");
      }
      else
      {
        System.out.println("Number is Even");
         //l2=new Label("Number is odd");
         //add(l2);
         l1.setText("Number is Odd");
      }
      }
    public static void main(String arg[])
    {
         new Demo();
    }
}