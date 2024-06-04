import java.util.*;
interface operations
{
    final float PI=3.14f;
    void area();
    void volume();
}
class cylinder implements operations
{
    Scanner sc=new Scanner(System.in);
    float r,h;
    public void area()
    {
        System.out.println("enter radius for area:");
        r=sc.nextFloat();
        System.out.println("enter height for area:");
        h=sc.nextFloat();

        float res=PI*r*r*h;
        System.out.println("area of cylinder="+res);
    }
    public void volume()
    {
        System.out.println("enter radius for volume:");
        r=sc.nextFloat();
        System.out.println("enter height for volume:");
        h=sc.nextFloat();

        float res=(2*PI*r*h)+(2*PI*r*r);
        System.out.println("volume of cylinder="+res);
   }
}
class MD
{
    public static void main(String args[])
    {
        cylinder ob=new cylinder();
        ob.area();
        ob.volume();
    }
}

