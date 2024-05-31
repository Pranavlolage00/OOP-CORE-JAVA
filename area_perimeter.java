import java.util.*;
class React
{
 void area(float l,float b)
 {
    float ans=(float)l*b;
    System.out.println("area of reactangle="+ans);
 }
 void pm(float l,float b)
 {
    float ans=(float)2*(l*b);
    System.out.println("perimeter of reactangle="+ans);
 }
 public static void main(String args[])
 {
    React ob=new React();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter lenghth and bredth:");
    float l=sc.nextFloat();
    float b=sc.nextFloat();
    ob.area(l,b);
    ob.pm(l,b);
 }
}