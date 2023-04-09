//public class ArrangeString {
//	
//	public static String str;
//	public static ArrayList<Character> result = new ArrayList<Character>();
//	public static int value = 0;
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		str = sc.next();
//		
//		for (int i = 0; i < str.length(); i++) {
//			// Check if the character is letter
//			if (Character.isLetter(str.charAt(i))) {
//				result.add(str.charAt(i));
//			}
//			else {
//				value += str.charAt(i) - '0';
//			}
//		}
//		
//		// Sort in ascending order
//		Collections.sort(result);
//		
//		// Print sorted characters
//		Iterator<Character> iter = result.iterator();
//		while(iter.hasNext()) {
//			System.out.print(iter.next());
//		}
//		
//		// Print value if it is not 0
//		if (value != 0) System.out.print(value);
//		
//	}
//
//}
