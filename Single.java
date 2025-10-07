class Student{
int Physics =55;
int Maths = 49;
int FDS = 21;
}
class Single extends Student {
int Graphics = 28;
int Python = 17;
int Chemistry = 55;
public static void main(String args[])
{
Single s = new Single();
float sum = s.Physics + s.Maths + s.FDS + s.Graphics + s.Chemistry + s.Python ;
float average = sum/6;
float percentage =( sum/270)*100;
System.out.println("Average is : "+ average);
System.out.println("Percentage is : "+ percentage);
}
}


 