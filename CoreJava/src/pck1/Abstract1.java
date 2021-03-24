package pck1;

public class Abstract1 extends AbstractClass {

	public static void main(String[] args) {
		Abstract1 obj=new Abstract1();
		obj.sum(10, 20, 30);
		int d=obj.display(100,200);
		System.out.println(d);
		

	}

	@Override
	public void sum(int a, int b, int c) {
		c=a+b;
		System.out.println(c);
		
	}

}
