package ¿ØÖÆÁ÷;

public class While {
	public static void main(String [] args)
	{
		int text[]=new int[200];
		int i=0;
		while(i<200)
		{
			text[i]=60;
			++i;
		}
		for(i=0;i<200;i++)
		{
			System.out.print(text[i]+" ");
			if((i+1)%10==0)
				System.out.println();
			
		}
	}
}
