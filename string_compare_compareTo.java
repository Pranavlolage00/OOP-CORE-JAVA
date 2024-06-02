import java.util.*;
class cmp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first string:");
      String s1=sc.next();
      System.out.println("enter second String:");
      String s2=sc.next();
      if(s1.compareTo(s2)==0)
          System.out.println("string are same...");
      else
          System.out.println("string are not same..");
   }
}