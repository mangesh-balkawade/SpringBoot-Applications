package Programs;

public class ArmStrong 
{

	public static boolean chkArmstrong(int ino)
	{
		int temp1=ino,temp2=ino,idigcnt=0,idigit=0,isum=0,ipower=1;
		while(temp1>0)
		{
			 idigcnt++;
			 temp1=temp1/10;
		}
		while(temp2>0)
		{
			idigit=temp2%10;
			for(int i=1;i<=idigcnt;i++)
			{
				ipower=ipower*idigit;
			}
			isum=isum+ipower;
			ipower=1;
			temp2=temp2/10;
		}
		if(isum==ino)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(chkArmstrong(371));
	}
}
