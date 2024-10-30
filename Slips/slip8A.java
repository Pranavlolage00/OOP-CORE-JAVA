import java.util.*;
interface Shape
{
    abstract void area();
    final float PI=3.14f;
}
class Area implements Shape
{
    Scanner sc=new Scanner(System.in);
    public void area()
    {
        System.out.println("Enter Radius to Calculate area:");
        float r=sc.nextFloat();
          float ac=2*PI*r*r;
          float as=4*PI*r*r;
          System.out.println("Area of Circle="+ac);
          System.out.println("Area of Sphare="+as);
    }
    public static void main(String arg[])
    {
        Area ob=new Area();
        ob.area();
    }
}