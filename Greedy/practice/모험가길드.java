package practice;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 모험가길드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // 모험가의 수
        int n = Integer.parseInt(br.readLine());

        // 모험가의 위험 레벨
        ArrayList<Integer> list = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        // 위험 레벨 내림 차순 (모든 사람으로 그룹을 만들어야한다)
        Collections.sort(list, Collections.reverseOrder());

        // 모임 수
        int numOfGroup = 0;
        int curIndex = 0;
        while(true) {
            if (curIndex >= n) break;

            int level = list.get(curIndex);
            int nextIndex = curIndex + level - 1;

            if (nextIndex < n) {
                numOfGroup++;
            }

            curIndex = nextIndex + 1;
        }

        System.out.println(list.toString());
        System.out.println(numOfGroup);
    }
}
