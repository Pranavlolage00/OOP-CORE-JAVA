import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        Vector a1=new Vector();
        System.out.println("Enter n Numbers in an Vector");
        for(int i=0; i<n; i++)
        {
            int num=sc.nextInt();
            a1.add(num);
        }
        Enumeration e1=a1.elements();
        while(e1.hasMoreElements())
        {
            System.out.print(e1.nextElement()+"\t");
        }

    }
}