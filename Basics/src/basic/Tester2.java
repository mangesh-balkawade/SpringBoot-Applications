package basic;

interface i
{
	int i=12;
	default void ifun()
	{
		System.out.println("ifun");
	}
	static void fun()
	{
		
	}
}

 class A implements i
{
	 static int a=12;
	
	 A()
	{
		a=14;
		System.out.println("cons");
	}
	 
	public void ifun()
	 {
		 System.out.println("fun a");
	 }
	 
	static
	{
		a=12;
		System.out.println("stat");///aadhi 
	}
	static void disp()
	{
		System.out.println("Static A");
	}
	
}
class B extends A
{
	static void disp()
	{
		System.out.println("Static B");
	}
	 
	 void fun()
	 {
		 System.out.println("fun B");
	 }
}


public class Tester2  
{
	int a=10;
public static void main(String[] args) 
{
	i.fun();
	
//	A a=new B();
//	a.disp();
//	a.fun();
	i a=new A();
	a.ifun();
	
}
}
