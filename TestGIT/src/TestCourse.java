public class TestCourse {

	public static void main(String[] args) {
		Course c1 = new Course("Course 1");
		
		c1.addStudent("Therese");
		c1.addStudent("Janne");
		c1.addStudent("Oluf");
		
		c1.dropStudent("Janne");
		
		System.out.println("Students in " + c1.getCourseName() + " are: " + c1.getStudents());
	}
}
