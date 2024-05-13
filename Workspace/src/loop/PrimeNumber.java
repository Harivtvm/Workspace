package loop;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to be checked");
		int a=sc.nextInt();
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
		if(b==false){
			System.out.println("Its a primenumber");}
			else if(b==true){	
				System.out.println("Its not a primenumber");
				
		}
	
	}
}
