import java.util.*;
class User
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The User-Name");
        String s1=sc.next();
        s1=s1.toUpperCase();
        System.out.println("Hello "+s1+" nice to meet you..");
    }
}