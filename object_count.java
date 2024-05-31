class emp
{
    static int cnt;
    int eno;
    String name,dept;
    float sal;

    emp()
    {
        eno=101;
        name="om";
        dept="computer";
        sal=50000;
        cnt++;
    }
    emp(int eno,String name,String dept,float sal)
    {
        this.eno=eno;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
        cnt++;
    }
    void disp()
    {
        System.out.println("employee no="+eno);
        System.out.println("employee name="+name);
        System.out.println("employee department="+dept);
        System.out.println("employee salary="+sal);
        System.out.println("object count="+cnt);
    }
    public static void main(String args[])
    {
         emp ob=new emp();
         ob.disp();
         emp ob1=new emp(102,"ram","account",500000);
         ob1.disp();
        emp ob2=new emp(103,"sita","commerce",45000);
         ob2.disp();

    }

}