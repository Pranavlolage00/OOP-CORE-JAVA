import java.util.*;
// Accept n elements in an ArrayList And Display....
class D
{
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit :");
        int n=sc.nextInt();
        ArrayList a=new ArrayList(n);
        System.out.println("Enter n Elements in an array");
        for(int i=0; i<n; i++)
        {
            String  item=sc.next();
            a.add(item);
        }
        System.out.println("Enter Element to Search Record..");
        String s1=sc.next();
        if(a.contains(s1))
              System.out.println("Record Found");
        else
              System.out.println("Record not Found...");
    }
}
