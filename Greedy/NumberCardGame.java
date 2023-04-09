//public class NumberCardGame {
//	public static int N, M;
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		st = new StringTokenizer(br.readLine());
//		N = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(st.nextToken());
//		
//		int max_value = -(int)1e9;
//		int min_value = (int)1e9;
//		
//		for (int i = 0; i < N; i++) {
//			min_value = (int)1e9;
//			st = new StringTokenizer(br.readLine());
//			for (int j = 0; j < M; j++) {
//				int value = Integer.parseInt(st.nextToken());
//				
//				// Find the minimum value in each row
//				min_value = (min_value < value) ? min_value : value;
//			}
//			
//			// Find the maximum value among the minimum value of each row
//			max_value = (min_value < max_value) ? max_value : min_value;
//		}
//		
//		bw.write(max_value + "\n");
//		bw.flush();
//		bw.close();
//	}
//
//}
//
