class Volume
{
    void volume(float r)
    {
        float ans=4/3*r*r*r;
        System.out.println("volume of cone="+ans);
    }
    void volume(float a,float b)
    {
        float ans=1/3*a*a*b;
        System.out.println("volume of sphare="+ans);
    }
    void volume(double r,double h)
    {
        double ans=3.14*r*h;
        System.out.println("volume of cyilnder="+ans);

    }
    public static void main(String args[])
    {
        Volume ob=new Volume();
        ob.volume(3.5f);
        ob.volume(5.2f,6.3f);
        ob.volume(45.2,12.3);
    }
}