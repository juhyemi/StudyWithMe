package StudyWithMe;
import java.util.*;
import java.io.*;
public class q1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		long answer = 0;
		int chk = 0;
		for(int i=n-1; i>=0; i--) {
			if(arr[i]>m) {
				continue;
			}else {
				int tmp = m-arr[i];
				for(int j=chk; j<i; j++) {
					if(arr[j]==tmp) {
						answer++;
						chk = j+1;
					}else if(arr[j]>tmp) {
						break;
					}
				}
				if(Math.abs(i-chk)==1) {
					break;
				}
			}
			
		}
		System.out.println(answer);
		
	}
}
