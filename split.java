import java.util.*;
class split
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        System.out.println("Replace String ="+s2[0]+s2[1]+s2[2]);
       
     }
}