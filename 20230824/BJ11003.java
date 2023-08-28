package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ11003 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		Deque<int[]> deq = new LinkedList<>();
		for(int i=0;i<N;i++) {
			int n = Integer.parseInt(st.nextToken());
			 while (!deq.isEmpty() && deq.peekLast()[1] > n) {
	                deq.removeLast();
	            }
	            deq.addLast(new int[]{i, n});

	          if(i - L >= deq.peekFirst()[0]) {
	                deq.removeFirst();
	            }

			int tmp2[] = deq.peekFirst();
			sb.append(tmp2[1]+" ");
		}
		System.out.println(sb);
	}
}

