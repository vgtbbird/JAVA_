package NumberIOStream;

public class Mathuse {
	public static void main(String [] args)
	{
		double a=-191.635;
		double b=41.94;
		int c=27,d=65;
		System.out.printf("%.3f's abs is %.3f%n",a,Math.abs(a));
		System.out.printf("%.2f %.0f%n", b,Math.ceil(b));
		System.out.printf("%.2f %.0f%n", b,Math.floor(b));
		System.out.printf("%.2f %.0f%n", b,Math.rint(b));
		System.out.printf("%d  %d  %d%n", c,d,Math.max(c, d));
		System.out.printf("%d  %d  %d%n", c,d,Math.min(c, d));
		double degrees=45.0;
		double radians=Math.toRadians(degrees);
		System.out.format("%f %f%n", 45.0,Math.tan(radians));
		System.out.format("%f",Math.cos(radians));
	}
}
