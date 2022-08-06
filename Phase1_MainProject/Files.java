package mainproject;

import java.io.IOException;
import java.util.Scanner;

public class Files {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	 
	Displayfile dd=new Displayfile();
	Addfile aa=new Addfile();
	Deletefile df=new Deletefile();
	Searchfile ss=new Searchfile();
	
	System.out.println("-----Welcome to application----- ");
	System.out.println("This application was developed by Ezhilrani");
	System.out.println("This application is used to add,delete,search and retrieve files in a folder\n");
	
	while(true) {
	System.out.println("Enter the number you want to Choose \n1.Display the files in Ascending Order \n2.Add/Delete/Search a file.\n3.Exit");
		int value =sc.nextInt();
		switch(value) {
		case 1:
			dd.dis();
			break;
		case 2:while(true) {
	System.out.println("Enter the number you want to Choose \n1.Add a file\n2.Delete a file\n3.Search a filer\n4.To go back to main menu");
			int num=sc.nextInt();
			int flag=0;
			  switch(num){
				  case 1: aa.add();break;
				  case 2: df.del();break;
				  case 3: ss.search();break;
				  case 4: flag=1;
				          break;
			  }	  
			  if(flag==1)
				  break;
		}
		break;
		case 3:
			System.exit(0);
			break;
		
			
		}
	}
	
}
}


