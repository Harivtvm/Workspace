package methods;

public class ConstructorArea {
public ConstructorArea(double r) {
	this(5.0,6.0);
	System.out.println("Area of circle is "+(3.14*r*r));
}
public ConstructorArea(double l,double b) {
	this(2.4f);
	System.out.println("Area of rectangle is "+(l*b));
}
public ConstructorArea(float s) {
	System.out.println("Area of square is "+(s*s));
}
	public static void main(String[] args) {
		ConstructorArea obj=new ConstructorArea(2.45);

	}

}
