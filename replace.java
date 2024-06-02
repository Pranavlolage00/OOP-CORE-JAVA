import java.util.*;
class replace
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s1=sc.nextLine();
        System.out.println("replae what:");
        String s3=sc.next();
        System.out.println("replace word:");
        String s4=sc.next();
        //s1=s1.replace(s3,s4);
        s1=s1.replaceAll(s3,s4);
        System.out.println("Replace String ="+s1);
     }
}