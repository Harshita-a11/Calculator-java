import java.io.*;
import java.util.Scanner;
class Vowel
{
void findVowel()
{
String b=ob.toLowerCase();
 int count=0;
for(int i=0;i<b.length();i++)
{
 char j=b.charAt(i);
if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u')
{
count++;
}

}
System.out.println(count);
}
}
class B
{
public static void main(String...s)
{
Scanner sc = new Scanner(System.in);
String ob = sc.next();
Vowel v=new Vowel();
v.findVowel(ob);
}
}


