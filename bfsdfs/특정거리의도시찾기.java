import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 특정거리의도시찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // BFS
        Queue<Integer> queue = new LinkedList<Integer>();

        // 도시의 수, 도로의 수, 거리, 시작점
        int numOfCity = Integer.parseInt(st.nextToken());
        int numOfRoad = Integer.parseInt(st.nextToken());
        int distance = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        // 경로, 최소 거리 테이블
        ArrayList<ArrayList<Integer>> routes = new ArrayList<ArrayList<Integer>>();
        int[] minDistance = new int[numOfCity + 1];
        boolean[] visited = new boolean[numOfCity + 1];

        for (int i = 0; i <= numOfCity; i++) {
            routes.add(new ArrayList<>());
        }

        for (int i = 0; i < numOfRoad; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            routes.get(from).add(to);
        }

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int from = queue.poll();
            for (int i = 0; i < routes.get(from).size(); i++) {
                int to = routes.get(from).get(i);

                if (visited[to]) {
                    minDistance[to] = Math.min(minDistance[to], minDistance[from] + 1);
                } else {
                    minDistance[to] = minDistance[from] + 1;
                }

                visited[to] = true;
                queue.add(to);
            }
        }

        for (int i = 1; i <= numOfCity; i++) {
            if (minDistance[i] == distance) {
                System.out.println(i);
            }
        }
    }
}
