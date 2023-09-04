package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11399 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			int n = Integer.parseInt(st.nextToken());
			arr[i] = n;
		}
		Arrays.sort(arr);
		int sum =arr[0];
		for(int i=1;i<N;i++) {
			arr[i] = arr[i-1]+arr[i];
			sum+= arr[i];
		}
		System.out.println(sum);
	}

}
