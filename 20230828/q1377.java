package StudyWithMe;
import java.util.*;
import java.io.*;
public class q1377 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer,Integer> map = new HashMap<>();
		HashMap<Integer,Integer> map2 = new HashMap<>();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			map.put(arr[i], i);
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			map2.put(arr[i], i);
		}
		int max = 0;
		for(int i=0; i<n; i++) {
			max = Math.max(max, map.get(arr[i])-map2.get(arr[i]));
		}
		System.out.println(max+1);
	}
}
