public class Conditional2 {
	public static void main(String[] args) {
		int x = 79;
		System.out.printf("x = %d\n", x);
		if(x >= 60 || x%2 == 0) {
			System.out.println("pass or even");
		} else {
			System.out.println("None");
		}
	}
}