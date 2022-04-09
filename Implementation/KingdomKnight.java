public class KingdomKnight {
	public static int[][] chess = new int[9][9]; // 8 x 8 (Excluding 0)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] location = sc.next().toCharArray();
		
		// Convert char to int
		int row = location[1] - '0';
		int col = location[0] - 'a' + 1;
		
		// Possible Situation
		int[] horizontal = {2, 2, -2, -2};
		int[] vertical = {1, -1};
		
		
		int count = 0;
		// Check possible route
		for (int i = 0; i < horizontal.length; i++) {
			for (int j = 0; j < vertical.length; j++) {
				if (row + horizontal[i] < 1 || 
					row + horizontal[i] > 8 ||
					col + vertical[i] < 1   ||
					col + vertical[i] > 8) {
					continue;
				}
				count++;
			}
		}
		
		System.out.println(count);
	}

}
