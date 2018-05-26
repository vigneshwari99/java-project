package Hash;

class Student{
private String Sname;
private int Smark;
private int Sage;
public Student(String name,int mark,int age){
Sname = name;
Smark = mark;
Sage = age;
}
public String getSname()
{
return Sname;
}
public int getSmark()
{
return Smark;
}
public int getSage()
{
return Sage;
}
}