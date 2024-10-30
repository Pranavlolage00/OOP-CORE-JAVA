// 5
// 4 5
// 3 4 5
// 2 3 4 5
// 1 2 3 4 5 
import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
          int j=0;
        for(int i=5; i>=1; i--)
        {
            for(j=i; j<=5; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
