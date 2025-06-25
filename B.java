import java.io.*;
class B
{
public static void main(String...s)
{
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