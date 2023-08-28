package StudyWithMe;
import java.util.*;
import java.io.*;
public class q17298 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n; i++) {
			while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]) {
				arr[stack.pop()] = arr[i];
			}
			stack.add(i);
		}
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		for(int k:arr) {
			sb.append(k).append(' ');
		}
		System.out.println(sb);
	}
}
