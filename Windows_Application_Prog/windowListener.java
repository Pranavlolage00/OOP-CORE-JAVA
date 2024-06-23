import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Demo extends JFrame implements WindowListener
{
    Demo()
    {
        setVisible(true);
        setSize(500,500);
        addWindowListener(this);
    }
    public void windowActivated(WindowEvent we)
    {
         System.out.println("window activated");
    }
    public void windowDeactivated(WindowEvent we)
    {
        System.out.println("window  deactivated");
    }
    public void windowOpened(WindowEvent we)
    {
        System.out.println("window Opened");
    }
    public void windowClosing(WindowEvent we)
    {
        System.out.println("windows Closed..");
        dispose();
    }
    public void windowDeiconified(WindowEvent we)
    {
        System.out.println("Windows Deciconified");
    }
    public void windowIconified(WindowEvent we)
    {
        System.out.println("window deiconified");
    }
    public void windowClosed(WindowEvent we)
    {
        System.out.println("window closed");
    }
public static void main(String arg[])
{
    Demo ob=new Demo();
}
}