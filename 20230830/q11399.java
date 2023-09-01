package StudyWithMe;
import java.util.*;
import java.io.*;
public class q11399 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] time = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);
		int sum = 0;
		int total = 0;
		for(int i=0; i<n; i++) {
			sum += time[i];
			total += sum;
		}
		System.out.println(total);
	}
}
