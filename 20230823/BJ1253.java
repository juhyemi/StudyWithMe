package TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1253 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long[] arr= new long[N];
		for(int i=0;i<N;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<N;i++) {
			int start=0;
			int end=N-1;
			while(start < end) {
				if(arr[start]+arr[end] < arr[i]) {
					start++;
				} 
				else if(arr[start]+arr[end] > arr[i])
					end--;
				else {
					if(start==i) start++;
					else if(end==i) end--;
					else {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}
