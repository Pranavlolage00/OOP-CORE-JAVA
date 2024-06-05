import java.util.*;
interface I1
{
    void area();
}
class Raectangle implements I1
{
    Scanner sc=new Scanner(System.in);
    float l,b;
     public void area()
      {
        System.out.println("enter length and bridth:");
        l=sc.nextFloat();
        b=sc.nextFloat();

        float ans=l*b;
        System.out.println("Area of Reactangle="+ans);
      }
}
class Square extends Raectangle implements I1
{
    float s;

    public void area()
    {
        super.area();
        System.out.println("enter Side:");
        s=sc.nextFloat();

        float ans=s*s;
        System.out.println("Area of Square="+ans);
    }

}
class Circle implements I1
{
    Scanner sc=new Scanner(System.in);
    float r;
    public void area()
    {
        System.out.println("enter Radius:");
        r=sc.nextFloat();

        float ans=3.14f*r*r;
        System.out.println("Area of Circle="+ans);
    }
}
class MD
{
    public static void main(String args[])
    {
        Square ob=new Square();
        Circle ob1=new Circle();
        ob.area();
        ob1.area();

    }
}