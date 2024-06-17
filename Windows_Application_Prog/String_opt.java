import java.awt.*;
import java.awt.event.*;
class Str extends Frame implements ActionListener
{
   Label l1,l2;
   Button b1,b2;
   TextArea ta;
   TextField t1;

     Str()
     {
        setVisible(true);
        setSize(500,500);
        setTitle("String");
        setLayout(new FlowLayout());
        l1=new Label("Enter String:");
        Font f=new Font("gigi",Font.BOLD,20);
        l1.setFont(f);
        l1.setBackground(Color.red);
        l1.setForeground(Color.yellow);
        l2=new Label("Result");
        ta=new TextArea();
        t1=new TextField(10);
        b1=new Button("Ok");
        b2=new Button("exit");
        add(l1);add(t1);add(l2);add(ta);
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)
     {
        if(ae.getSource()==b1)
        {
            String s1=t1.getText();
            String s2[]=s1.split(" ");
            for(int i=0; i<s2.length; i++)
            {
                ta.append(s2[i]+"\n");
            }
        }
        if(ae.getSource()==b2)
        {
            dispose();
        }
     }
    public static void main(String arg[])
    {
        Str ob=new Str();
    }


}