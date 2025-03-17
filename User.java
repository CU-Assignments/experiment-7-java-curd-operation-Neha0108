package CRUD;

public class User {
	
	private int StudentID;
	private String StudentName;
	private float StudentCgpa;
	private int StudentYear;
	
		User(int StudentID,String StudentName,float StudentCgpa, int StudentYear)
		{
			this.StudentID = StudentID;
			this.StudentName = StudentName;
			this.StudentCgpa = StudentCgpa;
			this.StudentYear = StudentYear;
		}
		
		User(String StudentName,float StudentCgpa, int StudentYear)
		{
			this.StudentName = StudentName;
			this.StudentCgpa = StudentCgpa;
			this.StudentYear = StudentYear;
		}
	// StudentID,StudentName,StudentCgpa,StudentYear
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public float getStudentCgpa() {
		return StudentCgpa;
	}
	public void setStudentCgpa(float studentCgpa) {
		StudentCgpa = studentCgpa;
	}
	public int getStudentYear() {
		return StudentYear;
	}
	public void setStudentYear(int studentYear) {
		StudentYear = studentYear;
	}
	
	}


