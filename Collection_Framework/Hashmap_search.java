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
        // for a Key
        System.out.println("Enter key to search:");
        String k=sc.next();
        if(hm.containsKey(k))
               System.out.println("Key Found..");
        else 
        {
               System.out.println("Key Not Found...");
               System.exit(0);
        }
           // for a value    
        System.out.println("Enter value to search:");
        String k1=sc.next();
        if(hm.containsValue(k1))
              System.out.println("value Found....");
        else 
             System.out.println("Value Not Found....");
        System.out.println(hm);

    }
}
