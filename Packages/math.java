import mathematics.*;
import java.util.*;
class main
{
       public static void main(String args[])
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        int a=sc.nextInt();
        System.out.println("enter value of b:");
        int b=sc.nextInt();
        Maximum ob=new Maximum();
        ob.max(a,b);
        Power ob1=new Power();
        ob1.pow1(a,b);
       }
}