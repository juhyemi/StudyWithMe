package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ13023{
	static int N, M;
	static ArrayList<Integer>[] list;
	static boolean visited[];
	static int check;
	
	static void DFS(int n, int depth) {
		if(depth==5) {
			check=1;
            return;
		}
		visited[n]=true;
		for(int i=0;i<list[n].size();i++) {
			int k = list[n].get(i);
			if(!visited[k]) {
				DFS(k, depth+1);
			}
		}
		visited[n] = false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		
		list = new ArrayList[N];
        visited = new boolean[N];
		for(int i=0;i<N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		check=0;
		for(int i=0;i<N;i++) {
			DFS(i,1);
			if(check==1) break;
		}
		
		System.out.println(check);
		
	}

}

