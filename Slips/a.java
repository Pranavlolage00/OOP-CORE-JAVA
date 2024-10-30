import java.util.*;
class NumberIsZero extends Exception
{
     public String toString()
    {
        return "Number Is Zero";
    }
}
class Number
{
    static void check(int n)
    {
    //     int l=0,n1=0,d=0;
    //     n1=n;
    //     l=n%10;
    // do{
    //     d=n1%10;
    //     n1=n1/10;
    // }while(n1>9);
    // System.out.println("Sum of first and last digit is="+(l+n1));
     int a=n%10;
    int b=0;
    while(n>0)
    {
        b=n;
        n=n/10;
    }
    System.out.println(""+(a+b));

}
    public static void main(String arg[])
   {
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        if(num==0)
        {
            throw new NumberIsZero();
        }
        else
           check(num);
       }
       catch(Exception e)
       {
         System.out.println(e);
       }
   }
}