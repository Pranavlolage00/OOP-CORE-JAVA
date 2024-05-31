import java.util.*;
class username
{
    String s1;

    username(String s1)
    {
        this.s1=s1;
    }

    void disp()
    {
          System.out.println ("Hello "+s1.toUpperCase()+" nice to meet you...!");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Username:");
        String s1=sc.next();
        username ob=new username(s1);
        ob.disp();
    }
}