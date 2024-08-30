interface i1
{
     void Square(int n);
}
interface i2 
{
    void cube(int n);
}
class C implements i1,i2
{
    public void Square(int n)
    {
        int c=n*n;
        System.out.println("Square="+c);
    }
    public void cube(int n)
    {
        int c=n*n*n;
        System.out.println("Cube="+c);
    }
}
class MD
{
    public static void main(String arg[])
    {
        C ob=new C();
        ob.cube(5);
        ob.Square(5);
    }
}