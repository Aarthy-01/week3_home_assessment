package week3.day1.assignments;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		int input[] = {1,2,3,4,7,6,8};
		for (int i =0; i < input.length; i++) {
			//System.out.println(input[i]);
			if(i+1!=input[i]) {
			System.out.println(i+1);
			break;
		}
	}

}
}