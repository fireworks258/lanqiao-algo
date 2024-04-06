package 经典算法;

import java.util.Scanner;

/*在程序设计中,可能会有查询一个长度为x的数组的相连m位的和的需求
 * 每次查询时间复杂度为m，若查询n次，时间复杂度就为n*m，复杂度太高
 * 这时可以使用前缀和思想优化算法
 * 前缀和仅需一次时间复杂度为On的预处理，后续查询时间复杂度为O1
 * 本质是把每次运算结果记录在前缀和数组中，以空间换时间
 * 
 * */
public class 一维数组前缀和 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num[]=new int[] {1,2,3,4,5,6,7,8,9,10};//目标数组
	int sum[]=new int[11];
	for (int i = 0; i < 10; i++) {
		sum[i+1]=num[i]+sum[i];
	}
	System.err.println(sum[10]);
	System.err.println(sum[10]-sum[8]);
	int ans=0;
	for (int i = 0; i <num.length; i++) {
		ans+=num[i];
	}
	System.out.println(ans);
	scan.close();
}
}
