import java.util.Scanner;
public class InputNumber6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數(0~100): ");
		int score = sc.nextInt();
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else if(score >= 0 && score < 60) {
			System.out.println("E");
		} else {
			System.out.println("分數輸入不合法");
		}
	}
}