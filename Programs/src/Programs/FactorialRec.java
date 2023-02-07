package Programs;

public class FactorialRec 
{
	static int ifact=1;
	
	public static int fact(int ino)
	{
		if(ino>0)
		{
			ifact=ifact*ino;
			ino--;
			fact(ino);
		}
	return ifact;	
	}
	
  public static void main(String[] args) {
	System.out.println(fact(5));
}
}
