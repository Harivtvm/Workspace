package methods;

import java.util.Scanner;

public class PrimeNumber {
	public void primenumbers(int a,int b) {
		for(int i=a;i<b;i++) {
			if (PrimeNumber.prime(i)==false) {
				System.out.print(i+",");}
	}
	}
		public static boolean prime(int a){
			boolean b=false;
			for(int i=2;i<a;i++) {
				int d=a%i;
				if(d==0) {	
					b=true;
					break;
		}
		}
			if(a==0||a==1) {
				b=true;
			}
			return b;
			}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		int a=sc.nextInt();
		System.out.println("Enter last number");
		int b=sc.nextInt();
		PrimeNumber obj=new PrimeNumber();
		obj.primenumbers(a,b);

	}

}
