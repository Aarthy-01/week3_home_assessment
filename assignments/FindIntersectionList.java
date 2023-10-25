package week3.day1.assignments;

import java.util.ArrayList;

import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		  int[] b={1,2,8,4,9,7};
List<Integer> List1=new ArrayList<Integer>();
List<Integer> List2=new ArrayList<Integer>();
List<Integer> List3=new ArrayList<Integer>();

	for (int i = 0; i < a.length; i++) {
		List1.add(a[i]);
		
	}	
	//System.out.println(List1);
		for (int j = 0; j < b.length; j++) {
			List2.add(b[j]);
			
			
		
	}
		//System.out.println(List2);
	for (int k = 0; k < List1.size(); k++) {
		Integer value1 = List1.get(k);
	for (int l = 0; l < List2.size(); l++) {
		Integer value2 = List2.get(l);
		if(value1 == value2) {
			//System.out.println(value2);
			List3.add(value2);
		
		}
	
	}
	System.out.println(List3);
	}
	
	
	}
	

}
