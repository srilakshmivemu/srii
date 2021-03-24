package pck1;

public class ReverseNum {

	public static void main(String[] args) {
		int num=543,r=0;
		while(num!=0) {
			
			int a=num%10;
			r=r*10+a;
			num=num/10;
			
		}
		System.out.println("reverse number:"+r);
	}

}
