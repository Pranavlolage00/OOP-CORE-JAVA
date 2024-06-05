class A
{
    int x=55; // base class data memeber
}
class B extends A
{
    int x=44; // gloabl variable

    void disp()
    {
        int x=33; // local variable

        System.out.println("value of x="+x);
        System.out.println("value of x="+this.x);
        System.out.println("value of x="+super.x); 
        // super key-word is used to accessing baseclass data member
    }
}
class MD
{
    public static void main(String args[])
    {
        B ob=new B();
        ob.disp();
    }
}