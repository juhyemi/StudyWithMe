package StudyWithMe;

import java.io.*;
import java.util.*;

public class q11659 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		for(int i=1; i<n; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			if(a==0) {
				System.out.println(arr[b]);
			}else if(a==b){
				System.out.println(arr[a]-arr[a-1]);
			}else {
				System.out.println(arr[b]-arr[a-1]);
			}
		}
		
		

	}
}
