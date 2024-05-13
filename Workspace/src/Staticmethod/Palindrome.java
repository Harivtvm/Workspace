package Staticmethod;
import java.util.Scanner;
public class Palindrome {
	public static  int reverse(int n) {
		int d;
		int r=0;
		while(n!=0) {
			d=n%10;
			r=(r*10)+d;
			n=n/10;
		}
		return r;
	}
public static void palin(int a) {
	if( a==Palindrome.reverse(a)){
		System.out.println("Its a palindrome");}
		else {
			System.out.println("Its not a palindrome");}
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to be checked");
				int n=sc.nextInt();
Palindrome.palin(n);		

	}

}