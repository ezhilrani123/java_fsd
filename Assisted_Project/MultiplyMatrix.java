package AssitedProject2;

import java.util.Scanner;

public class MultiplyMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row and column  of matrix");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int arr1[][]=new int[row][col];
	int arr2[][]=new int[row][col];
	System.out.println("Enter the elements of first array");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			
			arr1[i][j]=sc.nextInt();
		}
		
	}
	System.out.println("Enter the elements of second array");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			
			arr2[i][j]=sc.nextInt();
		}
		
	}
	int product[][]=new int[row][col];
	for(int i = 0; i < row; i++) 
	{
	  for (int j = 0; j < col; j++) 
	{
	  for (int k = 0; k < col; k++) 
	{
	  product[i][j]=product[i][j]+(arr1[i][k] * arr2[k][j]);
	  }
	 }
   }
	 System.out.println("Multiplication of two matrix:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(product[i][j]+" ");
		}
		System.out.println("\n");
	}


}
}
