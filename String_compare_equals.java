import java.util.*;
class compare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string:");
        String s1=sc.next();
        System.out.println("enter second String:");
        String s2=sc.next();
      //boolean s3=s1.equals(s2);
       // System.out.println(s3);
        if(/*s3==true*/s1.equals(s2))
            System.out.println("string are same");
        else 
           System.out.println("String are not same..");
    }
}