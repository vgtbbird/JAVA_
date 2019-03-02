package ¿ØÖÆÁ÷;

import java.util.Scanner;

public class Switch1 {
	public static void main(String [] args)
	{
		
		String studentGrade;
		Scanner in=new Scanner(System.in);
		studentGrade=in.next();
		char studentScore=studentGrade.charAt(0);
		switch(studentScore)
		{
			case 'A':
			case 'a':
				System.out.println("ÓÅÐã");
				break;
			case 'B':
			case 'b':
				System.out.println("lianghao");
				break;
			case 'C':
			case 'c':
				System.out.println("zhongdeng");
				break;
			case 'D':
				System.out.println("jige");
				break;
			default:
				System.out.println("bujige");
		}
	}
}
