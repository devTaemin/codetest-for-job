//public class ReverseString {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] numbers = sc.next().split("");
//		
//		int[] arr = new int[numbers.length];
//		int[] result = new int[2];
//		
//		for (int i = 0; i < numbers.length; i++) {
//			arr[i] = Integer.parseInt(numbers[i]);
//		}
//		
//		int number = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			int current = arr[i];
//			
//			if (number == current) continue;
//			
//			if (number != current) {
//				result[number]++;
//				number = current;
//			}
//		}
//		
//		result[number]++;
//		
//		int flip = (result[0] < result[1]) ? result[0] : result[1];
//		System.out.println(flip);
//		
//	}
//
//}
