// Write a java program to accept n employee names from user. Sort them in 
// ascending order and Display them.(Use array of object and Static keyword)

import java.util.*;
class Demo
{
    Scanner sc=new Scanner(System.in);
    String ename;
    void accept()
    {
        System.out.println("Enter Employee name:");
        ename=sc.next();
    }
    void disp()
    {
        System.out.println("Employee Name="+ename);
    }
    static void Sort(Demo ob[],int n)
    {
        Demo temp;
        for(int pass=1; pass<n; pass++)
        {
            for(int i=0; i<n-pass; i++)
            {
                if((ob[i].ename.compareTo(ob[i+1].ename))>0)
                {
                    temp=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=temp;
                }
            }
        }
        for(int i=0; i<n; i++)
            {
                ob[i].disp();
            }
    }
    public static void main(String argp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        Demo ob[]=new Demo[n];
        System.out.println("Enter N Employee Name:");
        for(int i=0; i<n; i++)
        {
            ob[i]=new Demo();
            ob[i].accept();
        }
        System.out.println("Display Employee Name:");
        Sort(ob,n);
    }
}
