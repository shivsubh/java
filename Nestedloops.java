public class Nestedloops {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 10; j++) {
				result = j * i;
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}
}