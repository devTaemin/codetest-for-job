//public class UntilOne {
//	public static int N, K;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		K = sc.nextInt();
//		
////		int count = 0;
////		while(N > 1) {
////			N = (N % K == 0) ? N / K : N - 1;			
////			count++;
////		}
//		
//		// If The number of N is over 100_000_000_000 ?
//		int count = 0;
//		int result = 0;
//		int rest = 0;
//		while (true) {
//			result = N / K;
//			rest = N % K;
//			
//			// First, Subtract one until N could be divided by K
//			// Second, Add one for division
//			count += (rest + 1);
//			
//			// Third, Check out the result of division, if it is lower than K
//			if (result < K) {
//				count += (result - 1);
//				break;
//			}
//			
//			// Fourth, N refers to the result of division
//			N = result;
//		}
//
//		System.out.println(count);
//	}
//
//}
