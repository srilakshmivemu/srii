package pck1;

public class SumOfArray {

	public static void main(String[] args) {
		int n[]= {10,20,30,40};
		int s=0;
		for(int i=0;i<n.length;i++) {
			s=s+n[i];
		}
		System.out.println("Sum of elements in an Array="+s);
	}

}
