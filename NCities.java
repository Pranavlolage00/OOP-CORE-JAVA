import java.util.*;
class Demo
{
    static void sort(int a[],int n)
    {
        for(int pass=1; pass<n; pass++)
        {
            for(int i=0; i<n-pass; i++)
            {
                   if(a[i].compareTo(a[i+1])>0)
                   {
                     String temp=a[i];
                      a[i]=a[i+1];
                      a[i+1]=temp;
                   }
            }
            for(int i=0; i<n; i++)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter n City Names");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.next();
        }
        sort(a,n);
    }
}