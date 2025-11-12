package inheritance;

// 3 classes astil tar jo aplya jawalhacha class ahe tya class chya properties ghetalya jatat.
// default apan kahi properties dilya ani constructor madhe jar 0 kel tar 0 value assighnes hoatat;

class A2
{
	int i=10;
	A2()
	{         
		i=0;   // i chi value 0 honar
		// jar i dila nahi tar 10 rahnar
	}
}
class B2 extends A2
{
	int i=12;
}
class C2 extends B2
{
	
}

public class I3 {
public static void main(String[] args)
{
	C2 c=new C2();
	System.out.println(c.i);
	A2 a=new A2();
	System.out.println(a.i);
}
}
