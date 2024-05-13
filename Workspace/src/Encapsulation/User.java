package Encapsulation;

public class User {
	private int pin;
	public void setPin(int pin) {
		this.pin=pin;
	}
public void check(int pin) {
	if (pin==1001||pin==1234||pin==1212) {
		System.out.println("Access granted");}
		else {
			System.out.println("Access denied");
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
