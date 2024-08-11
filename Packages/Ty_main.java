import TYBBACA.*;
import java.util.*;
class Demo
{
     public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        Student ob[]=new Student[n];
        Teacher ob1[]=new Teacher[n];
        System.out.println("Enter n Student info..");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter rno:");
            int rno=sc.nextInt();
            System.out.println("Enter Name:");
            String sname=sc.next();
            System.out.println("Enter Per");
            float per=sc.nextFloat();
            ob[i]=new Student(rno,sname,per);
            ob[i].disps();
        }
        System.out.println("Enter n Teachers Info");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter tid:");
            int tid=sc.nextInt();
            System.out.println("Enter tname:");
            String tname=sc.next();
            System.out.println("Enter sname");
            String sname=sc.next();
            ob1[i]=new Teacher(tid,tname,sname);
        }
        System.out.println("Display teacher whos subject is java");
        for(int i=0; i<n; i++)
        {
            if(ob1[i].sname.equals("java"))
            {
                System.out.println("Teacher Name="+ob[i].tname);
                System.out.println("Teacher id="+ob[i].tid);
                
            }
        }
    }
}