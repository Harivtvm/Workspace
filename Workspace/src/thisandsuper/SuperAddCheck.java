package thisandsuper;

public class SuperAddCheck extends SuperAddition {
void check() {
	int a=super.sum(18,13);
	if(a%10==0) {
		System.out.println("Divisible by 10");}
	else {
		System.out.println("Not Divisible by 10");}
	
}
	public static void main(String[] args) {
		SuperAddCheck obj=new SuperAddCheck();
		obj.check();
	

	}

}
