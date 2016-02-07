package challenge30Days12;

public class Student {
	protected String firstName;
	   protected String lastName;
	   int phone;
	   Student(String fname,String lname,int p){
	         firstName=fname;
	         lastName=lname;
	         phone=p;
	       
	   }
	   public void display(){// display the details of the student
	       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
	   }

}
