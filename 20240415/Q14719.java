import java.util.*;
import java.io.*;
public class Q14719 {
    static int h,w,answer;
    static boolean[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        answer = 0;
        map = new boolean[h][w];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<w; i++){
            int k = Integer.parseInt(st.nextToken());
            for(int j=0; j<k; j++){
                map[j][i] = true;
            }
        }
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(map[i][j]) {
                    int k = CHK(i,j);
                    j=k;
                }
            }
        }
        System.out.print(answer);
    }
    static int CHK(int j,int start){
        int count = 0;
        if(start+1>=w) return start;
        for(int i=start+1; i<w; i++){
            if(!map[j][i]){
                count++;
            }else{
                answer+=count;
                return i-1;
            }
        }
        return start;
    }
}
