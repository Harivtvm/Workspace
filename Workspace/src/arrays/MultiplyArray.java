package arrays;

public class MultiplyArray {

	public static void main(String[] args) {
		int a[][]= {{2,5,6},{8,2,3},{5,4,6}};
		int b[][]= {{7,3,5},{7,1,5},{9,6,3}};
		int c[][]=new int[a.length][a.length];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
				c[i][j]=(a[i][j]*b[k][j])+c[i][j];}
			System.out.print(c[i][j]+" ");}
				System.out.println();
			}
		}

		
	}


