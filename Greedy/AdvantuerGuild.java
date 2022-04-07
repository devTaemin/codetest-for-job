public class AdvanteurGuild {
	public static int N;
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	public static int[] count = new int[100001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < N; i++) {
			// Get the required size of group
			int index = Integer.parseInt(st.nextToken());
			
			// Store the number of person for required size
			count[index]++;
			
			// Store the types of size
			if(!array.contains(index)) array.add(index);
		}
		
		// Sort in ascending order
		Collections.sort(array);
		Iterator iter = array.iterator();
		
		// Total number of groups
		int result = 0;
		
		// Variable for counting the rest member failed to be a member of group
		int rest = 0;
		
		while(iter.hasNext()) {
			// Get required size
			int index = (Integer)iter.next();
			
			// Add the rest of members 
			count[index] += rest;
			
			// Count the group
			result += (count[index] / index);
			
			// Count the person who fails to be a member of group
			rest = count[index] % index;
			
		}
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		
	}

}
