import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s1=sc.next();
        for(int i=s1.length()-1; i>=0; i--)
        {
             rev= rev + s1.charAt(i);
        }
        if(s1.equals(rev))
           System.out.println("string are palindrome..");
        else
            System.out.println("string are not plaindrome");
        /*StringBuffer sbr=new StringBuffer(s1);
        sbr.reverse();
        System.out.println(s1.compareTo(sbr)+" "+s1+" "+sbr);
        if(s1.compareTo(sbr)==0)
           System.out.println("String are palindrome"+sbr+" "+s1);
        else
           System.out.println("string are not palindrome.."+sbr);
        */
    }
}