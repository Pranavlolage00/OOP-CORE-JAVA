import java.util.*;
class Cricket
{
    int pid,nout,ip,totr;
    String pname;
    float avg;
    void accept(int pid,int nout,int ip,int totr,String pname)
    {
        this.pid=pid;
        this.pname=pname;
        this.nout=nout;
        this.ip=ip;
        this.totr=totr;
        this.avg=(float)totr*nout/ip;
    }
     public static void calc(Cricket ob[],int n)
     {
        
        int index=0,i=0;
        float max=ob[i].avg;
        System.out.println("Players Information..");
       for(i=0; i<n; i++)
       {
          if(ob[i].avg>max)
          {
            max=ob[i].avg;
            index=i;
          }
       }
       System.out.println("Player Name="+ob[index].pname);
       System.out.println("Player ID="+ob[index].pid);
       System.out.println("Player NOUT="+ob[index].nout);
       System.out.println("Player Inings="+ob[index].ip);
       System.out.println("Player Name="+ob[index].pname);
       System.out.println("Player Total Runs="+ob[index].totr);
       System.out.println("Player avg="+ob[index].avg);
     }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Limit:");
       int n=sc.nextInt();
       Cricket ob[]=new Cricket[n];
       System.out.println("Enter n Players Information");
       for(int i=0; i<n; i++)
       {
          System.out.println("Enter Player Name:");
          String pname=sc.next();
          System.out.println("Enter Player ID :");
          int pid=sc.nextInt();
          System.out.println("Enter Player NOTOUTS:");
          int nout=sc.nextInt();
          System.out.println("Enter Player Inings:");
          int ip=sc.nextInt();
          System.out.println("Enter Player Total Runs:");
          int totr=sc.nextInt();
          ob[i]=new Cricket();
          ob[i].accept(pid,nout,ip,totr,pname);
       }
       calc(ob,n);
    }
}