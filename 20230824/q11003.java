package StudyWithMe;
import java.util.*;
import java.io.*;
public class q11003 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<int[]> dq = new ArrayDeque<>();
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			while(!dq.isEmpty()&&dq.peekLast()[0]>tmp){
				dq.pollLast();
			}
			dq.addLast(new int[] {tmp,i});
			if(dq.peekFirst()[1]<i-(l-1)) {
				dq.pollFirst();
			}
			sb.append(dq.peekFirst()[0]+" ");
		}
		System.out.println(sb);
	}
}
