import java.util.Random;
public class WhileDemo3 {

	public static void main(String[] args) {
		Random r = new Random();
		// 4 Stars
		int count = 4;
		while(count > 0) {
			int n = r.nextInt(10); // 0~9
			System.out.println(n);
			count--;
		}
	}

}