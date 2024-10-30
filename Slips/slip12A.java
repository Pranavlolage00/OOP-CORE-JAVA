import java.util.*;
class Str
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        String s1[]=new String[n];
        System.out.println("Enter n String in an array..");
        for(int i=0; i<s1.length; i++)
        {
            s1[i]=sc.next();
        }
        System.out.println("Display Revrese String");
        for(int i=0; i<s1.length; i++)
        {
            StringBuffer sb=new StringBuffer(s1[i]);
            System.out.println("Revrese String="+(sb.reverse()));
        }
    }
}