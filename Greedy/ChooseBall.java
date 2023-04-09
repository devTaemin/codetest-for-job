//public class ChooseBall {
//	public static int N, M;
//	public static int total;
//	public static int[] arr;
//	public static boolean[] visited;
//	
//	public static void Combination(int start, int depth, int len) {
//		
//		if (depth == len) {
//			int count = 1;
//			
//			for (int i = 1; i <= M; i++) {
//				if (visited[i] == true) {
//					count *= arr[i];
//					System.out.printf("%d ", i);
//				}
//			}
//			System.out.println();
//			total += count;
//			return;
//		}
//		
//		for (int i = start; i <= M; i++) {
//			if (visited[i] == false) {
//				visited[i] = true;
//				Combination(i + 1, depth + 1, len);
//				visited[i] = false;
//			}
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		N = sc.nextInt();
//		M = sc.nextInt();
//		arr = new int[M + 1];
//		visited = new boolean[M + 1];
//		
//		for (int i = 0; i < N; i++) {
//			int value = sc.nextInt();
//			arr[value]++;
//		}
//		
//		total = 0;
//		Combination(1, 0, 2);
//		
//		System.out.println(total);	
//	}
//}
