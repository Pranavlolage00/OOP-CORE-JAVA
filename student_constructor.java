import java.util.*;
class Student
{
    int rno;
    String name;
    float per;

   Student(int rno,String name,float per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
    void disp()
    {
        System.out.println("Student no="+rno);
        System.out.println("Student name="+name);
        System.out.println("Student percnetage="+per);
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit:");
         int n=sc.nextInt();
         Student ob[]=new Student[n];
         for(int i=0; i<n; i++ )
         {    
        System.out.println("enter rno:");
        int rno=sc.nextInt();
        System.out.println("enter name:");
        String name=sc.next();
        System.out.println("enter percentage:");
        float per=sc.nextFloat();
       ob[i]=new Student(rno,name,per);
         }
        System.out.println("display student inforamation=");
        for(int i=0; i<n; i++)
        {
            ob[i].disp();
        }
    }
}