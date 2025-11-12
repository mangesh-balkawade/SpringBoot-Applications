package basic;

public class This 
{
	

  public This() {
		
	}

// Display@2ii
void Display()
  {
	  System.out.println(this);
  }

public static void main(String[] args) 
{
	This i1=new This();
	This i2=new This();
	System.out.println(i1);
//	System.out.println(i2);
	i1.Display();
//	i2.Display();
}
}


