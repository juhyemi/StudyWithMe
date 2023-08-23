package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10986 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long result = 0L;
		long[] arr = new long[N];
		long[] arrMod = new long[M];
		long sum =0;
		st= new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Long.parseLong(st.nextToken());
			sum += arr[i];
			if(sum % M ==0) result++;
			arrMod[(int) (sum % M)]++;
		}
		
		
		for(int i=0;i<M;i++) {
			result += (long)arrMod[i] * (arrMod[i]-1) /2;
		}
		System.out.println(result);
		
				
	}

}
