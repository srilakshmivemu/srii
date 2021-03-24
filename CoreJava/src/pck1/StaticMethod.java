package pck1;

public class StaticMethod {
//static and string return type with parameters
	public static String emp(String name,int id) {
		
		return name+" "+id;
		
	}
	
	public static void main(String[] args) {
		String x=emp("sri",21045);
		System.out.println(x);
		

	}

}


