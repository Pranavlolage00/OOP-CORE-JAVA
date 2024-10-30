import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
       String s1=sc.nextLine();
       for(int i=0; i<s1.length(); i+=2)
       {
            System.out.print(" "+s1.charAt(i));
       }
    }
}