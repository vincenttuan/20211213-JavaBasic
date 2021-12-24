// 取得使用者的輸入資訊
import java.util.Scanner;

public class InputNumber1 {
	public static void main(String[] args) {
		// 建立一個輸入裝置
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入一個數字: ");
		int x = sc.nextInt(); // 得到使用者所輸入的數字
		System.out.println("電腦得到 x = " + x);
	}
}