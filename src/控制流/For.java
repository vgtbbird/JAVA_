package ������;

import java.util.Locale;

public class For {
	public static void main(String [] args)
	{
		int i,j;
		int arrays[][]=new int[5][5];
		for(i=0;i<5;i++)
			for(j=0;j<5;j++)
				arrays[i][j]=i+j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				{
					System.out.print(arrays[i][j]+" ");
				}
			System.out.println();
		}
		
		//foreach�������
		System.out.println();
		int array2[]= {1,2,3,4,5};
		for(int element:array2)
		{
			System.out.print(+element+" ");
		}
		
		System.out.println();
		String names[]= {"��С��","sjsklj","sjlsk"};
		for(String name:names)
		{
			System.out.print(name+" ");
		}
		//ð������
		int temp;
		int array1[]= {58,234,343,112,555,23903,220};
		for(i=0;i<array1.length-1;i++)
			for(j=0;j<array1.length-1-i;j++)
			{
				if(array1[j]>array1[j+1])
				{
					temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		System.out.println();
		for(int fon:array1)
		{
			System.out.print(fon+"  ");
		}
		//foreach ���������ά����
		System.out.println();
		for(int att[]:arrays)
			{
				for(int fond:att)
			{
				System.out.printf("%4d ",fond);
				
			}
				System.out.format("%n");
			}
		
	}
}
