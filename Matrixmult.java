import java.util.Scanner;
public class Matrixmult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dimension = ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		System.out.println("Enter Array a = ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Array b = ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("The result = ");
		int c[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < rows; k++) {
					c[i][j] += a[i][k] * b[k][j] ;
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}