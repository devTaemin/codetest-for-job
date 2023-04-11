import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 여행계획 {

    public static int findParents(int[] parents, int i) {
        if (parents[i] != i) {
            parents[i] = findParents(parents, parents[i]);
        }

        return parents[i];
    }

    public static void union(int[] parents, int i, int j) {
        i = findParents(parents, i);
        j = findParents(parents, j);

        if (i <= j) {
            parents[j] = i;
        } else {
            parents[i] = j;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] parents = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int connect = Integer.parseInt(st.nextToken());
                if (connect == 1) {
                    union(parents, i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int root = parents[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < m - 1; i++) {
            int town = Integer.parseInt(st.nextToken());
            if (root != parents[town]) {
                sb.append("NO");
                break;
            }
        }

        if (!sb.toString().equals("NO")) {
            sb.append("YES");
        }

        System.out.println(sb.toString());
    }
}
