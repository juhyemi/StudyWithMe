package StudyWithMe;
import java.util.*;
import java.io.*;
public class q10986 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[m];
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = (sum+Integer.parseInt(st.nextToken()))%m;
			arr[sum]++;
		} 
		long answer = arr[0];
		for(int i=0; i<m; i++) {
			answer += (long)arr[i] * (arr[i]-1)/2;
		}
		System.out.println(answer);
	}

}
