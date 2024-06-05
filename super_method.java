class A
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("addition1="+c);
    }
}
class B extends A
{
    void add(int a,int b)
    {
     
        int c=a+b;
        System.out.println("addition2="+c);
         super.add(a,b);
    }
}
class MD
{
    public static void main(String args[])
    {
        B ob=new B();
        ob.add(45,63);
         ob.add(45,63);
    }
}