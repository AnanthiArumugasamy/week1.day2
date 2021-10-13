package week1.day2.assignment_testleaf;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int s1 = text1.length();
		int s2 = text2.length();
		char ch1[] = text1.toCharArray();
		char ch2[] = text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int co = 0;
		if (s1 == s2) {
			for (int i = 0; i < s1; i++) {
				if (ch1[i] == ch2[i]) {
					co++;
				}

			}

		} else {
			System.out.println("It is not anagram");
		}

		if (co == s1) {
			System.out.println("It is anagram");
		} else {
			System.out.println("It is not anagram");
		}

	}

}
