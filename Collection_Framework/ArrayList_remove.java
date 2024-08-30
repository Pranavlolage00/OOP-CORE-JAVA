import java.util.*;
class demo
{
   public static void main(String arg[])
   {
        Scanner sc=new Scanner(System.in);
        ArrayList a=new ArrayList();
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        System.out.println("Enter n Elements in an List");
        for(int i=0; i<n; i++)
        {
            a.add(sc.nextInt());
        }
        Collections.reverse(a);
        System.out.println(a);

   }
}