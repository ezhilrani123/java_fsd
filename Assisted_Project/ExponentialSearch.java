package AssitedProject2;

import java.util.Scanner;


public class ExponentialSearch {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
	Scanner sc=new Scanner(System.in);
	int search=sc.nextInt();
	
	//exponential search
    if(a[0]==search) {
    	System.out.println("Value is found");
    }
    int i=1;
    while(i<a.length && a[i]<=search) {
    	i=i*2;
    	
    }
    //binary search
    int low=i/2;
    int n1=a.length-1;
    int ans1;
	if(n1<i)
	{
    	ans1=n1;
	}
    else {
        ans1=i;
    }
    System.out.println(i+" "+ans1);
	int high=ans1 ;
	int mid=0;
	int flag=0;
	while(low<=high) {
		mid=(low+high)/2;
		if(a[mid]==search) {
			flag=1;
			break;
		}
		else if(a[mid]<search) {
			low=mid+1;
		}
		else {
		high=mid-1;
		}
	}
	if(flag==1) {
		System.out.println("element is found at the location "+mid );
	}
	else {
		System.out.println("element not found");
	}
    	
    	
    	
    	
    	
}


 
}
