//program to demonstrate inheritance and method overloading//
class Parent {
String name="Vrushali";
int balance=50000;
public void display(){
System.out.println("Name: "+name+" \nBalance: "+balance);
}
}

public class Child extends Parent
{
public static void main(String args[])
{
Child c=new Child();
c.display();
System.out.println(c.name);
System.out.println(c.balance);
}
}