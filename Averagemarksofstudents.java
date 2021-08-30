import java.util.Scanner;
public class Averagemarksofstudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Students= ");
		int n = sc.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter the marks now= ");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		double averagemarks = 0;
		for (int i = 0; i < n; i++) {
			averagemarks += marks[i];
		}
		averagemarks /= n;
		System.out.println("The average marks of students are " + averagemarks);
	}
}