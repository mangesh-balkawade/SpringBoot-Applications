package Programs;

public class Recursion {
	int ino1=0;
	int isum=1;
	static int i;
	
	public  int fact(int ino)
	{
		this.ino1=ino;
		isum=isum*ino;
		this.ino1--;
		if(this.ino1>0)
		{
			this.fact(ino1);
		}
		return isum;
	}
public static void main(String[] args) 
{
	int ino;

   Recursion r=new Recursion();
   System.out.println(r.fact(3));
   System.out.println(Recursion.i);
}
}
