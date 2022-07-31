class A
{
	void abc()
	{
		System.out.println("Parent class abc method");
	}
}
class B extends A
{
	void abc()
	{
		System.out.println("Child class abc method");
	}
}
public class Poly
{
	public static void main(String args[])
	{
		A obj1= new A();
		obj1.abc();
		B obj2= new B();
		obj2.abc();
	}
}