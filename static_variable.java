class Stat
{
      static int a;
     void show()
     {
        a++;
        System.out.println("value of a="+a);
     }
     public static void main(String args[])
     {
        Stat ob=new Stat();
        ob.show();
        ob.show();
        ob.show();
        ob.show();
     }
}