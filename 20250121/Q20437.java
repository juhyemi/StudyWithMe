package com.solve;
import java.util.*;
import java.io.*;
public class Q20437 {
	static int a, b, k;
	static String s;
	static int[] cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int t=0; t<test; t++) {
			a=Integer.MAX_VALUE;b=-1;
			s = br.readLine();
			k = Integer.parseInt(br.readLine());
			if(k==1) {
				sb.append("1 1").append("\n");
				continue;
			}
			cnt = new int[26];
			for(int i=0; i<s.length(); i++) cnt[s.charAt(i)-'a']++;
			for(int i=0; i<s.length(); i++) {
				if(cnt[s.charAt(i)-'a']<k) continue;
				CHK(i,1);
			}
			if(a==Integer.MAX_VALUE||b==-1) sb.append(-1).append("\n");
			else sb.append(a+" "+b).append("\n");
		}
		System.out.print(sb);
	}
	static void CHK(int start,int count) {
		for(int i=start+1; i<s.length(); i++) {
			if(s.charAt(start)==s.charAt(i)) count++;
			if(count==k) {
				a = Math.min(a, i-start+1);
				b = Math.max(b, i-start+1);
				return;
			}
		}
	}

}