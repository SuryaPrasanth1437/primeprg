package program;

public class PrimePrg
{

	public static void main(String[] args)
	{
		int i,j,flag;
		for(i=2;i<=50;i++)
		{
			flag=1;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					
				}
			}
			if(flag==1)
			{
				System.out.println(i+"is prime");
				
			}
		}
	}

}
