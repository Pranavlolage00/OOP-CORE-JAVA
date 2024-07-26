import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=sc.nextLine();

        String s2[]=s1.split(" ");
        System.out.println("Each Word in reverse order");
        for(String name : s2)
        {
            StringBuffer sbr=new StringBuffer(name);
            sbr.reverse();
            System.out.print(" "+sbr);
        }
    }
}