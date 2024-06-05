import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
     int id;
     String name,dept;
     float sal;
   
    Employee()
    {
        id=101;
        name="om";
        dept="computer";
        sal=50000;
    }
    Employee(int id,String name,String dept,float sal)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
    }
    void accepte()
    {
        System.out.println("enter id:");
        id=sc.nextInt();
        System.out.println("enter Name:");
        name=sc.next();
        System.out.println("enter Departments:");
        dept=sc.next();
        System.out.println("enter Salary:");
        sal=sc.nextFloat();
    } 
     void dispe()  
     {
        System.out.println("employee id="+id);
        System.out.println("employee name="+name);
        System.out.println("employee salary="+sal);
        System.out.println("employee department="+dept);
     }
}
class Manager extends Employee
{
     float bonus;
       void acceptm()  
       {
        System.out.println("enter bonus:");
        bonus=sc.nextFloat();
       }
       void dispm()
       {
          System.out.println("Bonus="+bonus);
       }
}
class MD
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter limit:");
    int n=sc.nextInt();
    Manager ob[]=new Manager[n];
    System.out.println("enter n employee details:");
    for(int i=0; i<n; i++)
    {
          ob[i]=new Manager();
          ob[i].accepte();
          ob[i].acceptm();
    }
    System.out.println("display employee maximum slary=");
    float max=ob[0].sal+ob[0].bonus;
    int index=0;
    for(int i=0; i<n; i++)
    {
           if(ob[i].sal+ob[i].bonus>max)
           {
                max=ob[i].sal+ob[i].bonus;
                index=i;
           }
    }
    ob[index].dispe();
    ob[index].dispm();
}
}
