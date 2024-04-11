import java.util.*;
import java.io.*;
public class Q3190 {
    static Character[][] map;
    static int[][] mission;
    static int[] dx={1,0,-1,0};
    static Queue<Point> q = new LinkedList<>();
    static int[] dy={0,-1,0,1}; //하,좌,상,우
    static int n,answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        answer=0;
        n = Integer.parseInt(br.readLine());
        map = new Character[n][n];
        int k = Integer.parseInt(br.readLine());
        for(int i=0; i<k ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            map[a][b] = 'A';
        }
        k = Integer.parseInt(br.readLine());
        mission = new int[k][k];
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            mission[i][0]=Integer.parseInt(st.nextToken())+1;
            String tmp = st.nextToken();
            if(tmp.equals("L")) mission[i][1] = -1;
            else mission[i][1] = 1;
        }

        q.add(new Point(0,0));
        map[0][0] = 'M';
        //index는 우 에서 시작, L이면 index+1, D면 -1
        BAM(0,0,3,1);
        System.out.print(answer);

    }
    static void BAM(int x,int y,int idx, int cnt){
        for(int i=0;i<mission.length; i++){
            if(cnt==mission[i][0]){
                idx+=mission[i][1];
                if(idx==-1) idx=3;
                else if(idx==4) idx=0;
                break;
            }
        }
        int nx = x+dx[idx];
        int ny = y+dy[idx];
        if(nx>=0&&ny>=0&&nx<n&&ny<n){
            if(map[nx][ny]!=null&&map[nx][ny]=='A'){
                q.add(new Point(nx,ny));
                map[nx][ny]='M';
                BAM(nx,ny,idx,cnt+1);
                return;
            }
            if(map[nx][ny]==null||map[nx][ny]==' '){
                Point p=q.poll();
                map[p.x][p.y]=' ';
                q.add(new Point(nx,ny));
                map[nx][ny]='M';
                BAM(nx,ny,idx,cnt+1);
                return;
            }
            if(map[nx][ny]=='M'){
                answer=cnt;
            }
        }else answer=cnt;
    }
}
class Point{
    int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
