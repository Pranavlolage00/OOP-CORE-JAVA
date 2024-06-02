import java.util.*;
class  student
{
    int rno,t=0;;
    String sname;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[6];
    
    void accepts()
    {
        System.out.println("enter rno:");
        rno=sc.nextInt();
        System.out.println("enter sname:");
        sname=sc.next();
    }
}
class exam extends student
{
    void acceptsub()
    {
        System.out.println("enter 6 subject marks=");
        for(int i=0; i<6; i++)
        {
            a[i]=sc.nextInt();
            t=t+a[i];
        }
    }   
}
class result extends exam
{
    void disp()
    {
        float per=t/6;
        System.out.println("Student number="+rno);
        System.out.println("student name="+sname);
        System.out.println("total marks="+t);
        System.out.println("percentage="+per);
    }
    public static void main(String args[])
    {
        result ob=new result();
        ob.accepts();
        ob.acceptsub();
        ob.disp();
    }
}