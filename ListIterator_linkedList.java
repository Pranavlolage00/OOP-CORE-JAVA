import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        LinkedList a1=new LinkedList();
        System.out.println("Enter n Numbers :");
        for(int i=0; i<n; i++)
        {
            int num=sc.nextInt();
            a1.add(num);
        }
        ListIterator it=a1.listIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"\t");
        }
        System.out.println("\n");
        while(it.hasPrevious())
        {
            System.out.print(it.previous()+"\t");
        }
        
    }
}