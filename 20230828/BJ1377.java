package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class BJ1377 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		ArrayList<int[]> list = new ArrayList<>();
		ArrayList<int[]> list2 = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int n = Integer.parseInt(bf.readLine());
			list.add(new int[] {n,i});
		}
		
		list.sort(Comparator.comparingInt(arr -> arr[0]));
		for(int i=0;i<N;i++) {
			int[] temp = list.get(0);
			list2.add(new int[] {temp[0],i});
		}
		int max = 0;
		for(int i=0;i<N;i++) {
			int[] l1 = list.get(i);
			int[] l2 = list2.get(i);
			if(max <l1[1]- l2[1])
				max = l1[1]- l2[1];
		}
		System.out.println(max+1);
	}

}
