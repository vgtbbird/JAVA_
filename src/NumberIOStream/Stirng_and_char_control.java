package NumberIOStream;

import java.util.Scanner;

public class Stirng_and_char_control {
	public static void main(String [] args)
	{
		//��һ���ַ����в����ַ�
		String String5="Java programing!";
		char aChar=String5.charAt(7);      //charAt������������ַ�
		System.out.println(aChar);
		//��һ���ַ�����������ַ�����
		String string6=String5.substring(7);       //�����7��ʼ��ĩβ���ַ�����
		String string7=String5.substring(1,7);      //����±�1��ʼ�����±�6֮����ַ�����
		System.out.println(string7);               
		System.out.println(string6);  
				
		//�����ַ����ķ���
		String originalString="hello,my name is Jack,I am 18 years!";
		System.out.println(originalString);
		String spliteString[]=originalString.split(",");
		System.out.print("�����ŷָ��Ժ���ַ�������Ԫ��Ϊ:");
		int i;
		for(i=0;i<spliteString.length;i++)
		{
			System.out.print("["+spliteString[i]+"]");
		}
		System.out.println();
		spliteString=originalString.split("m");
		System.out.print("��m�ָ��Ժ���ַ�������Ԫ��Ϊ��");
		for( i=0;i<spliteString.length;i++)
		{
			System.out.print("["+spliteString[i]+"]");
		}
		System.out.println();
		System.out.println(22);
		System.out.println(originalString.subSequence(2,6));
		System.out.println(originalString.toUpperCase());
		System.out.println(originalString.toLowerCase());
		
		
		String email="zhangxiaoming@163.com";
		System.out.println(email.indexOf('a'));			//��ǰ���󣬵�һ��a
		System.out.println(email.lastIndexOf('a',5));        
		System.out.println(email.lastIndexOf('o'));         //�Ӻ���ǰ�����һ��o
 		String url="C:\\examples\\chapter05\\Test.java";
		System.out.println(url.lastIndexOf('\\'));
		System.out.println(url.substring(url.lastIndexOf('\\')+1));
		System.out.println(url.indexOf('e'));
		System.out.println(url.lastIndexOf("C:"));
		boolean sj=url.contains("java");
		System.out.println(sj);
		System.out.println(url.startsWith("C"));
		String A="hellollo";
		String B="hEllo";
		System.out.println(A.compareTo(B));  //�Ƚ� ���� 1 0 -1
		System.out.println(A.compareToIgnoreCase(B));  //�Ƚ� ���� 1 0 -1 ���Դ�Сд
		System.out.println(A.equals("h"));              //�����ַ�����������ַ������Ƿ���ͬ
		System.out.println(A.replace("llo", "sjls"));       
		System.out.println(A.replace(A, "helloa"));
		System.out.println(A.replaceAll("llo","sjl"));
		System.out.println(A.replaceFirst("llo","sjl"));
		System.out.println(A.regionMatches(1,B,1,3));
		System.out.println(A.regionMatches(true,1,B,1,3));  //��һ������Ϊtrue��ʾ���Դ�Сд��falseΪ������
		String endChar=""+1;
		System.out.println(endChar);
		
		
		//StringBuilder ��
		StringBuilder AA=new StringBuilder("java");
		StringBuilder BB=AA.append('c');
		System.out.println(AA);
		System.out.println(BB);
		System.out.println(AA.length());
		AA.append("greed");
		System.out.println(AA.length());
		System.out.println(AA.capacity());
		StringBuilder CC=new StringBuilder();
		CC.append("hello");
		System.out.println(CC.capacity());
		CC.setLength(4);                     //���ݲ��������ַ����еĳ���
		System.out.println(CC.length());   
		boolean fout=false;
		AA.append(fout);
		System.out.println(AA);
		char str1[]= {'A','D'};
		BB.append(str1);
		System.out.println(BB);
		System.out.println(AA);
		System.out.println(AA.append(str1,0,2));         //��str1���������0~��2-1����ӵ�AA
		System.out.println(AA.delete(0, 2));             //ɾ��AA 0~1������
		System.out.println(AA.deleteCharAt(3));          //ɾ��ָ�������±���ַ�
		
		//��������
		System.out.println(AA.insert(0, fout));            //��ָ������ǰ��������
		System.out.println(AA.insert(0,str1,0,2));         //����0֮ǰ����str1�����0~1������
		
		
		//�滻
		System.out.println(AA.replace(0, 1, "ad"));            //�á�ad������AA��0~1������
		AA.setCharAt(0, 'A');     
		System.out.println(AA);             //������˵����'A'����AA 0���������ַ�
		
		//��ת
		AA.reverse();
		System.out.println(AA);				
		System.out.println(AA.toString());			//AA.toString()�Ƿ���AA���ı���ʽ��Ҳ���Ƿ���AA
		
		
		
	}
}
