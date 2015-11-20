package as.java.lesson.two;

import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number would you like to sort? ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("What numbers do you want to sort? ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int temp = 0;

		for (int i = 0; i < a.length - 1; ++i) {

			for (int j = 0; j < a.length - 1; ++j) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}

}
