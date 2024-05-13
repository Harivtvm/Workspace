package Staticmethod;

public class Discount {
	static float sum;
	public static float totalsum(float a,float b,float c,float d,float e) {
		sum=a+b+c+d+e;
		return sum;
	}
	public static void discount() {
		if (sum>5000) {
			sum=80*sum/100;
			System.out.println("Congrats.. You got a discount of 20% ");
			System.out.println("You have to pay Rs "+sum);
		}
		else {
			System.out.println("Purchase for RS 5000 and more to avail flat 20% discount");
		}
	}

	public static void main(String[] args) {
	System.out.println("Purchased amount is Rs "+totalsum(504.5f,1050f,2789.25f,895.75f,1684.25f));
discount();
	}

}
