package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] arr = new int[N];
		int[] myArr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int idx = 0;
		Stack<Integer> stack = new Stack<>();
		while(idx < N) {
			if(stack.isEmpty() || arr[stack.peek()] >= arr[idx]) {
				stack.add(idx++);
			}
			else {
				myArr[stack.peek()]=arr[idx];
				stack.pop();
			}
		}
		for(int j=0;j<N;j++) {
			if(myArr[j]==0)
				sb.append(-1+" ");
			else
				sb.append(myArr[j]+" ");
		}
		System.out.println(sb.toString().trim());
	}
}
