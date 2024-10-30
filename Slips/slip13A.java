import java.util.*;
class MyArray
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        ArrayList a=new ArrayList(n);
        System.out.println("Enter n Elements in an array.");
        for(int i=0; i<n; i++)
        {
            int num=sc.nextInt();
            a.add(num);
        }
        System.out.println("Display Elements..");
        Collections.reverse(a);
        System.out.println("reverse Elements="+a);
    }
}