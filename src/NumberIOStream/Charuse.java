package NumberIOStream;

import java.util.Scanner;

public class Charuse {
	public static void main(String [] args)
	{
		System.out.println(" sjdkf");
		System.out.println("she say \"hello\" to me.");
		String studentName=new String("��С��");
		String names[]=new String[3];
		names[0]="��С��";
		System.out.println(names[0]);
		System.out.println(studentName);
		String studentName2="����";
		System.out.println(studentName2);
		String studentName3=null;
		studentName3="����";
		System.out.println(studentName3);
		int len=studentName3.length();
		System.out.println(len);
		String studentName4=studentName.concat(studentName3);
		System.out.println(studentName4);
		System.out.printf("%s%n", studentName4);
		System.out.println(studentName2+studentName3);
		//�ַ�����ת�����ַ���
		char helloarray[]= {'h','e','l','l','o'};
		String hellostring=new String(helloarray);
		System.out.println(hellostring);
		
		//�ַ���ת�����ַ�����
		String string1="helloworld";
		char  string2[]=string1.toCharArray();
		for(int element:string2)
		{
			System.out.print((char)element);
		}
		System.out.println();
		String string3=new String(string2);
		System.out.println(string3);
		
	
		
	}
}
