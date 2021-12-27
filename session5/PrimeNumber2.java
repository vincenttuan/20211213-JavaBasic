public class PrimeNumber2 {
	public static void main(String[] args) {
		for(int x=2;x<=100;x++) {
			boolean isPrime = true;
			for(int i=2;i<=x/2;i++) {
				if(x % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.printf("%d is prime? %b\n", x, isPrime);
			}
		}
	}
}