import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Demo extends Frame implements ActionListener
{
    Button b1;
    
    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        b1=new Button("Select Color");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            JColorChooser jc=new JColorChooser();
            Color c=jc.showDialog(this,"Select Color",Color.pink);
            setBackground(c);
        }
    }
     public static void main(String arg[])
     {
        new Demo();
     }
}