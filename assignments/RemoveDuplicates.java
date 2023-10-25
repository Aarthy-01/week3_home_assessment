package week3.day1.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
	int count=0;
	String[] newText = text.split(" " );
	
	
	for (int i = 0; i < newText.length; i++) {
		//System.out.print(newText[i]);	
	for (int j = i+1; j < newText.length; j++) {
		if(newText[i].equalsIgnoreCase(newText[j]) ){
			newText[j]="";
			count++;		
		}	
	
	}
	}
	if(count>0) {
		for (int k = 0; k < newText.length; k++) {
			System.out.print(newText[k]+" ");
		}
	}
	}

}
