package exceptionhandling;

public class ExceptionHandle {

	public static void main(String[] args) {
try {
	int a=15/0;
	int b[]=new int[2];
	b[0]=1;
	b[1]=2;
	int c=b[4];
}
catch(ArithmeticException a) {
	System.out.println("divide by zero not possible");}
catch(ArrayIndexOutOfBoundsException b) {
	System.out.println("index error");}
catch(Exception c) {
	System.out.println("error");}
finally {
	System.out.println("handled");
}
	
}

	}


