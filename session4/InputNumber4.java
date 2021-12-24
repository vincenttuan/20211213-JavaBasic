import java.util.Scanner;

public class InputNumber4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入成績: ");
		int score = sc.nextInt();
		// 判斷該成績是否及格 ?
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}