interface shape
{
    final float PI=3.14f;
    public abstract void area(float r);
   public abstract void sphare(float r);
}
class Demo implements shape
{
    public void area(float r)
    {
        float res=PI*r*r;
        System.out.println("area of circle="+res);
    }
   public void sphare(float r)
    {
          float ans=4*PI*r*r;
          System.out.println("area of sphare="+ans);
    }
}
class MD
{
    public static void main(String args[])
    {
        Demo ob=new Demo();
        ob.area(3.5f);
        ob.sphare(5.6f);
    }
}