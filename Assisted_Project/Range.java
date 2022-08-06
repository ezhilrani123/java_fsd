package AssitedProject2;

import java.util.Scanner;

public class Range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		System.out.println("Enter the "+i+"th element of array");
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the low range");
	int low=sc.nextInt();
	System.out.println("ENter the highest Range");
	int high=sc.nextInt();
	int sum=0;
	int l=low-1;
	for(int i=l;i<high;i++) {
		
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
