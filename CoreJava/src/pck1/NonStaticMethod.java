package pck1;

public class NonStaticMethod {
	public String emp(String org) {
		String name="sr";
		int id=21045;
		//return org;
		return name+" "+id+" "+org;
		
	}

	public static void main(String[] args) {
		NonStaticMethod obj=new NonStaticMethod();
		String x=obj.emp("OJAS");
		System.out.println(x);
		
	}

}
