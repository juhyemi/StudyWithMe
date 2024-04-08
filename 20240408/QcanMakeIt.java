import java.io.*;
import java.util.*;
public class QcanMakeIt {
    static int answer=0;
    static boolean[] check, visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
            sum+=k;
        }
        check = new boolean[sum];
        check[0]=true;
        visit = new boolean[arr.length];
        for(int i=1; i<sum; i++){
            if(!check[i-1]){
                answer=i-1;
                break;
            }
            if(!check[i]){
                DFS(i, 0, arr, visit);
            }else{
                continue;
            }
        }
        System.out.print(answer);
    }
    static void DFS(int target, int sum, int[] arr, boolean[] visit){

        if(sum>target) return;
        else check[sum] = true;

        for(int i=0; i<arr.length; i++){
            if(!visit[i]){
                visit[i] = true;
                DFS(target, sum+arr[i], arr, visit);
                visit[i] = false;
            }
        }
    }

}
