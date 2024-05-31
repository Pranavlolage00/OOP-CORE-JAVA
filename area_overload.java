class Area
{
    void area(float r)
    {
        float ans=(float)3.14*r*r;
        System.out.println("area of circle="+ans);
    }
    void area(float l,float b)
    {
        float ans=(float)l*b;
        System.out.println("area of reactangle="+ans);
    }
    void  area(double b,double h)
    {
         double ans=0.5*b*h;
         System.out.println("area of traingle"+ans);
    }
    public static void main(String args[])
    {
        Area ob=new Area();
        ob.area(3.5f);
        ob.area(3.5f,5.2f);
        ob.area(22.33,44.55);

    }
}