import java.util.*;
class employee
{
    int eno;
    String ename;
    double sal;

    void accept(int eno1,String ename1,double sal1)
    {
        eno=eno1;
        ename=ename1;
        sal=sal1;
    }
    void disp()
    {
        System.out.println("employeee number="+eno);
        System.out.println("employee name="+ename);
        System.out.println("employee salary="+sal);
    }
    public static void main(String args[])
    {
        employee ob=new employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee number:");
        int eno=sc.nextInt();
        System.out.println("enter employee name:");
        String ename=sc.next();
        System.out.println("enter employee salary:");
        double sal=sc.nextDouble();
        ob.accept(eno,ename,sal);
        ob.disp ();
        }
}