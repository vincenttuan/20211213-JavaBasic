import java.util.Random;
public class WhileDemo2 {
	public static void main(String[] args) {
		Random r = new Random();
		while(true) {
			int n = r.nextInt(100);
			if(n % 2 == 0) {
				System.out.println(n);
			} else { //Exit
				System.out.println(n);
				break;
			}
		}
	}
}