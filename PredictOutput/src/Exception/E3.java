package Exception;

// Jari catch madhun return value send jali tari finally block execute hotoch tyamulh return 30 honar 
// finally block only does not executes of system.exist is there in the code

public class E3 
{
 public static void main(String[] args) {
	int i=add(1);
	System.out.println(i);
}
 
 static int add(int i)
 {
	 try
	 {
		 i=i/0;
	 }
	 catch (Exception e) {
		// TODO: handle exception
		 return 10;
	}
	 finally {
		 System.out.println("Finally");
		return 30;
	}
 }
}
