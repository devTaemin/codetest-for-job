public class LuckyStraight {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] array = br.readLine().toCharArray();
		int size = array.length;
		
		int totalA = 0;
		int totalB = 0;
		
		// Convert Char to Integer
		for (int i = 0; i < (size / 2); i++) {
			totalA += array[i] - '0';
		}
		
		// Convert Char to Integer
		for (int i = (size / 2); i < size; i++) {
			totalB += array[i] - '0';
		}
		
		String result = (totalA == totalB) ? "LUCKY" : "READY";
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		
	}

}
