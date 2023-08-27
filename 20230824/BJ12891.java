package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ12891 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int result = 0;
		char[] c = bf.readLine().toCharArray();
		int[] arr = new int[4];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<4;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}		
		int[] temp = new int[4];
		boolean check = true;
		for(int i=0;i<P;i++) {
			if(c[i]=='A') temp[0]++;
			else if(c[i]=='C') temp[1]++;
			else if(c[i]=='G') temp[2]++;
			else if(c[i]=='T') temp[3]++;
		}
		for(int k=0;k<4;k++) {
			if(arr[k]>temp[k])
				check = false;
		}
		if(check) result++;
		
		for(int i=P;i<S;i++) {
			int j = i - P;
			if(c[j]=='A') temp[0]--;
			else if(c[j]=='C') temp[1]--;
			else if(c[j]=='G') temp[2]--;
			else if(c[j]=='T') temp[3]--;
			
			if(c[i]=='A') temp[0]++;
			else if(c[i]=='C') temp[1]++;
			else if(c[i]=='G') temp[2]++;
			else if(c[i]=='T') temp[3]++;
			
			check = true;
			for(int k=0;k<4;k++) {
				if(arr[k]>temp[k]) {
					check = false;
					break;
				}
			}
			if(check) result++;
		}
		System.out.println(result);
	}

}
