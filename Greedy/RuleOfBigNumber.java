//public class RuleOfBigNumber {
//	public static int N, M, K;
//	public static Integer[] array;
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		st = new StringTokenizer(br.readLine());
//		N = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(st.nextToken());
//		K = Integer.parseInt(st.nextToken());
//		
//		array = new Integer[N];
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < N; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		Arrays.sort(array, new Comparator<Integer>(){
//			@Override
//			public int compare(Integer i1, Integer i2) {
//				return i2 - i1;
//			}
//		});
//
//		int first = array[0];
//		int second = array[1];
//		
//		// The number of reptition 
//		int rep = M / (K + 1);
//
//		// The number of rest times
//		int rest = M % (K + 1);
//
//		// Calculate Total
//		int total = first * (K * rep + rest) + second * rep;
//		
//		bw.write(total + "\n");
//		bw.flush();
//		bw.close();
//	}
//	
//}
