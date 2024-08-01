class Demo
{
    public static void main(String arg)
    {
         System.out.println("One");
    }
    public static void main(int arg[])
    {
        System.out.println("two");
    }
    public static void main(float arg)
    {
        System.out.println("Three");
    }
    public static void main(String arg[])
    {
        System.out.println("Four");
        main(5.3f);
        int a[]={10,20,30,40,50};
        main(a);
    }
}