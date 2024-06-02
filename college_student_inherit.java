import java.util.*;
class college
{
    Scanner sc=new Scanner(System.in);
    int cno;
    String cname,addr;

    void acceptc()
    {
        System.out.println("enter college no:");
        cno=sc.nextInt();
        System.out.println("enter college name:");
        cname=sc.next();
        System.out.println("enter address:");
        addr=sc.next();
    }
}
class student extends college
{
     int rno;
     String sname;
     float per;

     void accepts()
     {
        System.out.println("enter rno:");
        rno=sc.nextInt();
        System.out.println("enter sname:");
        sname=sc.next();
        System.out.println("enter percentage:");
        per=sc.nextFloat();
     }
     void disp()
     {
         System.out.println("college no="+cno);
         System.out.println("college name="+cname);
         System.out.println("college adress="+addr);
         System.out.println("Student no="+rno);
         System.out.println("Student name="+sname);
         System.out.println("Student percentage="+per);
     }
     public static void main(String args[])
     {
        student ob=new student();
        ob.acceptc();
        ob.accepts();
        ob.disp();
     }
}