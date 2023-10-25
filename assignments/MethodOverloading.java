package week3.day1.assignments;



public class MethodOverloading {
public void getStudentInfo(int id) {
	System.out.println(" student id number is:"+ id);
}

public void getStudentInfo(int id ,String name) {
	System.out.println(" student id number is:" +" "+ id +" "+"student name is:"+" "+name);

}
public void getStudentInfo( String email,int number) {
	System.out.println(" student email id is:" +" "+email +" "+"student mobile number is:"+" "+number);

}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading result=new MethodOverloading();
	
		result.getStudentInfo(81);
		result.getStudentInfo(81, "aarthy");
		result.getStudentInfo("aerth@gmail.com", 1234567890);
	}

}
