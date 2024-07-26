import java.util.*;
import java.util.Arrays;
class Demo
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter limit:");
       int n=sc.nextInt();
       String s1[]=new String[n];
       System.out.println("enter N city Names:");
       for(int i=0; i<n; i++)
       {
          s1[i]=sc.next();
       }
       System.out.println("Sorted Array=");
       Arrays.sort(s1);
       for(String name : s1)
       {
          System.out.println(name);
       }

    }
}