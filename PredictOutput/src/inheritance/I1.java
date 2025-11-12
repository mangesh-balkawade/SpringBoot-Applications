package inheritance;

// Super Vapral Nahi tar base class chya properties 0 ne initialised hotat
// Super should be first line;

class A
{
	 int a;
	int b;
	public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public A() {
		super();
	}
	
	
}

class B extends A
{
	int x;
	int y;
	public B(int a, int b, int x, int y) 
	{
		super(a,b);
		this.x = x;
		this.y = y;
//		super();
	}
	
	B()
	{
		
	}
}

public class I1 
{
  public static void main(String[] args) {
	B b=new B(1,2,3,4);
	System.out.println(b.a);
}
}
