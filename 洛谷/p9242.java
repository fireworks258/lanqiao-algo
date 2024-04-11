package 洛谷;

import java.util.Arrays;
import java.util.Scanner;
/*只要找到最长接龙序列，就可得出
 * 状态表示：f[i][i]i表示以第i个数结尾，尾数为j（j1to10）
 * 2024.4.11本人打算两天搞懂dp，大败而归
 * */
public class p9242 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	String num[]=new String[n];
	for (int i = 0; i <n; i++) {
		num[i]=scan.next();
	}
	int/*[]*/[] dp=new int/*[n]*/[10];
	for (int i = 0; i < n; i++) {
		int head=num[i].charAt(0)-'0';//利用ascii码减0字符转化数字
		int tail=num[i].charAt(num[i].length()-1)-'0';//尾数
			dp/*[i]*/[tail]=Math.max(dp/*[i-1]*/[tail],dp/*[i-1]*/[head]+1);//利用滚动数组优化
	}		//          取最大    若丢弃         若选取
	//System.out.println(Arrays.toString(dp));
	Arrays.sort(dp);
	//System.out.println(Arrays.toString(dp));
	System.out.println(n-dp[9]);
	scan.close();
}
}
