package Hash;

import java.util.*;
class ListTest{
public static void main(String[] args)
{
Set<Student> students = new HashSet<Student>();
students.add(new Student("vigneshwari",90,15));
students.add(new Student("vigneh",70,15));
students.add(new Student("eshwari",80,15));
students.add(new Student("hari",30,15));
students.add(new Student("vine",56,15));
Iterator itr = students.iterator();
while(itr.hasNext()){
Student students = itr.Next();
System.out.println(students.getSname() +""+students.getSmark()+""+students.getSage());
}

}

}