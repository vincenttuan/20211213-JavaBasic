public class PrimeNumber {
	public static void main(String[] args) {
		int x = 49; // 49
		boolean isPrime = true;
		for(int i=2;i<=x/2;i++) {
			if(x % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.printf("%d is prime? %b\n", x, isPrime);
	}
}