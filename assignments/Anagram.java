package week3.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		int length1 = text1.length();
		int length2 =text2.length();
		char[] textN1 = text1.toCharArray();
		char[] textN2 = text2.toCharArray();
		if(length1==length2) {
		Arrays.sort(textN1);
		Arrays.sort(textN2);

	if( Arrays.equals(textN1, textN2)) {
		System.out.println("'"+text1+"'" + "  and " +"'" +text2+"'" +" is anagram");
	}	
	else {

		System.out.println(" '"+text1+"'" + "  and " + "'"+text2 +"'" +" is  not anagram");
	}	
		
	

}else {
	System.out.println("'"+text1+"'"  + "  and " + "'"+text2+"'" +"  is  not anagram");
}
		}
	}
