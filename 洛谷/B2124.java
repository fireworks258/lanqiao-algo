package 洛谷;

import java.util.Scanner;

public class B2124 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	char[] s=scan.nextLine().toCharArray();
	scan.close();
	for (int i = 0; i <(s.length)/2; i++) {
		if(s[i]!=s[s.length-i-1]) {
			System.out.println("no");
			return;
		}
	}
	System.out.println("yes");
	
}
}
