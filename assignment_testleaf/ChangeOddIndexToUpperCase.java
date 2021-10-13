package week1.day2.assignment_testleaf;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
    String test="changeme";
    char[] CharArray=test.toCharArray();
    for(int i=0;i<test.length();i++) {
    if(i%2!=0) {
    	char ch=(Character.toUpperCase(CharArray[i]));
    	System.out.println(ch);
    }
    else {
     System.out.println(CharArray[i]);
    }
    }
	}
}
