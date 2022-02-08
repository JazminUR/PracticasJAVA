package ejerciciosGithub;

import java.util.ArrayList;

public class Courses {
	
	String courseName;
	String professorName;
	int year;
	
	ArrayList<Student> lisStudents = new ArrayList<Student>();
	
	public void enroll(Student student){
		//listStudents.add(student1));
	      
	}

	public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	}

	public int countStudents(){
	       //TODO implement
	       return 0;
	}
	   
	public int bestGrade(){
	       //TODO implement
	       return 0;
	}
	
	public static void main(String[] args) {
		Courses collection = new Courses();
		Student student1 = new Student("Jazmín", "Urzúa", 5462763, 80, 3);
	}

}
