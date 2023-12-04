package StudyWithMe;
import java.util.*;
import java.io.*;
public class q7569 {
	static int n,m,h,answer;
	static List<int[][]> ls;
	static List<int[][]> visit;
	static int[] dx = {0,0,1,-1,0,0};
	static int[] dy = {1,-1,0,0,0,0};
	static int[] dz = {0,0,0,0,1,-1};
	static Queue<Poo> q = new LinkedList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		h=Integer.parseInt(st.nextToken());
		ls = new ArrayList<>();
		visit = new ArrayList<>();
		answer = 0;
		boolean flag = true;
		for(int i=0; i<h; i++) {
			ls.add(new int[m][n]);
			visit.add(new int[m][n]);
			for(int j=0; j<m; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=0; k<n; k++) {
					int che = Integer.parseInt(st.nextToken());
					ls.get(i)[j][k] = che;
					if(che==0) flag=false;			
				}
			}
		}//토마토 박스 완성
		
		if(flag) System.out.print(answer);
		else {
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					for(int t=0; t<h; t++) {
						if(ls.get(t)[i][j]==1) q.add(new Poo(i,j,t));
					}
				}
			}
			BFS();
			loop:
				for(int t=0; t<h; t++) {
					for(int i=0; i<m; i++) {
						for(int j=0; j<n; j++) {
							if(ls.get(t)[i][j] == 0) {
								answer=-1;
								break loop;
							}else {
								answer = Math.max(answer, visit.get(t)[i][j]);
							}
						}
					}
				}
			System.out.print(answer);
		}
	}
	static void BFS() {
		while(!q.isEmpty()) {
			Poo tmp = q.poll();
			int x = tmp.x;
			int y = tmp.y;
			int z = tmp.z;
			for(int i=0; i<6; i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				int nz=z+dz[i];
				if(nx>=0&&ny>=0&&nx<m&&ny<n&&nz>=0&&nz<h&&ls.get(nz)[nx][ny]==0) {
					ls.get(nz)[nx][ny]=1;
					visit.get(nz)[nx][ny]=visit.get(z)[x][y]+1;
					q.add(new Poo(nx,ny,nz));
				}
			}
		}
	}
}
class Poo{
	int x,y,z;
	Poo(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
