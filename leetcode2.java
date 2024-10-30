import java.util.*;
class Demo
{
    void Show(int a[],int num,int n)
{
        for(int i=0; i<n; i++)
        {
            if(a[i]+a[i+1]==num)
            {
                System.out.println("["+i+","+(i+1)+"]");
                break;
            }
        }
}
    public static void main(String arg[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter N numbers in an array...");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Target to calculate");
        int num=sc.nextInt();
        ob.Show(a,num,n);
    }   
}