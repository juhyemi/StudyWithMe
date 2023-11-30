package StudyWithMe;
import java.util.*;
import java.io.*;

public class q2775 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[k+1][n+1];
			for(int j=0; j<=n; j++) {
				arr[0][j]=j;
			}
			for(int j=1; j<=k; j++) {
				for(int o=1; o<=n; o++) {
					if(o==1) arr[j][o]=1;
					else {
						arr[j][o] = arr[j][o-1]+arr[j-1][o];
					}
				}
			}
			sb.append(arr[k][n]).append("\n");
		}
		System.out.println(sb);
	}
}
