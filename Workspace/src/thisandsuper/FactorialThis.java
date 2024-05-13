package thisandsuper;

public class FactorialThis {
int num;
	void display(int a) {
		System.out.println("Factorial of "+num+" is : "+a);
	}
void factorial(int num) {
	this.num=num;
	int f=1;
	for(int i=num;i>=1;i--) {
		 f=f*i;
	}
	
	this.display(f);
}

	
	public static void main(String[] args) {
		FactorialThis obj=new FactorialThis();
		obj.factorial(10);
		

	}

}
