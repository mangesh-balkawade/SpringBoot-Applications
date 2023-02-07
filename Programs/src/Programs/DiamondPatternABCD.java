package Programs;

public class DiamondPatternABCD
{
static void pattern(int row)
{
	int f=row+1,l=row+1;
	for( int i=1;i<=row;i++,l=l+2)
	{
		for(int j=1;j<(row*2);j++)
		{
		  if( ((i+j)>=f)&&((i+j)<=l) )
		   {
			   
	         System.out.print("*");
           }
		  else
			  System.out.print(" ");

		}
		System.out.println();
	}
	f=row+1+1;
	l=(row*3);
	for(int i=row+1;i<row*2;i++,f=f+2)
	{
		for(int j=1;j<row*2;j++)
		{
			if( ((i+j)>=f)&&((i+j)<=l) )
			   {
				   
		         System.out.print("*");
	           }
			  else
				  System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
}
public static void main(String[] args) {
pattern(4);	
}
}
