package 经典算法;

import java.util.Scanner;

public class p1025数的划分dfs剪枝 {
	static int n,k,ans=0;//整数n,分成k份，有ans种方法
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		k=scan.nextInt();
		dfs(1, 0,0);
		System.out.println(ans);
		scan.close();
	}
	public static void dfs(int start ,int sum,int count) {//参数：去重起始位，总和，数字个数
		if(count==k) {//如果数字个数达到k，判断后一定要返回，不然无限循环
		if(sum==n) {//如果相加等于n,ans+1
			ans++;
		}
		return;//一定要有递归出口！！！！递归出口一定要写对位置！！！不然就是个爆栈！！！
		}
		for (int i = start; sum+i*(k-count)<=n; i++) {//去重，保证后一个数一定大于等于前一个数+减枝
			dfs(i,sum+i,count+1);//在每次传参时加值，就不用重新初始化，随着回归同时回归
		}
	}
}
