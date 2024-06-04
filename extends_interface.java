interface I1
{
    void add(int a,int b);
    void square(int n);
}
interface I2 extends I1
{
     void cube(int n);
}

class Demo implements I1,I2
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("addition="+c);
    }
    public void square(int n)
    {
        int c=n*n;
        System.out.println("Square="+c);
    }
    public void cube(int n)
    {
        int c=n*n*n;
        System.out.println("cube="+c);
    }
}
class MD
{
    public static void main(String args[])
    {
        Demo ob=new Demo();
        ob.add(10,200);
        ob.square(5);
        ob.cube(6);
    }
}