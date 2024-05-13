package Polymorphism;

public class Offseason extends Onseason {
void discount(int b) {
	int a=15*b/100;
	System.out.println("Discount of 15% applied : "+a);

}
	public static void main(String[] args) {
		Offseason obj=new Offseason();
		Onseason obj1=new Onseason();
obj.discount(10000);
obj1.discount(10000);
	}

}
