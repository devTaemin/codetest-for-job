import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 국영수 {

    static class Student implements Comparable<Student>{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student other) {

            if (this.korean != other.korean) {
                return Integer.compare(other.korean, this.korean);
            }

            if (this.english != other.english) {
                return Integer.compare(this.english, other.english);
            }

            if (this.math != other.math) {
                return Integer.compare(other.math, this.math);
            }

//            return compareName(this.name, other.name);
            return this.name.compareTo(other.name);
        }
    }

//    public static int compareName(String o1, String o2) {
//        char[] charO1 = o1.toCharArray();
//        char[] charO2 = o2.toCharArray();
//
//        int len = Math.min(charO1.length, charO2.length);
//
//        for (int i = 0; i < len; i++) {
//            if (charO1[i] != charO2[i]) {
//                return Integer.compare(charO1[i] - '0', charO2[i] - '0');
//            }
//        }
//
//        if (charO1.length < charO2.length) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> array = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            array.add(new Student(name, korean, english, math));
        }

        Collections.sort(array);

        for (Student student : array) {
            System.out.println(student.name);
        }
    }
}
