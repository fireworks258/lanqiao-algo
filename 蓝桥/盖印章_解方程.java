package 蓝桥;

import java.util.Scanner;
public class 盖印章_解方程 {//2024.4.7出题人就是个傻逼,我操你妈
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
	int k=scan.nextInt();
	int sum=0;
	String z;//读入的01串是字符串类型
	for (int i = 0; i <n; i++) {
		z=scan.next();
		for (int j = 0; j <m; j++) {
			if (z.charAt(j)=='1') {//2024.4.8出题人不是傻逼,我是傻逼
				sum++;
			}
		}	
	}
	System.out.print((sum-2*k)+" "+(3*k-sum));
	scan.close();
}
}
