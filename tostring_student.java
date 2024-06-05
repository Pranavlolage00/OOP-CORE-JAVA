import java.util.*;
class Student
{
    int rno;
    String name;
    static int cnt=0;

    Student()
    {
        rno=101;
        name="om";
        cnt++;
    }
    Student(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
        cnt++;
    }
    public String toString()
    {
        return "\nStudent roll no="+rno+"\nStudent Name="+name+"\nObject count="+cnt; 
    }
}
class MD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Student Rollno:");
        int rno=sc.nextInt();
        System.out.println("enter Student name:");
        String name=sc.next();
        Student ob=new Student(rno,name);
        Student ob1=new Student(rno,name);
        System.out.println(ob);
        System.out.println(ob1);
    }
}