import java.util.*;
class Demo
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Limit:");
         int n=sc.nextInt();
         int a=1;
         for(int i=1; i<=n; i++)
         {
            for(int j=1; j<i; j++)
            {
                System.out.print((a++)%2);
            }
            System.out.println();
         }
     }
}