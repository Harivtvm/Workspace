package Abstraction;
import java.util.Scanner;
public class HDFC implements RBI{
	
	public void reccurringdeposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be deposited monthly");
		double amount=sc.nextDouble();
		System.out.println("Enter the maturity period in years");
		double duration=sc.nextDouble();
		double s=(1+(RBI.interest/4));
		
		double p=(4*duration);
		double finalint=(amount*Math.pow(s, p));
		double maturity=(amount*(duration*12))+finalint;
		System.out.println(maturity);
		
	}

	public static void main(String[] args) {
		RBI obj=new HDFC();
		obj.reccurringdeposit();
		

	}

}
