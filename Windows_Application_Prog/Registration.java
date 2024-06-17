import java.awt.*;
class Rgst extends Frame
{
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2;
    Choice c1,c2;
    Checkbox ch1,ch2,ch3,ch4,ch5,ch6;
    CheckboxGroup chg;
    TextArea ta;
    Button b1,b2;


    Rgst()
    {
        setVisible(true);
        setSize(700,700);
        setLayout(null);
        setBackground(Color.gray);
        setTitle("Registration Form");
        Font f=new Font("Consolas",Font.BOLD,20);
        l1=new Label("Registration Form");
        l1.setFont(f);
        l1.setForeground(Color.yellow);
        l1.setBounds(100,50,200,50);
        add(l1);
        l2=new Label("Candidate Full Name");
        l3=new Label("Father Full Name");
        l4=new Label("Age");
        l5=new Label("Gender");
        l6=new Label("Course");
        l7=new Label("Hobbies");
        l8=new Label("Address");

        t1=new TextField(60);
        t2=new TextField(60);
        c1=new Choice();
        for(int i=18; i<90; i++)
        {
            c1.add(""+i);
        }
        c2=new Choice();
        chg=new CheckboxGroup();
        ch1=new Checkbox("Male",chg,true);
        ch2=new Checkbox("Female",chg,false);
        ch3=new Checkbox("Drawing");
        ch4=new Checkbox("Singing");
        ch5=new Checkbox("Music");
        ch6=new Checkbox("Others");

        ta=new TextArea();
        b1=new Button("Save Details");
        b2=new Button("Clear All");
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);

        //l1.setBounds(100,50,200,50);
        l2.setBounds(100,100,200,50);
        l2.setForeground(Color.white);
        add(l2);

        l3.setBounds(100,150,200,50);
        l3.setForeground(Color.white);
        add(l3);

        l4.setBounds(100,200,200,50);
        l4.setForeground(Color.white);
        add(l4);

        l5.setBounds(100,250,200,50);
        l5.setForeground(Color.white);
        add(l5);

        l6.setBounds(100,300,200,50);
        l6.setForeground(Color.white);
        add(l6);

        l7.setBounds(100,350,200,50);
        l7.setForeground(Color.white);
        add(l7);

        l8.setBounds(100,400,200,50);
        l8.setForeground(Color.white);
        add(l8);

        t1.setBounds(310,110,250,25);
        add(t1);

        t2.setBounds(310,160,250,25);
        add(t2);

        c1.setBounds(310,210,150,25);
        add(c1);

        ch1.setBounds(310,260,60,25);
        ch1.setBackground(Color.white);
        add(ch1);

        ch2.setBounds(380,260,60,25);
        ch2.setBackground(Color.white);
        add(ch2);

        c2.setBounds(310,310,200,25);
        c2.add("java");
        c2.add("Web Devloper");
        c2.add("c-lang");
        c2.add("Python");
        c2.add("Bca");
        c2.add("Bcs");
        add(c2);    

        ch3.setBounds(310,360,70,25);
        ch3.setBackground(Color.white);
        add(ch3);

         ch4.setBounds(390,360,70,25);
        ch4.setBackground(Color.white);
        add(ch4);

         ch5.setBounds(470,360,70,25);
        ch5.setBackground(Color.white);
        add(ch5);

         ch6.setBounds(550,360,70,25);
        ch6.setBackground(Color.white);
        add(ch6);

        ta.setBounds(310,410,250,100);
        add(ta);

        b1.setBounds(310,520,100,25);
         b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        add(b1);

        b2.setBounds(420,520,100,25);
        add(b2);

    }
public static void main(String args[])
{
    Rgst ob=new Rgst();
}
}