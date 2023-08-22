package StudyWithMe;
import java.io.*;
public class q2018 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 1;//자기 자신을 미리 카운트 해줌
		for(int i=1; i<=n/2; i++) {
			int sum = 0;
			for(int j=i; j<=(n/2)+1; j++) {
				sum += j;
				if(sum==n) {
					answer++;
					break;
				}else if(sum>n) {
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
