package StudyWithMe;
import java.util.*;
import java.io.*;

public class q7568 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] weight = new int[n];
		int[] tall = new int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			tall[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<n; i++) {
			int w = weight[i];
			int t = tall[i];
			int tmp=1;
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				if(w<weight[j]&&t<tall[j]) tmp++;
			}
			sb.append(tmp).append(" ");
		}
		System.out.print(sb);
	}
}
