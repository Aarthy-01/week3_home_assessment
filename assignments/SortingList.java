package week3.day1.assignments;

import java.util.ArrayList;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> input=new ArrayList<String>();
input.add("Google");
input.add("Microsoft");
input.add("Testleaf");
	input.add("Maverick");
	int size = input.size();
	input.sort(null);
	System.out.println(input);
	System.out.println("The final result:");
	for (int i = size-1; i >=0; i--) {
		String result = input.get(i);
		
		System.out.println(result);
		
		
	}
	
	}

}
