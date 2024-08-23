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
class Demo
{
    void disp(Emp ob)
    {
         System.out.println("Employee No="+ob.eno);
         System.out.println("Employee Name="+ob.ename);
         System.out.println("Employee No="+ob.sal);
    }
public static void main(String arg[])
{
    Emp ob=new Emp();
    Demo ob1=new Demo();
    ob.accept();
    ob1.disp(ob);
}
}
