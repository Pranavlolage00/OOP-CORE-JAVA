//  Define a class Product (pid, pname, price, qty). Write a function to accept the product 
//  details, display it and calculate total amount. (use array of Objects) 
import java.util.*;
class Product
{
    Scanner sc=new Scanner(System.in);
    int pid,qty;
    float price;
    String pname;

    void accept()
    {
        System.out.println("Enter Product id:");
        pid=sc.nextInt();
        System.out.println("Enter Product Name");
        pname=sc.next();
        System.out.println("Enter Product Price:");
        price=sc.nextFloat();
        System.out.println("Enter Product Quantity:");
        qty=sc.nextInt();
    }
    void disp()
    {
        System.out.println("Product Id="+pid);
        System.out.println("Product Name="+pname);
        System.out.println("Product Price="+price);
        System.out.println("Product Qunatity="+qty);
        System.out.println("Product Total Amount="+(price*qty));
    }
 public static void main(String arg[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int n=sc.nextInt();
    Product ob[]=new Product[n];
    for(int i=0; i<n; i++)
    {
         ob[i]=new Product();
         ob[i].accept();
    }
    System.out.println("Display Info..");
    for(int i=0; i<n; i++)
    {
         ob[i].disp();
    }
 }
}