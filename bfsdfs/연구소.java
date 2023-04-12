import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 연구소 {

    // North, East, South, West
    static int Max;
    static int[] Dx = { -1, 0, 1, 0 };
    static int[] Dy = { 0, 1, 0, -1 };
    static class Virus {
        int row;
        int col;

        public Virus(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행, 열
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 바이러스 배열, 연구소 맵, 방문 배열
        ArrayList<Virus> array = new ArrayList<>();
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        // 연구소 맵 갱신, 바이러스 배열 갱신
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int type = Integer.parseInt(st.nextToken());
                map[i][j] = type;

                if (type == 2) {
                    array.add(new Virus(i, j));
                }
            }
        }

        Max = 0;
        // DFS
        DFS(map, visited, array,0, 3, n, m);
        System.out.println(Max);
    }
    public static int[][] copyMap(int[][] map) {
        int row = map.length;
        int col = map[0].length;

        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = map[i][j];
            }
        }

        return result;
    }

    public static boolean validateRange(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
    public static void BFS(int[][] map, ArrayList<Virus> array) {
        Queue<Virus> queue = new LinkedList<Virus>();
        Iterator<Virus> iter = array.iterator();
        while(iter.hasNext()) {
            queue.add(iter.next());
        }

        int[][] result = copyMap(map);
        while (!queue.isEmpty()) {
            Virus cur = queue.poll();
            int row = cur.row;
            int col = cur.col;

            for (int d = 0; d < 4; d++) {
                int nextRow = row + Dx[d];
                int nextCol = col + Dy[d];

                if (!validateRange(nextRow, nextCol, result.length, result[0].length)) continue;
                if (result[nextRow][nextCol] !=0) continue;

                result[nextRow][nextCol] = 2;
                queue.add(new Virus(nextRow, nextCol));
            }
        }

        int localMax = 0;
        for (int[] line : result) {
            for (int elem : line) {
                if (elem == 0) localMax++;
            }
        }

        Max = Math.max(Max, localMax);
    }

    public static void DFS(int[][] map, boolean[][] visited, ArrayList<Virus> array, int depth, int target, int n, int m) {
        if (target == depth) {
            BFS(map, array);
            return;
        }

        // 이전 지정 row, col 이후로 잡아야한다
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    map[i][j] = 1;
                    DFS(map, visited, array, depth + 1, target, n, m);
                    visited[i][j] = false;
                    map[i][j] = 0;
                }
            }
        }
    }
}
