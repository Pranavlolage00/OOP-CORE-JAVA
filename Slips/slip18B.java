// Write a java program to copy the data from one file into another file, while copying 
// change the case of characters in target file and replaces all digits by ‘*’ symbol.import java.io.*;
//import java.util.*;
import java.io.*;
class Demo
{
    public static void main(String args[])throws Exception
    {
        FileInputStream f1=new FileInputStream("abc.txt");
        FileOutputStream f2=new FileOutputStream("pqr.txt");

        int k;
        while((k=f1.read())!=-1)
        {
            if(Character.isUpperCase(k))
                 f2.write(Character.toLowerCase((char)k));
            else if(Character.isLowerCase((char)k))
                 f2.write(Character.toUpperCase((char)k));
            else if(Character.isDigit((char)k))
                 f2.write('*');
            else
                f2.write(k);
        }

        f1.close();
        f2.close();

        System.out.println("opreation complete...");



    }
}