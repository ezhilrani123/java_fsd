package AssitedProject2;

public class Bubblesort {
public static void main(String[] args) {
	int a[]= {23,677,1,2,98,4};
	 int l=a.length;
	 int temp=0;
	 for(int i=0;i<l;i++) {
		 for(int j=1;j<l;j++) {
			 if(a[j-1]>a[j]) {
				 temp=a[j-1];
				 a[j-1]=a[j];
				 a[j]=temp;
			 }
		 }
	 }
	 for(int data:a) {
		 System.out.println(data);
	 }
}
}
