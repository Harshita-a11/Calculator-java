import java.io.IOException;
class LoginSystem
{
static void username(String s)throws IOException
{
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='@')
{
throw new IOException("ERROR");
}
}
}
static void password(int p)throws IOException
{
if(p==0)
{
throw new IOException("ERROR");
}
}
public static void main(String...s)throws IOException
{
try
{
username("@Babu");
password(01432);
}
catch(IOException e)
{
 System.out.println(e);
}
}
}