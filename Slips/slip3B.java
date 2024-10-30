 abstract class Shape
{
    abstract void area(float r,float h);
    abstract void volume(float r,float h);
}
class Cone extends Shape
{
   public void area(float r,float h)   
   {
       float res=2*3.14f*r*(r+h);
       System.out.println("Area of Cone="+res);
   }
   public void volume(float r,float h)
   {
      float res=(0.33f)*3.14f*r*2*h;
      System.out.println("Volume of Cone="+res);
   }
}
class Cyilender extends Shape
{
   public void area(float r,float h)   
   {
       float res=3.14f*r*(r+h);
       System.out.println("Area of Cyilender="+res);
   }
   public void volume(float r,float h)
   {
       float res=3.14f*r*2*h;
       System.out.println("Volume of Cyilender="+res);
   }
}
class MD
{
    public static void main(String arg[])
    {
        Cone ob=new Cone();
        Cyilender ob1=new Cyilender();
        ob.area(3.5f,4.55f);
        ob.volume(5.6f,7.4f);
        ob1.area(3.5f,4.55f);
        ob1.volume(5.6f,78.4f);
    }
}