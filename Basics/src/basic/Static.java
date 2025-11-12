package basic;

public class Static
{
static int a=10;
Static()
{}
Static(int i)
{
	a=i;
}

static
{
	disp();
}

static void disp()/// we can called static methods from static block
{
	
	System.out.println(a);
}
public static void main(String[] args) {
	
//	Static s=new Static(3);
//	System.out.println(Static.a);
//	s.disp();
//	Static s2=new Static();
//	s2.disp();
}
}


//class B extends Static
//{
//	B()
//	{
//		super(2);
//	}
//}


