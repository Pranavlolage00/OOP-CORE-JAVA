import java.util.*;
class CricketPlayer
{
    int inings,notout,totalruns;
    float batavg;
    String name;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.next();
        System.out.println("enter no of inings:");
        inings=sc.nextInt();
        System.out.println("enter no of notout:");
        notout=sc.nextInt();
        System.out.println("enter totalruns:");
        totalruns=sc.nextInt();
        batavg=avg(totalruns,inings,notout);
    }
    static float avg(int totalruns,int inings,int notout)
    {
        return totalruns/(inings-notout);
    }
    static void sort(CricketPlayer ob[],int n)
    {
        int pass,i;
        for(pass=1; pass<n; pass++)
        {
            for(i=0; i<n-pass; i++)
            {
                if(ob[i].batavg<ob[i].batavg)
                {
                    CricketPlayer t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }
        for(i=0; i<n; i++)
        {
          System.out.println(ob[i].name + "\t" + ob[i].totalruns + "\t" + ob[i].inings + "\t" + ob[i].notout + "\t" + ob[i].batavg +"\t");
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        CricketPlayer ob[]=new CricketPlayer[n];
        System.out.println("enter n player info..");
        for(int i=0; i<n; i++)
        {
            ob[i]=new CricketPlayer();
            ob[i].accept();
        }
         sort(ob,n);
    }
}