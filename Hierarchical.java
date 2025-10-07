class StudentData1
{
String Name = "Vrushali ";
int Rollno = 143;
void display(){
System.out.println("Name: "+Name+"\nRoll no : "+Rollno);
}
}

class Semester1 extends StudentData1
{
int Physics =55;
int Maths = 49;
int FDS = 21;
}

class Semester2 extends StudentData1
{
int Graphics = 28;
int Python = 17;
int Chemistry = 55;
}

class Hierarchical
{
public static void main(String args[])
{
Semester1 s = new Semester1();
float sum = s.Physics + s.Maths + s.FDS  ;
float average = sum/3;
float percentage =( sum/150)*100;

System.out.println(" ****SEMESTER 1****\n");
s.display();
System.out.println("\nAverage is : "+ average);
System.out.println("\nPercentage is : "+ percentage);

Semester2 p = new Semester2();
float add = p.Graphics + p.Python + p.Chemistry  ;
float ave = add/3;
float percent =( add/120)*100;

System.out.println("\n****SEMESTER 2****\n");
p.display();
System.out.println("\nAverage is : "+ ave);
System.out.println("\nPercentage is : "+ percent);
}
}

