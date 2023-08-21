package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11659 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int[] array = new int[N+1];
		int[] arraySum = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			array[i] = Integer.parseInt(st.nextToken());
			arraySum[i] = arraySum[i-1]+ array[i];
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(arraySum[m]-arraySum[n-1]);
		}
	}

}
