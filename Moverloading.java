public class Moverloading
{
public int sum(int a,int b)
{
return a + b;
}
public int sum(int a,int b,int c)
{
return a +b + c;
}

public double sum(double a, double b)
{
return  a + b;
}
public double sum(double a, double b,double c)
{
return a + b + c;
}
public static void main(String args[])
{
Moverloading m = new Moverloading();
int i= m.sum(10,20);
System.out.println("Addition is : " + i);
int j=m.sum(10,20,30);
System.out.println("Addition is : " + j);
double k=m.sum(10.50,20.50);
System.out.println("Addition is : " + k);
double n= m.sum(10.25,20.50,30.25);
System.out.println("Addition is : " +n );
}
}


