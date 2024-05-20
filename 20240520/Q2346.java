import java.io.*;
import java.util.*;
public class Q2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> dq = new ArrayDeque<>();
        sb.append(1+" ");
        int repeat = Integer.parseInt(st.nextToken());
        for(int i=2; i<=n; i++){
            dq.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        while(dq.size()!=0){
            if(repeat>0){
                for(int i=1; i<repeat; i++){
                    dq.add(dq.poll());
                }
                int[] next = dq.poll();
                sb.append(next[0]+" ");
                repeat = next[1];
            }else if(repeat<0){
                for(int i=1; i<Math.abs(repeat); i++){
                    dq.addFirst(dq.pollLast());
                }
                int[] next = dq.removeLast();
                sb.append(next[0]+" ");
                repeat = next[1];
            }
        }
        System.out.println(sb);
    }
}