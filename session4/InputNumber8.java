import java.util.Scanner;

public class InputNumber8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數(0~100): ");
		int score = sc.nextInt();
		// 請利用 switch-case 語法判斷分數等第
		int level = score / 10;
		switch(level) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				
		}
	}
}