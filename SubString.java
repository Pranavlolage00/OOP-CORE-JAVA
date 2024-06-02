import java.util.*;
class substring
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s1=sc.nextLine();
       String s2=s1.substring(0,11);
        System.out.println("substring="+s2);
     }
}