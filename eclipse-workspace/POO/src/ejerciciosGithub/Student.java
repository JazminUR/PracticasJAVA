package ejerciciosGithub;

public class Student {

	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    
     public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
     
     public Student() {
 		super();
 		this.firstName = "";
 		this.lastName = "";
 		this.registration = 0;
 		this.grade = 0;
 		this.year = 0;
 	}
     
     public Student(String firstName, String lastName) {
  		super();
  		this.firstName = "";
  		this.lastName = "";
  		this.registration = 0;
  		this.grade = 0;
  		this.year = 0;
  	}
     

	public void printFullName(){
    	 
    	 System.out.println(firstName + " " + lastName);
     }
     

     public void isApproved(){
         if (grade >= 60) {
        	 System.out.println("True");
         }
     }

     public int changeYearIfApproved(){
    	 if (grade >= 60) {
        	 year = year + 1;
        	 System.out.println("Congratulations");
         }
    	 
         return 0;
     }
     
     public static void main(String[] args) {
    	 
		Student student1 = new Student("Jazmín", "Urzúa", 5462763, 80, 3);
		student1.printFullName();
		student1.isApproved();
		student1.changeYearIfApproved();
	}
     
     
}
