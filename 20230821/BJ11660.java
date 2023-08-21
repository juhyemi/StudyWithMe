package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ11660 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] array = new int[M+1][M+1];
		int[][] arraySum = new int[M+1][M+1];
		
		for(int i=1;i<=M;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=1;j<=M;j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				arraySum[i][j] = arraySum[i][j-1] + array[i][j]; 
			}
		}
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = 0;
			for(int j=x1;j<=x2;j++) {
				result+= arraySum[j][y2];
				if(y1>1) 
					result-= arraySum[j][y1-1];		
			}
			bw.write(result+"\n");
		}
		
		bw.flush();
	}

}
