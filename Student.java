public class Student{
String name;
int rollno;
int marks;

public Student(){
name="Vrushali";
rollno=143;
marks = 20;
System.out.println("Name:"+name+"\nRoll no:"+rollno+"\nMarks:"+marks);
}

public Student(String n){
name=n;
System.out.println("Name:"+name);
}
public Student(String n,int r){
name=n;
rollno=r;
System.out.println("Name:"+name+"\nRollno:"+rollno);
}
public Student(String n,int r,int m){
name=n;
rollno=r;
marks = m;
System.out.println("Name:"+name+"\nRoll no:"+rollno+"\nMarks:"+marks);
}
 
public static void main(String ags[])
{
Student s1=new Student();
Student s2=new Student("Vaishnavi");
Student s3=new Student("Janhavi",141);
Student s4=new Student("Diksha",142,20);
}
}


