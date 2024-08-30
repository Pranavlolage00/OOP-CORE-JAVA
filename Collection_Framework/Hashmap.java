import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap hm=new HashMap();
        System.out.println("Enter How many Feilds:");
        int n=sc.nextInt();
        System.out.println("Enter N Key and Values:");
        for(int i=0; i<n; i++)
        {
            String key=sc.next();
            String value=sc.next();
            hm.put(key,value);
        }
        System.out.println(hm);

    }
}
