package methods;

public class InstanceArea {
	public double area(double r) {
		return (3.14*r*r);
	}
	public double area(double l,double b) {
		return (l*b);
	}
	public float area(float s) {
		return (s*s);
	}
	public static void main(String[] args) {
		InstanceArea obj=new InstanceArea();
		System.out.println("Area of circle is  "+obj.area(10.2));
		System.out.println("Area of rectangle is  "+obj.area(10.5,8.6));
		System.out.println("Area of square is  "+obj.area(10.0f));
	}

}
