package 洛谷;

import java.util.Scanner;

public class p1003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int t1,t2;
		int [][] tan = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <4; j++) {
				tan[i][j]=in.nextInt();
			}
		}
		
		int x=in.nextInt(),y=in.nextInt();
		for (int i = n-1; i>=0; i--) {
			t1=x-tan[i][0];
			t2=y-tan[i][1];
			if(t1>=0&&t2>=0&&t1<=tan[i][2]&&t2<=tan[i][3]) {
				System.out.println(i+1);
				break;
			}
			if(i==0)
				System.out.println(-1);
		}
	}

}
