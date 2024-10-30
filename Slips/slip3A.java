import java.util.*;
class Number
{
    static void calc(int n)
    {
        int num=n,res=0;
        
        while(n>0)
        {
            int d=n%10;
            res=res+(d*d*d);
            n=n/10;
        }
        if(res==num)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is Not armstrong");
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        calc(n);
    }
}