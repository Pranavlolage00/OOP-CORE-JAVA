import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Color;
class Font1 extends Frame
{
    Label l1;
    Font1()
    {
        setVisible(true);
        setTitle("String");
        setLayout(new FlowLayout());
        setSize(500,500);
        Font f=new Font("Consolas",Font.BOLD,20);
        l1=new Label("Hello World..");
        l1.setFont(f);
        l1.setBackground(Color.blue);
        l1.setForeground(Color.red);
        add(l1); 
    }
 public static void main(String arg[])
 {
    Font1 ob=new Font1();
 }
}