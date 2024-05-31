import java.util.*;
class Mynumber
{
    private int n;

    Mynumber()
    {
       n=0;
    }
    Mynumber(int n)
    {
        this.n=n;
    }
     boolean isNegative()
    {
       if(n<0)
          return true;
        else
          return false;
    }
     boolean isPositive()
    {
       if(n>0)
          return true;
        else
          return false;
    }
     boolean isZero()
    {
       if(n==0)
          return true;
        else
          return false;
    }

    boolean isEven()
    {
       if(n%2==0)
          return true;
        else
          return false;
    }
        boolean isOdd()
    {
       if(n%2==1)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        Mynumber ob=new Mynumber(n);
        if(ob.isPositive())
             System.out.println("number is Positive...");
        if(ob.isNegative())
             System.out.println("number is negative..");
        if(ob.isZero())
            System.out.println("number is zero...");
        if(ob.isEven())
            System.out.println("number is even...");
        if(ob.isOdd())
            System.out.println("number is odd..");
    }
}