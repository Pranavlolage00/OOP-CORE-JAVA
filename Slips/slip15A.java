import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Limit:");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter n Numbers in an array");
       for(int i=0; i<n; i++)
       {
          a[i]=sc.nextInt();
       }
       System.out.println("Enter NUmber to search:");
       int num=sc.nextInt();
       int i=0;
       for(i=0; i<n; i++)
       {
          if(a[i]==num)
          {
            System.out.println("Index="+i);
             System.exit(0);
          }
       }
       if(i==n)
           System.out.println("Number Not Found in an array");

    }
}