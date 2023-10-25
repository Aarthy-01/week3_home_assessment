package week3.day1.assignments;

public class Students extends Departments {
	public void studentName() {
		System.out.println("student name is aarthy");
	}
	public void studentDept() {
		System.out.println("department is eee");
	}
	public void studentId() {
		System.out.println("student id is 001");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students result=new Students();
		result.collegeName();
		result.collegeCode();
		result.collegeRank();
		result.departmentName();
		result.studentName();
		result.studentDept();
		result.studentId();
	
	}

}
