import java.util.Scanner;

public class InputNumber3 {
	public static void main(String[] args) {
		// 題目: 今有雉、兔同籠，上有三十五頭，下九十四足。問雉、兔各幾何？
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入雞+兔的總數: ");
		int total = sc.nextInt(); // 35
		// 判斷總數 total 是否合理 ?
		if(total <= 0) {
			System.out.println("總數必須大於0");
			System.exit(1);
		}

		int min = total * 2;
		int max = total * 4;
		System.out.printf("請輸入雞腳+兔腳的總數(%d ~ %d 之間的偶數): ", min, max);
		int feet = sc.nextInt(); // 94

		// 判斷腳總的總數是否合理 ?
		if(feet % 2 == 1) {
			System.out.println("腳的總數請輸入偶數");
			System.exit(1);
		}

		if(feet < total * 2) {
			System.out.println("腳的總數過低");
			System.exit(1); // 離開, 1:表示手動離開, 0:表示自動離開
		}

		if(feet > total * 4) {
			System.out.println("腳的總數過高");
			System.exit(1);
		}

		int rabbit = (feet - (total*2))/2;
		int chicken = total - rabbit;
		System.out.printf("雞: %d 兔: %d\n", chicken, rabbit);
	}
}