import java.util.*;
class check
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner("system.in");
        System.out.println("enter number to check:");
      int n=sc.nextInt();
        for( i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
        if(i==n)
           System.out.println("number is prime...");
        else
          System.out.println("number is not prime");
    }
}