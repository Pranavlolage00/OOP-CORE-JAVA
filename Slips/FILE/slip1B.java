import java.io.*;
class File
{
    public static void main(String arg[])throws Exception
    {
         FileInputStream f1=new FileInputStream("abc.txt");
         FileOutputStream f2=new FileOutputStream("xyz.txt");
         int k;
         while((k=f1.read())!=-1)
         {
            f2.write(k);
         }
         System.out.println("File Copy Successfully..");
         f1.close();
         f2.close();
    } 

}