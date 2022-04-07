public class UnmakablePrice {
	public static int N;
	public static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			array.add(sc.nextInt());
		}
		
		Collections.sort(array);
		Iterator<Integer> iter = array.iterator();
		
		// Target number to make
		int target = 1;
		
		while(iter.hasNext()) {
			// Get coin from array
			int coin = iter.next();
			
			// Assume that the price below target - 1 (include) is possible
			// If the coin is beyond target, target is not possible 
			if (target < coin) break;
			
			// Next target is (target + coin)
			// Because (target - 1) is possible, then the price until target + coin - 1 is possible
			target += coin;
		}
		
		System.out.println(target);
		
	}
}
