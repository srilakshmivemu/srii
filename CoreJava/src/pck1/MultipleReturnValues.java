package pck1;

public class MultipleReturnValues {

	public static void main(String[] args) {
		int a[]=operators(10,20);
		System.out.println("add is="+a[0]);
		System.out.println("sub is="+a[1]);
		System.out.println("mul is="+a[2]);
		System.out.println("div is="+a[3]);
		System.out.println("mod is="+a[4]);

	}

	private static int[] operators(int i, int j) {
		
		int add,sub,mul,div,mod;
		
		add=i+j;
		sub=i-j;
		mul=i*j;
		div=i/j;
		mod=i%j;
		int b[]= {add,sub,mul,div,mod};
		return b;
	}

}
