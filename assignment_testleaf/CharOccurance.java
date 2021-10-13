package week1.day2.assignment_testleaf;

import java.util.*;

public class CharOccurance {
	public static void main(String[] args) {
		int count = 0;
		Scanner s=new Scanner(System.in);
		String strtest1 = "welcome to chennai";
		char[] charArray = strtest1.toCharArray();

		int lengthstr = strtest1.length();
		System.out.println("Length:" + lengthstr);
		for (char c : charArray) {
			System.out.println(c + "");
		}
		for (int i = 0; i < lengthstr; i++) {
			if (charArray[i] == 'w') {
				count++;
			}
		}
		System.out.println(count);
	}
}
