//public class MultipleOrPlus {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] arr = sc.next().split("");
//		
//		int[] intArr = new int[arr.length];
//		
//		for (int i = 0; i < arr.length; i++) {
//			intArr[i] = Integer.parseInt(arr[i]);
//		}
//		
//		int result = intArr[0];
//		
//		for (int i = 1; i < arr.length; i++) {
//			// If any operands are 0 or 1, Plus is better option than Multiplication
//			if (result == 0 || result == 1 || intArr[i] == 0 || intArr[i] == 1) {
//				result += intArr[i];
//			}
//			else {
//				result *= intArr[i];
//			}
//		}
//		
//		System.out.println(result);
//		
//	}
//
//}
