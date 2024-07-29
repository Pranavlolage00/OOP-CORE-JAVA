import java.util.*;
class Demo
{
    int sum(int n)
    {
        if(n==0)
            return 0;
        else
           return n%10+sum(n/10);
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        Demo ob=new Demo();
        System.out.println("Sum Of Digit="+ob.sum(n));
    }
}