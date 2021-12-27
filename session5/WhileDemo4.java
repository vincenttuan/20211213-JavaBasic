/*
@
@@
@@@
@@@@
@@@@@
*/
public class WhileDemo4 {
	public static void main(String[] args) {
		int max = 5;
		int x = 1;
		while(x <= max) {
			//System.out.println(x);
			//-----------------------------
			int count = x;
			while(count > 0) {
				System.out.print("@");
				count--;
			}
			//-----------------------------
			System.out.println();
			x++;
		}

	}
}