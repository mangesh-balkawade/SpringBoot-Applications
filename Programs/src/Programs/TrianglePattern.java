package Programs;

public class TrianglePattern 
{
  public static void main(String[] args) 
  {
	  int cols=7;
      int start=cols/2+2;
      int end=cols/2+2;
      
      for(int i=1;i<=(cols/2+1);i++,end=end+2)
      {
    	  for(int j=1;j<=cols;j++)
    	  {
    		  if((i+j)==start||(i+j==end)||i==(cols/2+1))
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
}
}
