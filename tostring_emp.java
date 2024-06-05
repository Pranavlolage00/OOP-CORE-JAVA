import java.util.*;
class Emp
{
    Scanner sc=new Scanner(System.in);
    int eno;
    String name;
    float sal;

    void accept()
    {
        System.out.println("enter employee number:");
        eno=sc.nextInt();
        System.out.println("enter employee name:");
        name=sc.next();
        System.out.println("enter employee salary:");
        sal=sc.nextFloat();
    }
    public String toString()
    {
        return "\nEmployee number="+eno+"\nEmployee name="+name+"\nEmployee Salary="+sal;
    }
    public static void main(String args[])
    {
        Emp ob=new Emp();
        ob.accept();
        System.out.println(ob);
        
    }
}