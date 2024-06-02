class A
{
    int x,y,z;
    A()
    {
        x=11;
        System.out.println("i am Base class");
    }
}
class B extends A
{
    B()
    {
       y=78;
       System.out.println("i am Intermediate class");
    }
}
class C extends B
{
    C()
    {
        z=45;
        int c=x+y+z;
        System.out.println("i am Derived class");
        System.out.println("Addition="+c);
    }
    public static void main(String args[])
    {
        C ob=new C();
    }
}
