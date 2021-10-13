package week1.day2.assignment_testleaf;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		int n = arr.length;
		int a = 1;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] != a) {
				System.out.println(a);
				break;
			}
			a++;
		}
	}

}
