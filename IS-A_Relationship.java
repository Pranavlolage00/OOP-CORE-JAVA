import java.util.*;
class Emp
{
    int eno;
    String ename;
    float sal;
     void accept()
     {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter employeee Number:");
    this.eno=sc.nextInt();
    System.out.println("Enter employeee name:");
    this.ename=sc.next();
    System.out.println("Enter employeee Salary:");
    this.sal=sc.nextFloat();
     }
}
class Demo extends Emp
{
    void disp()
    {
         System.out.println("Employee No="+eno);
         System.out.println("Employee Name="+ename);
         System.out.println("Employee No="+sal);
    }
public static void main(String arg[])
{
    Demo ob=new Demo();
    ob.accept();
    ob.disp();
}
}
