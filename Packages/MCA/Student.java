package MCA;
public class Student
{
    int rno;
    String sname;
    float per;
      public Student(int rno,String sname,float per)
       {
           this.rno=rno;
           this.sname=sname;
           this.per=per;
       }
    public void disp()
    {
        System.out.println("Student Roll no="+rno);
        System.out.println("Student Name="+sname);
        System.out.println("Student Percentage="+per);
    }
}