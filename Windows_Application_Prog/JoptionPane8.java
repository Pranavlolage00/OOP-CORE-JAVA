import java.awt.*;
import javax.swing.*;
class Demo extends JFrame
{
     Label l1;
     TextField t1;

      Demo()
      {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        l1=new Label("Result=");
        add(l1);
        t1=new TextField(60);
        add(t1);

        String s1=JOptionPane.showInputDialog(this,"Enter Number:");
        int num=Integer.parseInt(s1);
        int s=0;
        while(num>0)
        {
            int d=num%10;
            s=s+(d*d*d);
            num=num/10;
        }
        if(s==num)
             t1.setText("Number is Armstrong");
        else
             t1.setText("Number is Not Armstrong.");
      }
    public static void main(String arg[])
    {
        new Demo();
    }
}