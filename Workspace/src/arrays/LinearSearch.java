package arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40};
		System.out.println("Enter the number to be searched");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++){
			if (a[i]==n) {
			System.out.println(n+" is found in index no "+i);
			break;}
		else if(i==a.length-1) {
			System.out.println("not found");
		}
	}	
		}
	}