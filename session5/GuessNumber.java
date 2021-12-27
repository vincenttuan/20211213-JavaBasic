import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int ans = r.nextInt(99) + 1;
		int min = 0;
		int max = 100;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.printf("Please input a number (%d ~ %d) ==> ", min, max);
			int userGuess = sc.nextInt();
			// verify
			if(userGuess <= min || userGuess >= max) {
				System.out.println("number error!");
				continue;
			}
			// confirm
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.println("Bingo");
				break;
			}
		} while(true);

	}
}