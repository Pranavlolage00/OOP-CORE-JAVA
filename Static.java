class Demo
{
  static
  {
      System.out.println("i am Static..");
       Demo ob=new Demo();
        Demo ob1=new Demo();
        ob.show();
        ob1.show();
  }
    static int a=5;
  static void show()
    {
         a++;
          System.out.println("i am show..");
          System.out.println("value of a="+a);
    }
    public static void main(String arg [])
  {
          System.out.println("I am Main...");
  }
  }
  