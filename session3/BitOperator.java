public class BitOperator {
	public static void main(String[] args) {
		int x = 5 & 3;
		System.out.printf("x = %d\n", x);
		int y = 5 | 3;
		System.out.printf("y = %d\n", y);
		int z = 5 ^ 3;
		System.out.printf("z = %d\n", z);
		int a = ~13;
		System.out.printf("a = %d\n", a);

		int i = 5 << 1;
		System.out.printf("i = %d\n", i);
		int j = 5 >> 1;
		System.out.printf("j = %d\n", j);
		int k = 5 >>> 1;
		System.out.printf("k = %d\n", k);

	}
}