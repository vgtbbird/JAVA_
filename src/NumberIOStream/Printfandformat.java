package NumberIOStream;

import java.util.Calendar;
import java.util.Locale;

public class Printfandformat 
{
	public static void main(String [] args)
	{
		long n=382112;
		System.out.printf("%d%n", n);
		System.out.printf("%08d%n", n);
		System.out.printf("%+08d%n", n);
		System.out.printf("%,8d%n", n);
		System.out.printf("%+,8d%n%n", n);
		double pi=Math.PI;
		System.out.format("%f%n", pi);
		System.out.format("%8.3f%n", pi);
		System.out.format("%-8.3f%n", pi);
		System.out.format(Locale.FRANCE,"%-8.4f%n", pi);
		Calendar c=Calendar.getInstance();      //获取表示当前日期的对象
		System.out.format("%tb %td %tY%n", c,c,c);
		System.out.format("%tl:%tM %tp%n", c,c,c);
		System.out.format("%tD%n", c);
	}
}
