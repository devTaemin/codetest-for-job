package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 럭키스트레이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] scores = br.readLine().toCharArray();
        int len = scores.length;

        int total = 0;
        int half = 0;
        int idx = 0;

        for (char score : scores) {
            total += score - '0';
            if (idx < len / 2) half += score - '0';

            idx++;
        }

        if (total - half == half) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
