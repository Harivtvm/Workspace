package Inheritance;
import java.util.Scanner;
public class SalGrandParent {
float basicpay;
float deduction;
float  bonus;
public void pay() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basicpay");
	basicpay=sc.nextFloat();
	System.out.println("Enter Deduction");
	deduction=sc.nextFloat();
	System.out.println("Enter Bonus");
	bonus=sc.nextFloat();
}

	public static void main(String[] args) {
		

	}

}
