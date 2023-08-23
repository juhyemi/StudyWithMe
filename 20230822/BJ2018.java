package TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2018 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int start =0;
		int end = 1;
		int count=1;
		int sum=1;
		while(end < N) {
			if(sum==N) count++;
			
			if(sum < N) {
				end++;
				sum+= end;
			}
			else if(sum >= N) {
				start++;
				sum -= start;
			}
		}
		System.out.println(count);
	}

}
