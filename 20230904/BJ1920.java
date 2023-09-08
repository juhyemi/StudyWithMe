package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1920 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] arr= new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i] =Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<M;i++) {
			int x = Integer.parseInt(st.nextToken());
			int low = 0;
			int high= N-1;
			boolean check = false;
			while(low <= high) {
				int mid = (low+high) /2;
				if(x == arr[mid]) {
					check = true;
					break;
				}
				else if(x < arr[mid]) high = mid -1;
				else low = mid +1;
			}
			if(check) System.out.println(1);
			else System.out.println(0);
		}
		
	}

}
