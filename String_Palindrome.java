import java.util.*;
class Str
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s1=sc.next();
        StringBuffer sbr=new StringBuffer(s1);

        sbr.reverse();
        if(s1.equals(sbr.toString()))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}   