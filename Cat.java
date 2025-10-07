class Animal{
String color;
public void voice(){
System.out.println("I have a cat");
}
}
public class Cat extends Animal
{
public void work(){
System.out.println("Her name is Pinky ");
}
public static void main(String args[])
{
Cat c=new Cat();
c.voice();
c.work();
c.color="Pink";
System.out.println("The color of Cat is "+c.color);
}
}
