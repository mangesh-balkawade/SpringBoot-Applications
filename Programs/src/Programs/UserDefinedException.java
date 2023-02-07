package Programs;

class BankException extends Exception
{
	public BankException() {
		// TODO Auto-generated constructor stub
		super("Account Balance Is 0");
	}
}


public class UserDefinedException
{
public static void main(String[] args)
{
  int balance=0;
  try {
  if(balance<=0)
  {
	  throw new BankException();
  }
  }
  catch (Exception e) {
	// TODO: handle exception
	  System.out.println(e.getMessage());
}
}
}
