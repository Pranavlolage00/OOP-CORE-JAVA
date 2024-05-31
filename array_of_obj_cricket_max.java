import java.util.*;
class Cricket
{
    int pid,inings,notout,totalruns;
    float batavg;
    String pname;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter player id:");
        pid=sc.nextInt();
        System.out.println("enter Player Name:");
        pname=sc.next();
        System.out.println("enter totalruns:");
        totalruns=sc.nextInt();
        System.out.println("enter inings:");
        inings=sc.nextInt();
        System.out.println("enter notout:");
        notout=sc.nextInt();
        batavg=totalruns/(inings-notout);
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter limit:");
          int n=sc.nextInt();
          Cricket ob[]=new Cricket[n];
          System.out.println("enter n player info :");
          for(int i=0; i<n; i++)
          {
              ob[i]=new Cricket();
              ob[i].accept();
          }
          float max=ob[0].batavg;
          int index=0;
          for(int i=1; i<n; i++)
          {
              if(max<ob[i].batavg)
              {
                max=ob[i].batavg;
                index=i;
              }
          }
          System.out.println("maximum batavg player=");
          System.out.println(" player id="+ob[index].pid);
          System.out.println(" player name="+ob[index].pname);
          System.out.println("player totalruns="+ob[index].totalruns);
          System.out.println("player notout="+ob[index].notout);
          System.out.println("player batavg="+ob[index].batavg);
    }
}