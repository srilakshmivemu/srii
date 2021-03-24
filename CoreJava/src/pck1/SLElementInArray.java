package pck1;

public class SLElementInArray {

	public static void main(String[] args) {
		int n[]={10,20,30,40,50,60,70,80,98};
		int s=n[0];
		int l=n[0];
		for(int i=1;i<n.length;i++) {
			
			if(n[i]>l)
				l=n[i];
			else if(n[i]<s)
				s=n[i];
		}
		System.out.println("Largest Number is="+l);
		System.out.println("smallest Number is="+s);

	}
}
