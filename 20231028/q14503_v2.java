package study;
import java.util.*;
import java.io.*;
public class q14503_v2 {
	static int n,m,answer;
	static int[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};//북동남서
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken());//시작 x
		int sy = Integer.parseInt(st.nextToken());//시작 y
		int d = Integer.parseInt(st.nextToken());//처음 방향
		map = new int[n][m];
		answer = 0;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//map
		clean(sx,sy,d);
		System.out.println(answer);
	}
	static void clean(int sx, int sy, int d) {
		//현재 칸 청소
		if(map[sx][sy]==0) {
			map[sx][sy]=-1;
			answer++;
		}
		//주변 탐색
		boolean flag = false;
		for(int i=0; i<4; i++) {
			int nx = sx+dx[i];
			int ny = sy+dy[i];
			if(nx>=0&&ny>=0&&nx<n&&ny<m&&map[nx][ny]==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			//청소 안 한 칸이 있을 경우
			for(int i=0; i<4; i++) {
				d--;
				if(d==-1) {
					d=3;
				}
				int nx = sx+dx[d];
				int ny = sy+dy[d];
				if(nx>=0&&ny>=0&&nx<n&&ny<m&&map[nx][ny]==0) {
					clean(nx,ny,d);
					break;
				}
			}
		}else {
			//청소 안 한 칸이 없을 경우 후진하는데 벽이면 멈춤
			int idx = d;
			idx+=2;
			if(idx>3) {
				idx-=4;
			}
			int nx = sx+dx[idx];
			int ny = sy+dy[idx];
			if(map[nx][ny]==1) {
				return;
			}else {
				clean(nx,ny,d);
			}
		}
	}
}
