
package practiceLesson10;

public class Homeworkdemo {

	private String studentName;
	private int studentId;
	private static int numberOfStudents;

	public static void main(String[] args) {
		
		Homeworkdemo st1 = new Homeworkdemo();
		st1.studentName = "Ola";
		st1.studentId = 1;
		
		Homeworkdemo.numberOfStudents++;
		
		Homeworkdemo st2 = new Homeworkdemo();
		st1.studentName = "Hera";
		st1.studentId = 2;
		
		Homeworkdemo.numberOfStudents++;
		
		Homeworkdemo st3 = new Homeworkdemo();
		st1.studentName = "Dajna";
		st1.studentId = 3;
		
		Homeworkdemo.numberOfStudents++;
		
System.out.println("The total number of students is: " 
+ numberOfStudents);		
		
		
		
		
	}

}
