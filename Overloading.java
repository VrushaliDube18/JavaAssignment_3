public class Overloading
{
public int sum(int a,int b)
{
return a + b;
}
public int sum(int a,int b,int c)
{
return a +b + c;
}
public static void main(String args[])
{
Moverloading m = new Moverloading();
int i= m.sum(10,20);
System.out.println("Addition is : " + i);
int j=m.sum(10,20,30);
System.out.println("Addition is : " + j);
}
}\