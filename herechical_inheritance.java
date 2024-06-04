import java.util.*;
class college
{
    int cno;
    String cname,addr;
    Scanner sc=new Scanner(System.in);

    void acceptc()
    {
        System.out.println("enter college number:");
        cno=sc.nextInt();
        System.out.println("enter college name:");
        cname=sc.next();
        System.out.println("enter college address:");
        addr=sc.next();
    }
    void disp()
    {
        System.out.println("college number="+cno);
        System.out.println("college name="+cname);
        System.out.println("college address="+addr);
    }
}
class teacher extends college
{
    int tno;
    String tname;
    float sal;



 void acceptt()
 {
    System.out.println("enter teacher number:");
    tno=sc.nextInt();
    System.out.println("enter teacher name:");
    tname=sc.next();
    System.out.println("enter teacher salary:");
    sal=sc.nextFloat();
     
 }

 void dispt()
 {
    System.out.println("teacher number="+tno);
    System.out.println("teacher name="+tname);
    System.out.println("teacher salary="+sal);

 }
}
class Student extends college
{
int rno;
String sname;
float per;

void accepts()
{
    System.out.println("enter student number:");
    rno=sc.nextInt();
    System.out.println("enter student name:");
    sname=sc.next();
    System.out.println("enter student percentage:");
    per=sc.nextFloat();    
}

void disps()
{
    System.out.println("student number="+rno);
    System.out.println("student name="+rno);
    System.out.println("student percentage="+rno);
}
}
class md
{
    public static void main(String arg[])
    {
        Student ob=new Student();
        ob.acceptc();
        ob.accepts();
        ob.disp();
        ob.disps();
        teacher ob1=new teacher();
        ob1.acceptc();
        ob1.acceptt();
        ob1.disp();
        ob1.dispt();
    }
}