import java.util.*;
class Parent
{
int value=10;
Parent()
{
System.out.println("parent constructor");
}
}
class Child extends Parent
{
int value=100;
Child()
{
System.out.println("child constructor");
}
}
class Main
{
public static void main(String args[])
{
Child obj=new Child();
System.out.println("child value:"+ obj.value);
Parent par=obj;
System.out.println("parent value:"+ par.value);
}
}