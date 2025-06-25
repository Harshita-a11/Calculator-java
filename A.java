import java.io.*;
class A
{
public static void main(String...s)
{
try
{
FileOutputStream ob=new FileOutputStream("F1.txt");
String g="BaBu";
byte b[]=g.getBytes();
byte a[]={'a','b','c'};
ob.write(a);
ob.write(b);
ob.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}