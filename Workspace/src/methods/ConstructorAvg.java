package methods;

public class ConstructorAvg {
	public ConstructorAvg(int a,int b,int c) {
		this(20.3f,8.5f,5.5f);
		System.out.println("Avg of 3 integers is "+(a+b+c)/2);	
	}
	public ConstructorAvg(float a,float b,float c) {
		System.out.println("Avg of 3 float numbers is "+(a+b+c)/2);	
	}
	public static void main(String[] args) {
		ConstructorAvg obj=new ConstructorAvg(10,20,30);

	}

}
