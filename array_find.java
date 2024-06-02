import java.util.*;
class find
{     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        String a[]=new String[n];    
        System.out.println("enter n names in an array..");
        for(int i=0; i<n; i++)
        {
           a[i]=sc.next();
        }
        System.out.println("enter name to search:");
        String s1=sc.next();
        int i;
        for( i=0; i<n; i++)
        {
             if(s1.equals(a[i]))
             {
                System.out.println("Record is found at "+i+" position");
                break;
             }
        }
        if(i==n)
          System.out.println("Record is not found..");
    }
}