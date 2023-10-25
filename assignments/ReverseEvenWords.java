package week3.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] splitTest = test.split(" ");
		for (int i = 0; i < splitTest.length; i++) {
		if(i%2!=0) {
			char[] charArray = splitTest[i].toCharArray();
		
for (int j = charArray.length-1; j >=0 ; j--) {
	System.out.print(charArray[j]);

}
		}
		else {
			System.out.print(" "+splitTest[i]+ " ");
		}
	
		}
	
	}

}
