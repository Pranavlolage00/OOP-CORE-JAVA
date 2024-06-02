import java.util.*;
class containent
{
    String conname,cname,sname;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
    
    System.out.println("enter containent:");
    conname=sc.next();
    }
}
class country extends containent
{
    void acceptc()
    {
   System.out.println("enter country:");
    cname=sc.next();
    }
}
class state extends country
{
    void accepts()
    {
  System.out.println("enter state:");
   sname=sc.next();
    }

  void disp()
  {
    System.out.println("Containent name="+conname);
    System.out.println("Country name="+cname);
    System.out.println("State name="+sname);
  }
  public static void main(String arg[])
  {
    state ob=new state();
    ob.accept();
    ob.acceptc();
    ob.accepts();
    ob.disp();
  }
}