package 经典算法;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class 跳台阶 {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     //在此输入您的代码..
     int n=scan.nextInt();
     int num[]=new int[3];
     int dp[]=new int[n+1];
     for (int i = 0; i < 3; i++) {
		num[i]=scan.nextInt();
		dp[num[i]]=1;
	}
     for (int i = 1; i <= n; i++) {
		for (int j = 0; j <=2; j++) {
			if(i-num[j]>=0) dp[i]=(dp[i]+dp[i-num[j]])%1000000007;
		}
	}
     System.out.println(dp[n]%1000000007);
     scan.close();
 }
}