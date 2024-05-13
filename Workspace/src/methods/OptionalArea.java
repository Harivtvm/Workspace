package methods;
import java.util.Scanner;
public class OptionalArea {
	public OptionalArea(double r) {
		System.out.println("Area of circle is "+(3.14*r*r));
	}
	public OptionalArea(double l,double b) {
		System.out.println("Area of rectangle is "+(l*b));
	}
	public OptionalArea(float s) {
		System.out.println("Area of square is "+(s*s));
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("Which area you want to calculate?");
			System.out.println("a)Circle  b)Rectangle c)Square" );
char n=sc.next().charAt(0);

switch(n) {
case'a':
	System.out.println("Enter radius");
	double rad=sc.nextFloat();
	OptionalArea ob=new OptionalArea(rad);
	break;
case'b':
	System.out.println("Enter length");
	double l=sc.nextFloat();
	System.out.println("Enter breadth");
	double b=sc.nextFloat();
	OptionalArea ob1=new OptionalArea(l,b);
	break;
case'c':
	System.out.println("Enter side");
	float side=sc.nextFloat();
	OptionalArea ob2=new OptionalArea(side);
	break;
	default:
		System.out.println("Enter valid input");
	
}

	}

}
