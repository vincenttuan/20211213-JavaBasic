public class NineTable {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int x = 1 ; x <= n ; x++) {
			for(int y=1 ; y <= n ; y++) {
				System.out.printf("%2dx%2d=%3d ", x, y, (x*y));
			}
			System.out.println();
		}

		
	}
}