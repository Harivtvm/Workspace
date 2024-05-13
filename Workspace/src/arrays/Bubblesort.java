package arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {19,25,5,15,32,50,2};
		System.out.println("Before bubble sort");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				}
			}
		System.out.println();
		System.out.println("After bubble sort");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
