package StudyWithMe;
import java.util.*;
import java.io.*;
public class q13023 {
	static int n;
	static ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
	static boolean[] visit;
	static boolean answer;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++) {
			ls.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			ls.get(a).add(b);
			ls.get(b).add(a);
		}
		
		for(int i=0; i<n; i++) {
			visit = new boolean[n];
			dfs(i,0);
			if(answer) break;
		}
		if(answer) System.out.println(1);
		else System.out.println(0);
	}
	static void dfs(int start, int cnt) {
		visit[start] = true;
		cnt++;
		if(cnt==5) {
			answer= true;
            return;
		}
		for(int i=0; i<ls.get(start).size(); i++) {
			if(!visit[ls.get(start).get(i)]) {
				dfs(ls.get(start).get(i), cnt);
			}
		}
		visit[start] = false;
	}
}