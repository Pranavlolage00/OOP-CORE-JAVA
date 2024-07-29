class Demo
{
    int t=100;
    void show()
    {
         System.out.println("i am Show..!");
    }
    public static void main(String arg[])throws Exception
    {
        Demo ob=new Demo();
        //ob.show();
        Demo ob1=(Demo)ob.clone();
        //ob1.show();
        System.out.println(""+ob1.t);
    }
}
