public class FarmerBrown {
	public static void main(String[] args) {
		for (int s = 1; s <= 10; s++) {
			for (int g = 1; g <= 100; g++) {
				for (int c = 1; c <= 100; c++) {
					if (s + g + c == 100 && 10 * s + 3.5 * g + .5 * c == 100) {
						System.out.print(s + " sheep, ");
						System.out.print(g + " goats, and ");
						System.out.println(c + " chickens.");
					}
				}
			}
		}
	}
}