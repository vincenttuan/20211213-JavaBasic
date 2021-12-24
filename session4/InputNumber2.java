import java.util.Scanner;

public class InputNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入半徑: ");
		double r = sc.nextDouble();
		double area = r * r * 3.14; // 面積
		double volume = 4/3.0 * r * r * r * 3.14; // 球體積
		System.out.printf("圓面積: %.1f 球體積: %.1f\n", area, volume);

	}
}