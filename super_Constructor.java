class A
{
    A(int a,int b)
    {
        int c=a+b;
        System.out.println("addition1 in A="+c);
    }
}
class B extends A
{
     B(int a,int b)
     {
        super(54,35);
        int c=a+b;
        System.out.println("addition2 in B="+c);
     }
}
class MD
{
    public static void main(String args[])
    {
        B ob=new B(45,93);
    }
}