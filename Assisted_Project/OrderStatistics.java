package AssitedProject2;

import java.util.Scanner;

//find the fourth smallest element in an array

public class OrderStatistics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the "+i+"th index element");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				else
					continue;
			}
		}
		System.out.println("Fourth Smallest element in an array " +a[3]);
	}
}
