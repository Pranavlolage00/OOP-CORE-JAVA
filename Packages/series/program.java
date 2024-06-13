package series;
public class program
{
        public void feb(int n)
        {
            int f=0,s=1,t;
            System.out.println("fibonacii series=");
            System.out.print("0 ");
            for(int i=0; i<=n; i++)
            {
                 t=f+s;
                 System.out.print(t+" ");
                 f=s;
                 s=t;
            }
        }
        public void cube(int n)
        {
            System.out.println("\ncube series=");
            for(int i=0; i<n; i++)
            {
                System.out.print(i*i+" ");
            }
        }
        public void square(int n)
        {
            System.out.println("\nsquare series=");
            for(int i=0; i<n; i++)
            {
                System.out.print(i*i*i+" ");
            }
        }
}
