
import java.util.*;
public class Student
{
int marks;
int id;
String name;
Student(int id,int marks,String name)
{
this.id=id;
this.marks=marks;
this.name=name;
}
public String toString()
{
return "Id:"+id+"Marks:"+marks+"Name:"+name;
}
public static void main(String[] args)
{
ArrayList <Student> std = new ArrayList<>(); 
std.add(new Student(99,90,"Harshita"));
std.add(new Student(98,80,"Harshit"));
std.add(new Student(97,70,"Harsh"));
std.add(new Student(96,60,"Harshi"));
for(Student ob:std)
{
System.out.println(ob);
}
System.out.println("After replacing the Data");
std.set(1,new Student(98,81,"Harshit"));
for(Student ob:std)
{
System.out.println(ob);
}
System.out.println("After removing the Data");
std.remove(3);
for(Student ob:std)
{
System.out.println(ob);
}
}
}