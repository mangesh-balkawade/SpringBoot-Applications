package Programs;

public class DiamondPattern 
{
  public static void main(String[] args) 
  {
	 int icols=15;
	 int start=icols/2+2,end=icols/2+2;
	 for(int i=1;i<=(icols/2+1);i++,end=end+2)
	 {
		 for(int j=1;j<=icols;j++)
		 {
			 if((i+j)>=start&&(i+j)<=end)
			 System.out.print("*");
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	 start=start+2;end=end-2;
	 for(int i=(icols/2+2);i<=(icols);i++,start=start+2)
	 {
		 for(int j=1;j<=icols;j++)
		 {
			 if((i+j)>=start&&(i+j)<=end)
			 System.out.print("*");
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
}
}
