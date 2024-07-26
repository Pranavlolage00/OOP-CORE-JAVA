import java.util.*;
class Demo
{
   public static void main(String arg[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");
       String s1=sc.nextLine();
       for(int i=0; i<s1.length(); i++)
       {
         if(s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I'|| s1.charAt(i)=='O' || s1.charAt(i)=='U')
         // AS IT IS SMALL LETTERS
          {
              System.out.println(s1.charAt(i));
          }
       }
   }
}