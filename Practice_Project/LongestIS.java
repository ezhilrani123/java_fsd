package PracticeProject;
import java.util.Scanner;

public class LongestIS{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
		System.out.println("Enter the "+i+"th index element");
			arr[i]=sc.nextInt();
		}
		
		int ans=0;
		int d[]=new int[n];
		for(int i=0;i<n;i++) {
			int max=0;
			
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					if(d[j]>max) {
						max=d[j];
					}
				}
			}
			d[i]=max+1;
			
			if(d[i]>ans) {
				ans=d[i];
			}
		}
		System.out.println("Length of longest increasing subsequence :"+ans);
	}
}
