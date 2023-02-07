package Programs;

public class Fibonancy {
	
	public static void displayFiboSer(int ino)
	{
		int a=0,c=0,b=1;
		for(int i=1;i<ino;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		displayFiboSer(12);
	}

}
