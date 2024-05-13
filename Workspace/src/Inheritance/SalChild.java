package Inheritance;

public class SalChild extends SalParent{
	float totalsal;

	void salaryslip() {
		
		super.deduct();
		totalsal=super.basicpay+super.bonus+super.hra-super.pf-super.deduction;
		System.out.println("Basic pay : "+basicpay);
		System.out.println("HRA allowance : "+hra);
		System.out.println("Bonus : "+bonus);
		System.out.println("PF : "+pf);
		System.out.println("Other Deductions : "+deduction);
		System.out.println("Total Salary after Deductions : "+totalsal);
	}

	public static void main(String[] args) {
		SalChild obj2=new SalChild();
		obj2.salaryslip();

	}

}
