package StudyWithMe;
import java.util.*;
import java.io.*;
public class q1253 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long answer = 0;
		long[] arr =  new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			long target = arr[i];
			int fir = 0;
			int la = n-1;
			while(fir<la) {
				if(fir==target)fir++;
				if(la==target) la--;
				if(fir>=la) break;
				if(arr[fir]+arr[la]==target) {
					answer++;
					break;
				}else if(arr[fir]+arr[la]>target) {
					la--;
				}else {
					fir++;
				}
			}
		}
		System.out.println(answer);
	}
}
