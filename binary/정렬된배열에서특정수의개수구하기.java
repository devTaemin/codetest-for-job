import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 정렬된배열에서특정수의개수구하기 {

    // 목표 값 x가 발견되는 첫 번째 인덱스
    public static int firstIndex(ArrayList<Integer> array, int n, int x) {

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array.get(mid) > x) {
                // 발견한 값이 목표 값보다 큰 경우 끝 지점을 중위 지점보다 낮춘다
                end = mid - 1;
            } else if (array.get(mid) < x) {
                // 발견한 값이 목표 값보다 작은 경우 첫 지점을 중위 지점보다 높인다
                start = mid + 1;
            } else {
                // 발견한 값이 목표 값과 같은 경우 끝 지점을 중위 지점보다 낮춰서 첫 번째 인덱스에 가까워 진다
                end = mid - 1;
            }

        }

        return start;
    }

    public static int lastIndex(ArrayList<Integer> array, int n, int x) {

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array.get(mid) > x) {
                end = mid - 1;
            } else if (array.get(mid) < x) {
                start = mid + 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수열의 길이, 갯수
        int n = Integer.parseInt(st.nextToken());

        // 목표 값
        int x = Integer.parseInt(st.nextToken());

        // 수열
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(st.hasMoreTokens()) {
            array.add(Integer.parseInt(st.nextToken()));
        }

        int firstIndex = firstIndex(array, n, x);
        int lastIndex = lastIndex(array, n, x);


        if (    firstIndex >= n || lastIndex >= n ||
                array.get(firstIndex) != x || array.get(lastIndex) != x ) {
            System.out.println(-1);
        } else {
            System.out.println(lastIndex - firstIndex + 1);
        }
    }
}
