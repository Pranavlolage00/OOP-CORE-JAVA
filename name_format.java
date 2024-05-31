import java.util.*;
class Person
{
    String s1;

  Person(String s1)
  {
       this.s1=s1;
  }
  void disp()
  {
    String s2[]=s1.split(" ");
    for(int i=0; i<s2.length() i++)
    {
        String s1
    }
   

  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter Full name:");
      String s1=sc.nextLine();
      Person ob=new Person(s1);
      ob.disp();
  }
}