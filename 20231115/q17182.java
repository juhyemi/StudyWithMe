package StudyWithMe;
import java.util.*;
import java.io.*;
public class q17182 {
	static int n, answer;
	static boolean[] visit;
	static int[][] map, cost;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		answer=Integer.MAX_VALUE;
		visit = new boolean[n];
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					map[k][j] = Math.min(map[k][j], map[k][i]+map[i][j]);
				}
			}
		}
		visit[start]=true;
		DFS(start, 0, 1);
		System.out.println(answer);
	}
	static void DFS(int start, int sum, int cnt) {
		if(cnt==n){
			answer=Math.min(answer, sum);
			return;
		}
		for(int i=0; i<n; i++) {
			if(start!=i) {
				if(!visit[i]) {
					visit[i]=true;
					DFS(i,sum+map[start][i],cnt+1);
					visit[i]=false;
				}

			}
		}
		
		
	}
}
