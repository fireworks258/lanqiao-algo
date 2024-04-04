package 蓝桥;

import java.util.Scanner;

public class lanqiao7935求余 {//快速幂取余
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=2;
		int n=2023;
		System.out.println(ksm(m, n));
		scan.close();
	}
	public static int ksm(int m,int n) {
		int ans=1;
		while(n!=0) {
			if((n&1)==1) {
				ans=(m*ans)%1000;
			}
			m=(m*m)%1000;
			n=n>>1;
		}
		return ans;
	}
}
