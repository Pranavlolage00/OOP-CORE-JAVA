import java.util.*;
class Demo
{
   public static void main(String arg[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Limit:");
       int n=sc.nextInt();
       String s1[]=new String[n];
       System.out.println("Enter n names:");
       for(int i=0; i<n; i++)
       {
          s1[i]=sc.next();
       }
       System.out.println("Enter name to search:");
       String s2=sc.next();
       int i;
       for(i=0; i<n; i++)
       {
           if(s2.equals(s1[i]))
           {
              System.out.println("Record found at position="+i);
              break;
           }   
       }
       if(i==n)
          System.out.println("record Not Found...");
   }
}