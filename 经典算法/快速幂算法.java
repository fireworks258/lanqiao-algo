package 经典算法;

import java.util.Scanner;
public class 快速幂算法 {
 static long qmi(long a,long b){
	    long res = 1;
	    while(b>0){
	      if((b&1)>0){
	        res = (res*a);
	      }
	      a = (a*a);
	      b>>=1;
	    }
	    return res;
	}
	/*利用对幂次做加法分解，再相乘,得到o(long(n))的求幂算法*/
	public static int ksm(int a,int n) {//快速幂算法，参数表示a^n
		int ans=1;
		while(n>0) {
			if ((n&1)==1) {//若此时的n转化为二进制后末尾为1
				ans*=a;//数据过大时，可在此处取模
			}
			a*=a;//数据过大时，可在此处取模
			n>>=1;//转化为二进制后右移一位
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();int b=in.nextInt();
		System.out.println(ksm(a, b));
	}
}
