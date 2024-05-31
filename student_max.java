import java.util.*;
class Student
{
    int rno;
    float per;
    String sname;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Student rno:");
        rno=sc.nextInt();
        System.out.println("enter student Name:");
        sname=sc.next();
        System.out.println("enter per:");
        per=sc.nextFloat();
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter limit:");
          int n=sc.nextInt();
          Student ob[]=new Student[n];
          System.out.println("enter n Student info :");
          for(int i=0; i<n; i++)
          {
              ob[i]=new Student();
              ob[i].accept();
          }
          float max=ob[0].per;
          int index=0;
          for(int i=1; i<n; i++)
          {
              if(max<ob[i].per)
              {
                max=ob[i].per;
                index=i;
              }
          }
          System.out.println("maximum per student=");
          System.out.println(" student roll no="+ob[index].rno);
          System.out.println(" student name="+ob[index].sname);
          System.out.println("student per="+ob[index].per);
    }
}