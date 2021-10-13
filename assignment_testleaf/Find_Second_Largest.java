package week1.day2.assignment_testleaf;

import java.util.Arrays;

public class Find_Second_Largest {
	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int length = a.length;
		Arrays.sort(a);
		for (int i = 0; i<length; i++) {
			System.out.println("The sorted output is:" + a[i]);
			}
		System.out.println("The second largest number is:" + a[length - 2]);

	}
}
