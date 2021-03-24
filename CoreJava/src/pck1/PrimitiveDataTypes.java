package pck1;

public class PrimitiveDataTypes {
	
	public static int sum(int a,int b) {
		int c=a+b;
		return c;
		
	}
	public static float sum(float a,float b) {
		float c=a+b;
		return c;
	}
	public static String name(String a,String b) {
		String c=a+b;
		return c;
	}
	public static byte sum(byte a,byte b) {
		byte c=(byte) (a+b);
		return c;
	
	}
	public static char ch(char a) {
		char c=a;
		return c;
	}
	public static long l(long a,long b){
		long lg=a+b;
		return lg;
	}
	public static boolean x(boolean a) {
		boolean b=a;
		return b;
	}
	public static double d(double a,double b) {
		double d=a+b;
		return d;
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(sum(3, 7));
		System.out.println(sum(64.23f,32.8f));
		System.out.println(name("Sri","Navya"));
		System.out.println(sum(1, 2));
		System.out.println(ch('A'));
		System.out.println(l(1000000000, 22222222));
		System.out.println(x(25>23));
		System.out.println(d(64.23,32.8));

	}

}
