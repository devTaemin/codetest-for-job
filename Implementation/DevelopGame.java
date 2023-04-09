//public class DevelopGame {
//	public static int N, M;
//	public static int[][] map;
//	public static boolean[][] visited;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		M = sc.nextInt();
//		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int d = sc.nextInt();	// Direction
//		
//		map = new int[N][M];
//		visited = new boolean[N][M];
//		
//		for (int row = 0; row < N; row++) {
//			for (int col = 0; col < M; col++) {
//				map[row][col] = sc.nextInt();
//			}
//		}
//		
//		// Possible movement (North, West, South, East);
//		int[] dx = { 0, 1, 0, -1};
//		int[] dy = { -1, 0, 1, 0};
//		
//		// Backward movement
//		int[] bx = { 1, 0, -1, 0 };
//		int[] by = { 0, 1, 0, -1 };
//		
//		// Initialize Conditions
//		visited[x][y] = true;
//		int count = 1;
//		int numOfSearch = 0;
//		
//		while (true) {
//			
//			// If there are no possible route, Try to go backward and Check it is possible
//			if (numOfSearch == 4) {
//				int nextX = x + bx[d];
//				int nextY = y + by[d];
//				
//				// Case: Impossible route
//				if (nextX < 0 || nextY < 0 || nextX > N - 1 || nextY > M - 1) break;
//				
//				// Case: Ocean
//				if (map[nextX][nextY] == 1) break;
//				
//				// Case: Possible to return
//				if (visited[nextX][nextY] == false) {
//					visited[nextX][nextY] = true;
//					count++;
//				}
//				x = nextX;
//				y = nextY;
//				numOfSearch = 0;
//				d = (d + 2) % 4;
//			}
//			
//			int checkX = x + dx[d];
//			int checkY = y + dy[d];
//			
//			if (checkX < 0 || checkY < 0 || checkX > N - 1 || checkY > M - 1) {
//				d = (d + 1) % 4;
//				numOfSearch += 1;
//			}
//			else {
//				// If checkRoute is impossible
//				if (map[checkX][checkY] == 1 || visited[checkX][checkY] == true) {
//					d = (d + 1) % 4;
//					numOfSearch+= 1;
//				}
//				// If checkRoute is possible
//				else {
//					visited[checkX][checkY] = true;
//					x = checkX;
//					y = checkY;
//					numOfSearch = 0;
//					count++;
//				}
//			}
//		}
//		
//		System.out.println(count);
//	}
//
//}
