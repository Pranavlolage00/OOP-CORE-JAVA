import java.util.*;
class Main
{
    int fact(int n)
    {
        if(n==0)
           return 1;
        else
           return n*fact(n-1);
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        Main ob=new Main();
        int ans=ob.fact(n);
        System.out.println("factorial of Number="+ans);
    }
}