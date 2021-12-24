import java.util.Scanner;

public class InputNumber5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = sc.nextInt();
		// 分數等第 level
		// 90~100 A
		// 80~89  B
		// 70~79  C
		// 60~69  D
		// 0~59   E
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		if(score >= 80 && score <= 89) {
			System.out.println("B");
		}
		if(score >= 70 && score <= 79) {
			System.out.println("C");
		}
		if(score >= 60 && score <= 69) {
			System.out.println("D");
		}
		if(score >= 0 && score <= 59) {
			System.out.println("E");
		}

	}
}