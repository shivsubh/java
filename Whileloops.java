import java.util.Scanner;
public class Whileloops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Checking if a number is palindrome or not using while loop
		int n = sc.nextInt();
		int temp = n;
		int reversenumber = 0;
		while (temp > 0) {
			int lastdigit = temp % 10;
			reversenumber = reversenumber * 10 + lastdigit;
			temp /= 10;
		}
		if (reversenumber == n) {
			System.out.println(n + " is a palindrome number.");
		} else {
			System.out.println(n + " is not a palindrome.");
		}
	}
}