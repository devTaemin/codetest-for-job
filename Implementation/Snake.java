//class Tail {
//	
//	private int x;
//	private int y;
//	
//	public Tail(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public int getX() {
//		return this.x;
//	}
//	
//	public int getY() {
//		return this.y;
//	}
//}
//
//public class Snake {
//	
//	public static int N, K, L;
//	public static char[] changeDirection = new char[999999];
//
//	
//	public static int rotateDirection(int current, char change) {
//		// North(0), East(1), South(2), West(3)
//		int result = 0;
//		
//		if (current == 0) {
//			if (change == 'L') result = 3;
//			if (change == 'D') result = 1;
//		}
//		
//		if (current == 1) {
//			if (change == 'L') result = 0;
//			if (change == 'D') result = 2;
//		}
//		
//		if (current == 2) {
//			if (change == 'L') result = 1;
//			if (change == 'D') result = 3;
//		}
//		
//		if (current == 3) {
//			if (change == 'L') result = 2;
//			if (change == 'D') result = 0;
//		}
//		
//		return result;	
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		// Map
//		N = sc.nextInt();
//		int[][] map = new int[N][N];
//		
//		// Apple
//		K = sc.nextInt();
//		for (int i = 0; i < K; i++) {
//			int row = sc.nextInt();
//			int col = sc.nextInt();
//			map[row - 1][col - 1] = 1;
//		}
//		
//		// Direction
//		L = sc.nextInt();
//		for (int i = 0; i < L; i++) {
//			int sec = sc.nextInt();
//			char direction = sc.next().charAt(0);
//			changeDirection[sec] = direction;
//		}
//		
//		int curDirection = 1;
//		int curSecond = 0;
//		int[] headIndex = { 0, 0 };
//		
//		Queue<Tail> q = new LinkedList<Tail>();
//		q.offer(new Tail(headIndex[0], headIndex[1]));
//		map[0][0] = -1;
//		
//		int[] dRow = { -1, 0, 1, 0 };
//		int[] dCol = { 0, 1, 0, -1 };
//		
//		while (true) {
//			
//			// Time pass
//			curSecond++;
//			
//			// Check Direction
//			char check = changeDirection[curSecond - 1];
//			if (check == 'L' || check == 'D') {
//				curDirection = rotateDirection(curDirection, check);
//			}
//			
//			// Snake Move
//			// 1. check If it is in boundary of map
//			int nextRow = headIndex[0] + dRow[curDirection];
//			int nextCol = headIndex[1] + dCol[curDirection];
//			
//			if (nextRow < 0 || nextRow > N - 1 || nextCol < 0 || nextCol > N - 1) {
//				break;
//			}
//			
//			// 2. check If it is body of snake or not
//			if (map[nextRow][nextCol] == -1) {
//				break;
//			}
//			
//			// 3. check If it is apple or not
//			if (map[nextRow][nextCol] == 1) {
//				// keep in body
//				q.offer(new Tail(nextRow, nextCol));
//				// occupy head
//				map[nextRow][nextCol] = -1;
//				headIndex[0] = nextRow;
//				headIndex[1] = nextCol;
//			}
//			else {
//				// Remove tail
//				Tail tail = q.poll();
//				map[tail.getX()][tail.getY()] = 0;
//				
//				// keep in body
//				q.offer(new Tail(nextRow, nextCol));
//				// occupy head
//				map[nextRow][nextCol] = -1;
//				headIndex[0] = nextRow;
//				headIndex[1] = nextCol;
//			}
//		}
//		
//		System.out.println(curSecond);
//	}
//}
