package basicfunctions;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int c=a.length();
	System.out.println(a+a.charAt(c-1));
	String b="";
for(int i=a.length()-1;i>=0;i--) {
	b=b+a.charAt(i);
	
	}
if(a.equals(b)) {
	System.out.println("hgghh");}
else {
	System.out.println("noooo");}
	
}
}
