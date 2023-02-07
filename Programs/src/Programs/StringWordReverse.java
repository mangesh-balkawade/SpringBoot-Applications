package Programs;

public class StringWordReverse 
{

	static String wordReverse(String s)
	{
		String ret="";
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			ret=ret+arr[i]+" ";
			
		}
		return ret.trim();
	}
	
	public static void main(String[] args) 
	{
		String sRet=wordReverse("the sky is blue");
		System.out.println(sRet);
	}
}
