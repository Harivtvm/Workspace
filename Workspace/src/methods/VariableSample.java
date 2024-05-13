package methods;
public class VariableSample {
	static int a=10;
	int b=20;
	
	public static void blue() {
		VariableSample obj=new VariableSample();
		/* call instance variable using object creation inside static method
		 */
		int c=a+obj.b;
		System.out.println(c);
	}
	public void red() {
		int d=b-a;
		System.out.println(d);
	}
	public static void main(String[] args) {
		VariableSample obj=new VariableSample();
		obj.red();
		VariableSample.blue();
		

	}

}
