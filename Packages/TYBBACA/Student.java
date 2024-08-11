package TYBBACA;
public class Student
{
   public int rno;
   public String sname;
   public float per;
      public Student(int rno,String sname,float per)
      {
          this.rno=rno;
          this.sname=sname;
          this.per=per;
      }
    public void disps()
    {
        System.out.println("Student Roll no="+rno);
        System.out.println("Student Name="+sname);
        System.out.println("Student percentage"+per);
    }
}