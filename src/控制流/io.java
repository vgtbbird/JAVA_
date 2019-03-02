package 控制流;

public class io 
{
	public static void main(String []  args)
	{
		int a=85;
		if(a>60)
			if(a>70)
				if(a>80)
					if(a>90)
						System.out.println("该同学分数为优秀");
					else 
						System.out.println("该同学分数为良好");
				else 
					System.out.println("该同学分数为中等");
			else 
				System.out.println("该同学分数为及格");
		else 
			System.out.println("该同学分数为不及格");
	}	
}
