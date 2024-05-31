class Person
{
    int pid,age;
    String pname,gender;

    Person()
    {
         pid=101;
         pname="Pranav";
         gender="male";
         age=18;
    }
    Person(int pid,String pname,int age,String gender)
    {
        this.pid=pid;
        this.pname=pname;
        this.age=age;
        this.gender=gender;
    }
    void disp()
    {
        System.out.println("person id="+pid);
        System.out.println("person name="+pname);
        System.out.println("person age="+age);
        System.out.println("person gender="+gender);
    }
    public static void main(String args[])
    {
        Person ob=new Person();
        ob.disp();
        Person ob1=new Person(102,"Nikita",18,"female");
        ob1.disp();
    }

}