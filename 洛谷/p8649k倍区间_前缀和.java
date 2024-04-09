package 洛谷;

import java.util.Scanner;
public class p8649k倍区间_前缀和 {//没搞明白，有待研究
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n=scan.nextInt();
//		int a[]=new int[n];
//		int k=scan.nextInt();
//		int ans=0;
//		int value[]=new int[100005];
//		int sum[]=new int[n+1];//前缀和数组,大小比原数组大一位,用lang存储
//		for (int i = 0; i <n; i++) {//读入数据
//			a[i]=scan.nextInt();
//		}
//		for (int i = 1; i <=n; i++) {//计算前缀和
//			sum[i]=sum[i-1]+a[i-1];
//		}
///*-----------暴力解法，超时---------------------------------*/
////		for (int i = 1; i <=n; i++) {//i为区间长度
////			for (int j = i; j <=n; j++) {//j为右端点
////				if((sum[j]-sum[j-i])%k==0) {
////					ans++;
////				}
////			}
////		}
///*----------使用同余定理 a%n=x且b%n=x可推得(a-b)%n=0----*/
//		for (int i = 0; i <=n; i++) {
//			 ans+=value[(sum[i]%k)]++;//这里发生错误，++运算符最后执行，加到ans上时，哈希数组在索引0处的值还是0
//		}                             //所以要先将sum[0]设为1！！！！！！
//		System.out.println(ans);      //2024.4.8理论没有错，代码逻辑混淆
//		scan.close();
//	}
	public static void main(String[] args) {//正解
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	int f[]=new int[k];
	f[0]=1;
	long sum=0,ans=0;
	for (int i = 0; i <n; i++) {
		sum+=scan.nextLong();
		ans+=f[(int)(sum%k)];
		f[(int)(sum%k)]++;
	}
	System.out.println(ans);
	scan.close();
	}
}
