package Inheritance;

public class SalParent extends SalGrandParent {
float hra;
float pf;
public void deduct() {
	super.pay();
	hra=5*super.basicpay/100;
	pf=20*super.basicpay/100;
}


	
	public static void main(String[] args) {
		
		SalParent obj1=new SalParent();
		obj1.deduct();

		System.out.println(obj1.hra);
		System.out.println(obj1.pf);
	}

}
