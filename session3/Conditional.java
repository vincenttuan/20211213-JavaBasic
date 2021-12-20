public class Conditional {
	public static void main(String[] args) {
		int x = 78;
		System.out.printf("x = %d\n", x);
		if(x >= 60 && x%2 == 0) {
			System.out.println("pass and even");
		} else {
			System.out.println("None");
		}
	}
}