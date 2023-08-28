package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[s.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Character.getNumericValue((s.charAt(i)));
		}
		for(int i=0;i<arr.length;i++) {
			int max =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[max] < arr[j]) max = j;
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
	
}
