public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course (String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents == students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
			
			students[numberOfStudents] = student;
			numberOfStudents++;
		} else {
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
		System.out.println("Student " + student + " is added");
	}
	
	public String getStudents() {
		String temp = "";
		
		for(int i=0; i<numberOfStudents; i++) {
			temp += students[i] + ", ";
		}
		return temp.substring(0, temp.length()-2);
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void clear() {
		for(int i=0; i<numberOfStudents; i++) {
			students[i] = null;
		}
		
		numberOfStudents = 0;
		System.out.println("All students deleted from " + courseName);
	}

	public void dropStudent(String student) {
		for(int i=0; i<numberOfStudents; i++) {
			if(students[i] == student) {
				System.out.println("Student " + students[i] + " is deleted");
				students[i] = null;
				
				for(int j=i; j<numberOfStudents; j++) {
					students[j] = students[j+1];
				}
			numberOfStudents--;
			}
		}
	}
}
