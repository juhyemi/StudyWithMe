package StudyWithMe;
import java.util.*;
import java.io.*;

public class q12891 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()); //문자열의 수
		int p = Integer.parseInt(st.nextToken()); //비밀번호 자리수
		String dna = br.readLine(); //임의로 만든 문자열
		st = new StringTokenizer(br.readLine());
		int[] condition = new int[4];
		for(int i=0; i<4; i++) {
			condition[i] = Integer.parseInt(st.nextToken());
		}//비밀번호 충족조건
		//비밀번호 충족조건 A,C,G,T
		long answer = 0;
		int[] cnt = new int[4];
		
		for(int i=0; i<p; i++) {
			char tmp = dna.charAt(i);
			if(tmp=='A') {
				cnt[0]+=1;
			}else if(tmp=='C') {
				cnt[1]+=1;
			}else if(tmp=='G') {
				cnt[2]+=1;
			}else if(tmp=='T'){
				cnt[3]+=1;
			}else {
				break;
			}
			if(cnt[0]>=condition[0]&&cnt[1]>=condition[1]&&cnt[2]>=condition[2]&&cnt[3]>=condition[3]) answer++;
		}
		
		for(int i=p; i<s; i++) {
			int j = i-p;
			char minus = dna.charAt(j);
			char plus = dna.charAt(i);
			if(minus=='A') cnt[0]-=1;
			if(minus=='C') cnt[1]-=1;
			if(minus=='G') cnt[2]-=1;
			if(minus=='T') cnt[3]-=1;

			if(plus=='A') cnt[0]+=1;
			if(plus=='C') cnt[1]+=1;
			if(plus=='G') cnt[2]+=1;
			if(plus=='T') cnt[3]+=1;
			
			if(cnt[0]>=condition[0]&&cnt[1]>=condition[1]&&cnt[2]>=condition[2]&&cnt[3]>=condition[3]) answer++;			
		}
		
		
		System.out.println(answer);
	}
}
