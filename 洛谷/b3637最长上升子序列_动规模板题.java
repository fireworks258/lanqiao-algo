package 洛谷;

import java.util.Scanner;

public class b3637最长上升子序列_动规模板题 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int [] num=new int[n];
	for (int i = 0; i <n; i++) {
		num[i]=scan.nextInt();
	}
	int dp[]=new int[n];
	int max=1;
	dp[0]=1;//赋初值
	for (int i = 0; i <n; i++) {
		dp[i]=1;//每轮循环赋初值
		for (int j = 0; j <i; j++) {
			if(num[i]>num[j]) {
				dp[i]=Math.max(dp[i], dp[j]+1);
			}
			max=Math.max(dp[i], max);
		}
	}
	System.out.println(max);
	scan.close();
}
}
