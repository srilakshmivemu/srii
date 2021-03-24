package pck1;

public abstract  class AbstractClass {
	//with static
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	//abstract method
	public abstract void sum(int a,int b,int c);
	//final method
	public final int display(int a, int b) {
		int c=a*b;
		System.out.println("OJAS");
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
