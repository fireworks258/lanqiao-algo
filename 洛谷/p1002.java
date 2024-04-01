package 洛谷;//过河卒

import java.util.Scanner;
public class p1002 {
static int M1,M2,B1,B2;
	public static void main(String[] args) {
		int fx[]=new int[] {0, -2, -1, 1, 2, 2, 1, -1, -2};
		int fy[]=new int[] {0, 1, 2, 2, 1, -1, -2, -2, -1};
		Scanner in=new Scanner(System.in);//输入部分b1,b1表示终点；m1,m2表示马的位置
			B1=in.nextInt();//棋子从0，0出发，只能向右或向下移动
			B2=in.nextInt();//设f（x，y）为走到x,y的路径条数，易得f(x，y)=f(x-1,y)+f(x,y-1)
			M1=in.nextInt();//为了方便计算，把所有坐标+2
			M2=in.nextInt();//为了让f(2,2)=1,使f(2,1)或f(1，2)=1
			B1+=2;B2+=2;M1+=2;M2+=2;
		long dp[][]=new long[B1+1][B2+1];//定义动态规划数组
		dp[2][1]=1;//初始化
		int s[][]=new int[40][40];
		for (int i = 0; i <= 8; i++) {
			s[M1+fx[i]][M2+fy[i]]=1;
		}
		for (int i= 2;  i<=B1; i++) {
			for (int j = 2; j <= B2; j++) {
				if(s[i][j]==1) {continue;}
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		System.out.println(dp[B1][B2]);
		in.close();
	}
	
}
