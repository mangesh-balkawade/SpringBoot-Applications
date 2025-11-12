package inheritance;

// Jar Base class reference ne jar child classs cha object kela tar te only base class chyach characteristics gheu shakat
// Virtual sarkh

class A1
{
	int i=10;
}

class B1 extends A1
{
	int i=12;
	int j=10;
}


public class I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A1 aobj=new B1();
         System.out.println(aobj.i);
      //   System.out.println(aobj.j); 
         // error
         
         A a=new A();
         System.out.println(a.a);
	}

}
