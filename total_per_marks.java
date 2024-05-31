import java.util.*;
class student
{
    int rno,m1,m2,m3,m4,m5,m6,t;
    float per;
    String sname;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student number:");
        rno=sc.nextInt();
        System.out.println("enter student name:");
        sname=sc.next ();
        System.out.println("enter Six subject marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
    }
    void calc()
    {
        t=m1+m2+m3+m4+m5+m6;
        per=(float)t/6;
    }
    void disp()
    {
        System.out.println("student number="+rno);
        System.out.println("student name="+sname);
        System.out.println("Total Marks="+t);
        System.out.println("Percentage="+per);
    }
    public static void main(String args[])
    {
        student ob=new student();
        ob.accept();
        ob.calc();
        ob.disp();
    }
}