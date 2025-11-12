package Polymorphism;

// c++ madhe jar apan bobj.add() call kel tar error yeto  karan compiler jyacha object ahe tyat function chk karto so tyala tit add milal but 
// te parametrised hoto tyamul tyann error show kela tyasathi aplyala Base::fun() as vaprayala lagat mg compiler parent madhe jaun chk karto.

class A
{
	void add()
	{
		System.out.println("BAse Class");
	}
}

class B extends A
{
	
	void add(int a)
	{
		System.out.println("Derive class");
	}
}

public class P1 {
public static void main(String[] args) {
	B bobj=new B();
	bobj.add();
}
}
