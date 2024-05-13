package thisandsuper;

public class ReverseThis {
	int num;
	public ReverseThis() {
		System.out.println("Finding reverse of 159");
	}
	public ReverseThis(int num) {
		this();
		this.num=num;
		int rev=0;
		while(num!=0) {
		int d=num%10;
		rev=(rev*10)+d;
		num=num/10;}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		ReverseThis obj=new ReverseThis(159);

	}

}
