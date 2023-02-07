package Programs;

public class HackerRank 
{
 public static void main(String[] args) 
 {
	int arr[][]= {{0,18},{1,15},{0,20}};
	int imax=0;
	int worker=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length-1;j++)
		{
			int diff=arr[i][j]-arr[i][j+1];
			if(diff<0)
				diff=-diff;
			if(diff>imax)
			{
				imax=diff;
				worker=arr[i][j];
			}
			
		}
	}
	char c='A';
	for(int i=0;i<=worker;i++,c++)
	{
		if(i==worker)
			//return kar
			System.out.println(c);
	}
}
}
