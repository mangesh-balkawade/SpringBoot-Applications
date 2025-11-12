package basic;

interface first
{
	int i=10;
	default void fun()
	{
		System.out.println("1");
	}
}

interface second 
{
	int i=10;
	default void fun()
	{
		System.out.println("2");
	}
}


interface third 
{
	int i=10;
	default void fun()
	{
		System.out.println("3");
	}
}


public class InterfaceX implements first,second,third {
 public static void main(String[] args) {
	InterfaceX i1 =new InterfaceX();
	i1.fun(); // Override Jali method
	//System.out.println(i1.i);
	
}

@Override
public void fun() {
	// TODO Auto-generated method stub
	first.super.fun();
}


}
