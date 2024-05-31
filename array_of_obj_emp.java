import java.util.*;
class emp
{
    int eno;
    String name;
    float sal;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee number:");
        eno=sc.nextInt();
        System.out.println("enter ename:");
        name=sc.next();
        System.out.println("enter salary:");
        sal=sc.nextFloat();
    }
    void disp()
    {
        System.out.println("employee number="+eno);
        System.out.println("employe name="+name);
        System.out.println("employee slary="+sal);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        emp ob[]=new emp[n];
        System.out.println("enter n employee information...");
        for(int i=0; i<n; i++)
        {
            ob[i]=new emp();
            ob[i].accept();
        }
        System.out.println("display n emp info....");
        for(int i=0; i<n; i++)
        {
            ob[i].disp();
        }

    }
}