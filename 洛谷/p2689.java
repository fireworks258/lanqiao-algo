package 洛谷;

import java.util.Scanner;
public class p2689 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int x1=in.nextInt();
	int y1=in.nextInt();
	int x2=in.nextInt();
	int y2=in.nextInt();
	int n=in.nextInt();
	int ans=0;
	String s="";
	for (int i = 0; i < n; i++) {
		s+=in.next();
	}
	for (int i = 0; i < n; i++) {
		if(x1==x2&&y1==y2) break;
		if(s.charAt(i)=='E') {
			if(Math.abs(x2-x1-1)<Math.abs(x2-x1)) {
				x1++;
				ans++;
			}
			else
				continue;
		}
		if(s.charAt(i)=='S') {
			if(Math.abs(y2-y1+1)<Math.abs(y2-y1)) {
				y1--;
				ans++;
			}
			else
				continue;
		}
		if(s.charAt(i)=='W') {
			if(Math.abs(x2-x1+1)<Math.abs(x2-x1)) {
				x1--;
				ans++;
			}
			else
				continue;
		}
		if(s.charAt(i)=='N') {
			if(Math.abs(y2-y1-1)<Math.abs(y2-y1)) {
				y1++;
				ans++;
			}
			else
				continue;
		}
	}
	if(y2!=y1||x2!=x1) ans=-1;
	System.out.println(ans);
	in.close();
}
}
