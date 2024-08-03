import java.util.*;
class Demo
{
    int eno;
    String ename;
    float sal;
  void accept(int eno,String ename,float sal)
  {
      this.eno=eno;
      this.ename=ename;
      this.sal=sal;
  }
  void disp()
  {
      System.out.println("Employee no="+eno);
      System.out.println("Employee name="+ename);
      System.out.println("Employee Salary="+sal);
  }
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit:");
    int n=sc.nextInt();
    Demo ob[]=new Demo[n];
    System.out.println("Enter n Employee information");
    for(int i=0; i<n; i++)
    {
        ob[i]=new Demo();
        System.out.println("Enter eno Ename sal");
        int eno=sc.nextInt();
        String ename=sc.next();
        float sal=sc.nextFloat();
        ob[i].accept(eno,ename,sal);
    }
    System.out.println("Display n employee information");
    for(int i=0; i<n; i++)
    {
          ob[i].disp();
    }
}
}