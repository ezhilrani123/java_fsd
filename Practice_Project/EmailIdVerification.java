import java.util.ArrayList;
import java.util.Scanner;

public class EmailIdVerification {
	
       public static void main(String[] args) {
        //Creating Arraylist
        ArrayList<String> email = new ArrayList<String>();
        
        email.add("mala.es@gmail.com");
        email.add("ramravi.inku@yahoo.com");
        email.add("sundar.ch@gmx.com");
        email.add("rani.dc@opx.com");
        email.add("fillup.eg@gmail.com");
   
        
         String searchEmail = null;
         System.out.println("Enter the your emailId to search");
         
         try (Scanner sc = new Scanner(System.in)) {
        	 System.out.println("Enter email Id : "); //Ask user to enter EmailId
          searchEmail = sc.nextLine(); 
		}
             if(email.contains(searchEmail)){
          System.out.println("Your email ID " + searchEmail + " is Present");
      }
      else{
          System.out.println( "Your email ID " + searchEmail + " is not Present");
      }
 
        
    }

}






