package AssitedProject2;

import java.util.Scanner;

public class LinearSearch {
	
public static void main(String[]args) {
	int a[]= {10,30,40,20,50};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element to search");
	int search=sc.nextInt();
	int flag=0;
	int i=0;
	for( i=0;i<a.length;i++) {
		if(a[i]==search)
		{
			flag=1;
			break;
		}
	}	
	if(flag==1)
	{
		System.out.println(search+" is found");
	}
	else {
		System.out.println(search+" not found");
	}
}
}

