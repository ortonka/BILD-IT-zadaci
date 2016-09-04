package zadaci_03_09_2016;

public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	// returns clone of Object
		public Object clone() {
			Course c=null;
			try {
				c = (Course) super.clone();
			} catch (CloneNotSupportedException e) {
				System.err.println("Nije izvrseno kloniranje!");
				return null;
			}
			//create new array with same elements
			c.students=this.students.clone();
			//create new String
			c.courseName=new String(this.courseName);
			return c;
		}
}
