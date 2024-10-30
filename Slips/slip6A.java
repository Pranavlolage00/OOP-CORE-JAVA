import java.util.*;
//import java.io.*;
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
