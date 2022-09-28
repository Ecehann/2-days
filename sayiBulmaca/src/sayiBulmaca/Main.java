package sayiBulmaca;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int sought = 6;
		boolean available = false;

		for (int number : numbers) {
			if (number == sought) {
				available = true;
				break;
			}
		}
		if (available) {
			System.out.println("Sayı mecvut.");
		} else {
			System.out.println("Sayı mecvut değil.");
		}

	}

}
