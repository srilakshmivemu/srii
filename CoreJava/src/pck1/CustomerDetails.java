package pck1;

public class CustomerDetails extends BankDetails {
	public void new_customer(String name,String bankname,int accountNumber,float amount) {
		System.out.println(name+" "+bankname+" "+accountNumber+" "+amount);
	}
	public void old_customer(String name,String bankname,int accountNumber,float amount) {
		System.out.println(name+" "+bankname+" "+accountNumber+" "+amount);
	}
	public static void main(String[] args) {
		CustomerDetails obj=new CustomerDetails();
		obj.new_customer("Sri", "citybank", 123456789, 10000);
		obj.old_customer("Navya", "HDFC", 987654321, 20000);
		

	}

}
