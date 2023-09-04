package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2023 {
	static int N;
	
	static void DFS(int n, int k) {
		if(k==N) {
			if(isPrime(n)) System.out.println(n);
			return;
		}
		for(int i=1;i<=9;i++) {
			if(i%2!=0 && isPrime(n*10+i)) {
				DFS(n*10+i, k+1);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
	}
	
	static boolean isPrime(int n) {
		boolean check = true;
		if(n < 2) return false;
		for(int i=2;i<n/2;i++) {
			if(n % i==0) {
				return false;
			}
		}
		return  check;
	}

}
