public class PrimitiveInt {

	public static void main(String[] args) {
		byte b = 10;
		short s = 1_0000;
		int i = 350_0000;
		long g = 45_0000_0000L;

		long sum = (long)(b + s + i + g);
		System.out.println(sum);

		long sum2 = b + s + i + g;
		System.out.println(sum2);

		System.out.printf("%,d\n", sum2);

		int x = 0b01111011;
		System.out.println(x);

		int y = 0123;
		System.out.println(y);

		int z = 0xab; // 0x0ab
		System.out.println(z);

	}

}