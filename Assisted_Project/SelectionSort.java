package AssitedProject2;

public class SelectionSort {
public static void main(String[] args) {
	int a[]= {8,9,2,7,4,3,1};
	int l=a.length;
	
	for(int i=0;i<(l-1);i++) {
		int index =i;
		for(int j=i+1;j<l;j++) {
			if(a[j]<a[index]) {
				index=j;
			}
		}
	
		int smallnum=a[index];
		a[index]=a[i];
		a[i]=smallnum;
	}
	for(int data:a) {
		System.out.println(data);
	}
}
}
