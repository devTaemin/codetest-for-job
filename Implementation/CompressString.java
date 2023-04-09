//class Solution {
//    public static int solution(String s) {
//        int answer = s.length();
//        
//        // Check the size of units
//        for (int unit = 1; unit <= (s.length() / 2); unit++) {
//            int index = 0;
//            int count = 1;
//            String compressed = "";
//            String prev = s.substring(index, index + unit);
//            index += unit;
//            
//            while (true) {
//                if (index + unit > s.length()) {
//                    if (count != 1) compressed += count;
//                    compressed += prev;
//                    for (int i = index; i < s.length(); i++) {
//                        compressed += s.charAt(i);
//                    }
//                    
//                    break;
//                }
//                
//                String current = s.substring(index, index + unit);
//                index += unit;
//                if (prev.equals(current)) {
//                    count++;
//                }
//                else {
//                    prev = current;
//                    if (count != 1) compressed += count;
//                    compressed += prev;
//                    count = 1;
//                }
//            }
//            answer = Math.min(answer, compressed.length());
//        }
//        
//        return answer;
//    }
//}