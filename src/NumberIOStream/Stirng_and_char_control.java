package NumberIOStream;

import java.util.Scanner;

public class Stirng_and_char_control {
	public static void main(String [] args)
	{
		//在一个字符串中操纵字符
		String String5="Java programing!";
		char aChar=String5.charAt(7);      //charAt获得索引处的字符
		System.out.println(aChar);
		//从一个字符串获得连续字符序列
		String string6=String5.substring(7);       //输出从7开始到末尾的字符序列
		String string7=String5.substring(1,7);      //输出下标1开始，到下标6之间的字符序列
		System.out.println(string7);               
		System.out.println(string6);  
				
		//操纵字符串的方法
		String originalString="hello,my name is Jack,I am 18 years!";
		System.out.println(originalString);
		String spliteString[]=originalString.split(",");
		System.out.print("按，号分割以后的字符串数组元素为:");
		int i;
		for(i=0;i<spliteString.length;i++)
		{
			System.out.print("["+spliteString[i]+"]");
		}
		System.out.println();
		spliteString=originalString.split("m");
		System.out.print("按m分割以后的字符串数组元素为：");
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
		System.out.println(email.indexOf('a'));			//从前往后，第一个a
		System.out.println(email.lastIndexOf('a',5));        
		System.out.println(email.lastIndexOf('o'));         //从后往前，最后一个o
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
		System.out.println(A.compareTo(B));  //比较 返回 1 0 -1
		System.out.println(A.compareToIgnoreCase(B));  //比较 返回 1 0 -1 忽略大小写
		System.out.println(A.equals("h"));              //参数字符序列与对象字符序列是否相同
		System.out.println(A.replace("llo", "sjls"));       
		System.out.println(A.replace(A, "helloa"));
		System.out.println(A.replaceAll("llo","sjl"));
		System.out.println(A.replaceFirst("llo","sjl"));
		System.out.println(A.regionMatches(1,B,1,3));
		System.out.println(A.regionMatches(true,1,B,1,3));  //第一个参数为true表示忽略大小写，false为不忽略
		String endChar=""+1;
		System.out.println(endChar);
		
		
		//StringBuilder 类
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
		CC.setLength(4);                     //根据参数控制字符序列的长度
		System.out.println(CC.length());   
		boolean fout=false;
		AA.append(fout);
		System.out.println(AA);
		char str1[]= {'A','D'};
		BB.append(str1);
		System.out.println(BB);
		System.out.println(AA);
		System.out.println(AA.append(str1,0,2));         //将str1数组的索引0~（2-1）添加到AA
		System.out.println(AA.delete(0, 2));             //删除AA 0~1的序列
		System.out.println(AA.deleteCharAt(3));          //删除指定索引下标的字符
		
		//插入数据
		System.out.println(AA.insert(0, fout));            //在指定索引前插入数据
		System.out.println(AA.insert(0,str1,0,2));         //索引0之前插入str1数组的0~1的序列
		
		
		//替换
		System.out.println(AA.replace(0, 1, "ad"));            //用“ad”代替AA中0~1的序列
		AA.setCharAt(0, 'A');     
		System.out.println(AA);             //这两行说明用'A'代替AA 0索引处的字符
		
		//翻转
		AA.reverse();
		System.out.println(AA);				
		System.out.println(AA.toString());			//AA.toString()是返回AA的文本形式，也就是返回AA
		
		
		
	}
}
