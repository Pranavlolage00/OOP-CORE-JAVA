class A
{
   void A()
    {
        System.out.println("i am Class A");
    }

}
class B
{
    B()
    {
        System.out.println("i am Class B");
    }
    public static void main(String args[])
    {
        A ob=new A();
        B ob1=new B();
        ob.A();
    }
    
}
