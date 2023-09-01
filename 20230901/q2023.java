package StudyWithMe;
import java.io.*;
public class q2023 {
	static StringBuilder sb;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		result(0,n);
		System.out.println(sb);
	}
	static void result(int start, int count) {
		if(count == 0) {
			if(isokay(start)) sb.append(start).append("\n");
			return;
		}
		for(int i=1; i<=9; i++) {
			if(isokay(start*10+i)) {
				result(start*10+i,count-1);
			}
		}
	}
	static boolean isokay(int total) {
		if(total<2) return false;
		for(int i=2; i<=Math.sqrt(total); i++) {
			if(total%i==0) return false;
		}
		return true;
	}
}
