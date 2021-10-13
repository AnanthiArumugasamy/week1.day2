package week1.day2.assignment_testleaf;
public class Palindrome_string {

	public static void main(String[] args) {
    String s1="madam";
    String s2="";
	int n=s1.length(); 
	for(int i=(n-1);i>=0;i--) {
    	s2=s2+s1.charAt(i);
    }
    if(s1.equals(s2)) {
    	System.out.println("It is palindrome");
    }
    else {
    	System.out.println("It is not palindrome");
	}

}
}