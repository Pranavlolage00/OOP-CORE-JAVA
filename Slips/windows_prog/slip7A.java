import java.awt.*;
class Slip extends Frame
{
    Label l1;
    Slip()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setLocation(300,300);
        setBackground(Color.red);
        Font f=new Font("",Font.BOLD,20);
        setFont(f);
        l1=new Label("Dr. D Y Patil College");
        add(l1);
    }
    public static void main(String arg[])
    {
        new Slip();
    }
}