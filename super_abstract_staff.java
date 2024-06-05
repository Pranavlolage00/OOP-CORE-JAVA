import java.util.*;
abstract class Staff
{
    protected int id;
    protected String name;
    
    Staff(int id,String name)
    {
          this.id=id;
          this.name=name;
    }
}
class OficeStaff extends Staff
{
    String dept;
    OficeStaff(int id, String name,String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    void disp()
    {
        System.out.println("Staff id="+id);
        System.out.println("staff name="+name);
        System.out.println("Staff Department="+dept);
    }
}
class MD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        OficeStaff ob[]=new OficeStaff[n];
        System.out.println("enter n staff information=");
        for(int i=0; i<n; i++)
        {
            System.out.println("enter id:");
            int id=sc.nextInt();
            System.out.println("enter name:");
            String name=sc.next();
            System.out.println("enter Department:");
            String dept=sc.next();
            ob[i]=new OficeStaff(id,name,dept);
        }
        System.out.println("Display n staff information..");
        for(int i=0; i<n; i++)
        {
            ob[i].disp();
        }  
    }

}