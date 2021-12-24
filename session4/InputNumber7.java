import java.util.Scanner;

public class InputNumber7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身分證第一碼: ");
		char c = sc.next().charAt(0);
		// if - else 語法
		if(c == 'A') {
			System.out.println("台北市");
		} else if(c == 'B') {
			System.out.println("台中市");
		} else if(c == 'F') {
			System.out.println("新北市");
		} else {
			System.out.println("其他");
		}
		// 單一變數(c) + if恆等式(==)判斷 皆可以改為使用
		// switch - case 語法
		switch(c) {
			case 'A':
				System.out.println("台北市");
				break; // 離開 switch 語句
			case 'B':
				System.out.println("台中市");
				break; 	
			case 'F':
				System.out.println("新北市");
				break; 
			default:
				System.out.println("其他");	
		}

	}
}