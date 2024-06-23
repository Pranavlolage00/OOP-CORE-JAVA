import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1;
    Button b1,b2;
    TextArea ta1,ta2;
    Choice c1;
    Checkbox ch1,ch2,ch3,r1,r2;
    CheckboxGroup chg;
    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        setTitle("Registration");

        l1=new Label("Enter Name:");
        l2=new Label("Address:");
        l3=new Label("Gender:");
        l4=new Label("Hobbies:");
        l5=new Label("class:");
        l6=new Label("Display:");

        t1=new TextField(100);

        ta1=new TextArea();
        ta2=new TextArea(10,10);
        
        chg=new CheckboxGroup();
        r1=new Checkbox("Male",chg,true);
        r2=new Checkbox("FeMale",chg,false);
        ch1=new Checkbox("Coding");
        ch2=new Checkbox("BUg Hunting");
        ch3=new Checkbox("DEvelopment");

        c1=new Choice();
        c1.add("BCS");
        c1.add("BCA");
        c1.add("BSC");

        b1=new Button("Submit");
        b2=new Button("Clear");

        l1.setBounds(50,50,80,50);
        add(l1);
        t1.setBounds(130,65,100,25);
        add(t1);
        l2.setBounds(50,110,80,50);
        add(l2);
        ta1.setBounds(130,125,120,50);
        add(ta1);
        l3.setBounds(50,160,80,50);
        add(l3);
        r1.setBounds(150,160,80,50);
        add(r1);
        r2.setBounds(250,160,80,50);
        add(r2);
        l4.setBounds(50,210,80,50);
        add(l4);
        ch1.setBounds(130,210,100,50);
        add(ch1);
        ch2.setBounds(240,210,100,50);
        add(ch2);
        ch3.setBounds(350,210,100,50);
        add(ch3);
        l5.setBounds(50,260,80,50);
        add(l5);
        c1.setBounds(130,260,80,25);
        add(c1);
        l6.setBounds(50,310,80,50);
        add(l6);
        ta2.setBounds(130,310,200,100);
        add(ta2);
        b1.setBounds(130,420,100,25);
        add(b1);
        b2.setBounds(240,420,100,25);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
   public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
       {
          String name=t1.getText();
          String Address=ta1.getText();

          String Gender="";
          if(r1.getState()==true)
             Gender=Gender+"Male";
         if(r2.getState()==true)
             Gender=Gender+"FeMale";
        String hb="";
          if(ch1.getState()==true)
             hb=hb+"Coding";
          if(ch2.getState()==true)
             hb=hb+"Bug Hunting";
        if( ch3.getState()==true)
            hb=hb+"Development";
        
        String cls=c1.getSelectedItem();
          
         ta2.append("Name= "+name);
         ta2.append("\nAdresss= "+name);
         ta2.append("\nGender= "+Gender);
         ta2.append("\nclass= "+cls);
         ta2.append("\nHobbies= "+hb);
       }
       if(ae.getSource()==b2)
    {
        t1.setText("");
        ta1.setText("");
        ta2.setText("");
        r1.setState(false);
        r2.setState(false);
        ch1.setState(false);
        ch2.setState(false);
        ch3.setState(false);
        
    }
    }
    

   public static void main(String arg[])
   {
      new Demo();
   }
}