package StudyWithMe;
import java.util.*;
import java.io.*;
public class q1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		List<String> ls = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			ls.add(String.valueOf(s.charAt(i)));
		}
		Collections.sort(ls, Collections.reverseOrder());
		String answer = "";
		for(int i=0; i<ls.size(); i++) {
			answer+=ls.get(i);
		}
		System.out.println(answer);
	}
}
