package homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		System.out.println(n);
		if (n >= 90 && n <= 100) {
			System.out.println("Your grade is A+");
		} else if (n >= 81 && n <= 90) {
			System.out.println("Your grade is A");
		} else if (n >= 71 && n <= 80) {
			System.out.println("Your grade is B");
		} else if (n >= 61 && n <= 70) {
			System.out.println("Your grade is B-");
		} else if (n >= 51 && n <= 60) {
			System.out.println("Your grade is C");
		} else {
			System.out.println("Your grade is F");
		}
	}
}