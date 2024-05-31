import java.util.*;
class Book
{
      int bno,qty;
      String bname;

      void accept()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter book no:");
        bno=sc.nextInt();
        System.out.println("enter book name:");
        bname=sc.next();
        System.out.println("enter quantity:");
        qty=sc.nextInt();
      }
     /* void disp()
      {
        System.out.println("book no="+bno);
        System.out.println("book name="+bname);
        System.out.println("book quantity="+qty);
      }*/
     static void search(Book ob[],int n)
     {
         int flag=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter book name to Display qty:");
         String bname1=sc.next();
         for(int i=0; i<n; i++)
         {
            if(ob[i].bname.equals(bname1))
            {
               flag=1;
               System.out.println(" BOOk Quantity="+ob[i].qty);
            }
         }
         if(flag==0)
            System.out.println("record not found..");
     }
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit:");
         int n=sc.nextInt();
         Book ob[]=new Book[n];
         System.out.println("enter n book info...");
         for(int i=0; i<n; i++)
         {
            ob[i]=new Book();
            ob[i].accept();
         }
         search(ob,n);

      }
}