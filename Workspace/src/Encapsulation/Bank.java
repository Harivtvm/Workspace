package Encapsulation;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 4-digit pin : ");
	int pin=sc.nextInt();
	User obj=new User();
	obj.setPin(pin);
	obj.check(pin);
	
	
	

	}

}
