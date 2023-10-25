package week3.day1.assignments;

public class IndexChangee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charTest = test.toCharArray();
		//String upperCase = test.toUpperCase();
		//System.out.println(upperCase);
	for (int i = 0; i < charTest.length-1; i=i+2) {
		System.out.print(charTest[i] );
		
		charTest[i+1]=Character.toUpperCase(charTest[i+1]);
		System.out.print(charTest[i+1]);
	}

}}
