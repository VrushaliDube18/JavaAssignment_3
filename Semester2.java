class StudentData{
String Name = "Vrushali ";
int Rollno = 143;
void display(){
System.out.println("Name: "+Name+"\nRoll no : "+Rollno);
}
}
class Semester1 extends StudentData{
int Physics =55;
int Maths = 49;
int FDS = 21;
}
class Multilevel extends Semester1 {
int Graphics = 28;
int Python = 17;
int Chemistry = 55;
public static void main(String args[])
{
Multilevel s = new Multilevel();
float sum = s.Physics + s.Maths + s.FDS + s.Graphics + s.Chemistry + s.Python ;
float average = sum/6;
float percentage =( sum/270)*100;
s.display();
System.out.println("Average is : "+ average);
System.out.println("Percentage is : "+ percentage);
}
}


 