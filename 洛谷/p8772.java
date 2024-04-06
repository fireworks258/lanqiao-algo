package 洛谷;

import java.util.Scanner;

public class p8772 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	long ans=0;
	long sum[]=new long[n+1];
	for (int i = 0; i <n; i++) {
		a[i]=scan.nextInt();//读入原数组
	}
	for (int i = 1; i <=n; i++) {//初始化前缀和数组
		sum[i]=sum[i-1]+a[i-1];
	}
	for (int i = 0; i <n; i++) {
		ans+=(a[i]*(sum[n]-sum[i+1]));
	}
	System.out.println(ans);
	scan.close();
}
}
