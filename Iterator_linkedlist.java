import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        LinkedList a1=new LinkedList();
        System.out.println("Enter n Numbers:");
        for(int i=0; i<n; i++)
        {
            int num=sc.nextInt();
            a1.add(num);
        }
        Iterator i1=a1.iterator();
        while(i1.hasNext()) // hasNext() method is check next Element present or not
        {
            System.out.println(i1.next()); // next() mexthod is used to retrive element and point the next element
        }

    }
}