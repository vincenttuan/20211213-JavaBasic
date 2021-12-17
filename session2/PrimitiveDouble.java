public class PrimitiveDouble {
	public static void main(String[] args) {
		// 計算 bmi
		double w = 60; // 60.0 體重(kg)
		double h = 1.7; // 身高(m)
		double bmi = w / (h * h);

		System.out.println(bmi);
		System.out.printf("%.2f\n", bmi);
		System.out.printf("%.1f\n", bmi);
	}
}