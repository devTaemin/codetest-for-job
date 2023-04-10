import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 금광 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int numOfTest = Integer.parseInt(br.readLine());

        for (int t = 0; t < numOfTest; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] map = new int[n+2][m+2];

            st = new StringTokenizer(br.readLine());
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= m; col++) {
                    map[row][col] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] dp = new int[n+2][m+2];

            for (int col = 1; col <= m; col++) {
                for (int row = 1; row <= n; row++) {
                    dp[row][col] = map[row][col] + Math.max(dp[row - 1][col - 1], Math.max(dp[row][col - 1], dp[row + 1][col - 1]));
                }
            }

            int max = 0;
            for (int row = 1; row <= n; row++) {
                max = Math.max(max, dp[row][m]);
            }

            sb.append(max + "\n");

        }
        System.out.println(sb.toString());
    }
}
