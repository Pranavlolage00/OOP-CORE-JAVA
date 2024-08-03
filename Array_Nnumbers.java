import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter n Numbers in an array");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display N numbers of array");
        for(int i=0; i<n; i++)
        {
            System.out.printf("%d\t",a[i]);
        }
    }
}