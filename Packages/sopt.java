import sopration.*;
import java.util.*;
class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two Strings:");
        String s1=sc.next();
        String s2=sc.next();
         concat ob=new concat();
         ob.con(s1,s2);
         compare ob1=new compare();
         ob1.comp(s1,s2);
    }
}