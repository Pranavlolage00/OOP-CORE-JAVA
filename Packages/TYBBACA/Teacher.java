package TYBBACA;
public class Teacher
{
    int tid;
    String tname,sname;
      public Teacher(int tid,String sname,String tname)
      {
          this.rno=rno;
          this.sname=sname;
          this.tname=tname;
      }
    public void disps()
    {
        System.out.println("Teacher id="+tid);
        System.out.println("teacher name="+tname);
        System.out.println("Teacher Subject="+sname);
    }
}