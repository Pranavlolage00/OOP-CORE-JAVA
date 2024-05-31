import java.util.*;
class emp1
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
        System.out.println("employee number="+eno);
        System.out.println("employee name="+ename);
        System.out.println("employee slary="+sal);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        emp1 ob[]=new emp1[n];
        System.out.println("enter n emp info...");
        for(int i=0; i<n; i++)
        {
            System.out.println("enter eno:");
            int eno=sc.nextInt();
            System.out.println("enter ename:");
            String ename=sc.next();
            System.out.println("enter slary:");
            float sal=sc.nextFloat();
            ob[i]=new emp1();
            ob[i].accept(eno,ename,sal);
        }
        System.out.println("display n employee infoarmation..");
        for(int i=0; i<n; i++)
        {
            ob[i].disp();
        }

    }
}