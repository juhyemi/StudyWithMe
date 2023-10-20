package stage2;
import java.util.*;
import java.io.*;
public class q10816 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();
		int k = arr[0];
		int cnt = 1;
		for(int i=1; i<n; i++) {
			if(k==arr[i]) {
				cnt++;
			}else {
				map.put(k, cnt);
				k = arr[i];
				cnt = 1;
			}
		}
		map.put(k, cnt);
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int chk = Integer.parseInt(st.nextToken());
			if(map.get(chk)==null) {
				sb.append(0).append(" ");
			}else {
				sb.append(map.get(chk)).append(" ");
			}
		}
		System.out.println(sb);
		
	}
}
