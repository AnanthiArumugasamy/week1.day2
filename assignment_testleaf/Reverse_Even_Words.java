package week1.day2.assignment_testleaf;

public class Reverse_Even_Words {

	public static void main(String[] args) {
		String value = "I am a software tester";
		String[] split = value.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 0) {
				System.out.println(" ");
				System.out.println(split[i]);
			} else {
				System.out.println(" ");
				char[] evenwords = (split[i]).toCharArray();
				for (int j = evenwords.length - 1; j >= 0; j--) {
					System.out.println(evenwords[j]);
				}
			}
		}
	}
}