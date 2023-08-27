package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BJ11286 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		for(int i=0;i<N;i++) {
			int n = Integer.parseInt(bf.readLine());
			if(n != 0) {
				que.add(new int[] {Math.abs(n), n});
			}
			else {
				if(!que.isEmpty()) {
					int[] temp = que.poll();
					System.out.println(temp[1]);
				}
				else System.out.println(0);
			}
		}
	}
}
