package week1.day2.assignment_testleaf;

public class FindTypes {
public static void main(String[] args) {
	String test="$$ Welcome to2nd Class of Automatic $$";
	int letter=0,space=0,num=0,specialChar=0;
	char ch[]=test.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(Character.isDigit(ch[i])) {
			num++;
		}
		else {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else {
				if(Character.isWhitespace(ch[i])) {
					space++;
				}
				else {
					specialChar++;
				}
			}
		}
	}
	System.out.println("letter"+letter+"count");	
	System.out.println("Number"+num);	
	System.out.println("Space"+space);
	System.out.println("Special Character"+specialChar);
}

}
