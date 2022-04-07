public class UnmakablePrice {
	public static int N;
	public static int[] array;
	public static boolean[] visited;
	public static boolean[] result;
	
	
	public static void Combination(int start, int depth, int size) {
		
		if (depth == size) {
			int total = 0;
			for (int i = 0; i < array.length; i++) {
				if (visited[i] == true) {
					//System.out.printf("%d ", array[i]);
					total += array[i];
				}
			}
			//System.out.println();
			result[total] = true;
			return;
		}
		
		for (int i = start; i < array.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				Combination(i, depth + 1, size);
				visited[i] = false;
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		array = new int[N];
		visited = new boolean[N];
		
		int total = 0;
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			total += array[i];
		}
		
		// From 1 to total + 1
		result = new boolean[total + 1]; 
		
		// Sort in Ascending order
		Arrays.sort(array);
		
		for (int i = 1; i <= N; i++) {
			Combination(0, 0, i);
		}
		
		for (int i = 1; i <= total; i++) {
			if (result[i] == false) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
