package Programs;

public class FibonancyUsingRecursion 
{
	static int first=0,second=1,third=0;
	static void fibonacySeries(int iMax)
	{
		
		if(third<iMax)
		{
			fibonacySeries(iMax);
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
	}
	
  public static void main(String[] args) 
  {
	fibonacySeries(10);
  }
}
