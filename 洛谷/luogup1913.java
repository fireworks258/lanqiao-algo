package 洛谷;
import java.util.HashMap;
import java.util.Scanner;
public class luogup1913 {
	public static Boolean land(char s[][],int i,int j,int n,int m) {
		HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
		while(true) {
			if(hash.getOrDefault(i, -1)==j) return false;
			hash.put(i, j);
			if(s[i][j]=='o') return true;
			if(s[i][j]=='u') {
				i--;
				if(i<0||j<0||i>=n||j>=n) return false;
				continue;
			}
			if(s[i][j]=='d') {
				i++;
				if(i<0||j<0||i>=n||j>=n) return false;
				continue;}
			if(s[i][j]=='l') {j--;if(i<0||j<0||i>=n||j>=n) return false;continue;}
			if(s[i][j]=='r') {j++;if(i<0||j<0||i>=n||j>=n) return false;continue;}
			if(i<0||j<0||i>=n||j>=n) return false;
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
	int ans=0;
	String st="";
	char s[][]=new char[n][m];
	for (int i = 0; i < n; i++) {
		st=scan.next();
		s[i]=st.toCharArray();
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if(land(s, i, j, n, m)) {
				ans++;
			}
		}
	}
	System.out.println(ans);
	scan.close();
}
}
