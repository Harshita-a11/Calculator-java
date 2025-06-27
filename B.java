import java.io.*;
class B
{
public static void main(String...s)
{
	try
{
FileOutputStream ob=new FileOutputStream("F1.txt");
String g="Java";
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
try
{
FileInputStream ob=new FileInputStream("F1.txt");
int i;
while(true)
{
i=ob.read();
if(i==-1)
{
break;
}
System.out.println((char)i);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}