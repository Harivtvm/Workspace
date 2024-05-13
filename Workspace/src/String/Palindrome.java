package String;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		s1=sc.next();
	s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
		if(s2.equals(s1)) {
			System.out.println("Entered string "+s1+" is a palindrome");}
		else {
			System.out.println("Entered string "+s1+" is not a palindrome");
		}	
	}
	}


