package 洛谷;

import java.util.Scanner;
public class b3612 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n+1];
	for (int i = 1; i <=n; i++) {
		a[i]=scan.nextInt()+a[i-1];
	}
	int m=scan.nextInt();
	for (int i = 0; i <m; i++) {
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(a[y]-a[x-1]);
	}
	scan.close();
}
}



