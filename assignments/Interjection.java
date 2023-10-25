package week3.day1.assignments;

public class Interjection {
	public static void main(String[] args) {
		
		int num1[]= {3,2,11,4,6,7};
		int num2[]={1,2,8,4,9,7};
		int num1Len=num1.length;
		
	for (int i = 0; i < num1Len; i++) {
			
			for (int j = 0; j < num2.length; j++) {
				
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]);
				}
				
			}
}
}
	}