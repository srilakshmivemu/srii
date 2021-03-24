package pck1;

public class StaticUsage {
	int id;
	String name;
	static String org="OJAS";
	public void emp(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name+" "+org);
	}
	public String display()
	{
		//this.emp(21045, "Sri");
		return id+" "+name+" "+org;
	}
	public static void main(String[] args) {
		StaticUsage obj=new StaticUsage();
		obj.emp(21045, "Sri");
		obj.display();		
	}

}
