import java.util.*;
class Main
{
    int sum(int n)
    {
        if(n==0)
           return 0;
        else
           return n+sum(n-1);
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        Main ob=new Main();
        int ans=ob.sum(n);
        System.out.println("Sum of Digit="+ans);
    }
}