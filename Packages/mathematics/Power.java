package mathematics;
public class Power
{
    public void pow1(int x,int y)
    {
        int a=1;

        for(int i=1; i<=y; i++)
        {
            a=a*x;
        }

        System.out.println("Power="+x+"^"+y+"="+a);    
    }
}