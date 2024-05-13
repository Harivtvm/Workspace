package methods;

public class InstanceAvg {
public int average(int a,int b,int c) {
	return ((a+b+c)/3);
}
public float average(float a,float b,float c) {
	return ((a+b+c)/3);
}
	public static void main(String[] args) {
		InstanceAvg obj=new InstanceAvg();
		System.out.println("Average of integers is "+obj.average(10,20,30));
		
		System.out.println("Average of float numbers is "+obj.average(10.5f,15.6f,8.4f));
	}

}
