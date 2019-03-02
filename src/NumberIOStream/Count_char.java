package NumberIOStream;

public class Count_char {
	public static void main(String [] args)
	{
		String string1="hello,my name is Jack,I am 18 years!";
		int countLetters=0,countNumbers=0,countOthers=0;
		char string2[]=string1.toCharArray();
		for(int i=0;i<string2.length;i++)
		{
			if(string2[i]<='z'&&string2[i]>='a'||string2[i]<='Z'&&string2[i]>='A')
				countLetters++;
			else if(string2[i]>='0'&&string2[i]<='9')
				countNumbers++;
			else countOthers++;
		}
		System.out.println("字母个数是:"+countLetters+"\n数字个数是:"+countNumbers+"\n其他字符个数是:"+countOthers);
	}
}
