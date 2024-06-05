import java.util.*;
class Circle
{
    Scanner sc=new Scanner(System.in);
    void area()
    {
        System.out.println("enter radius:");
        float r=sc.nextFloat();

        float ans=3.14f*r*r;
        System.out.println("Area of Circle="+ans);
    }
}
class Cyilender extends Circle
{
       void area()
       {
          super.area();
          System.out.println("enter radius and height:");
          float r=sc.nextFloat();
          float h=sc.nextFloat();
          float ans=(2*3.14f*r*h)+(2*3.14f*r*r);
          System.out.println("Area of Cyilneder="+ans);
       }
}
class MD
{
    public static void main(String args[])
    {
        Cyilender ob=new Cyilender();
        ob.area();
    }
}
