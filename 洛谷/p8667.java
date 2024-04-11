package 洛谷;

import java.util.Arrays;
import java.util.Scanner;
public class p8667 {
public static void main(String[] args) {//
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int[] a=new int[n+1];
	int[] b=new int[n+1];
	int[] c=new int[n+2];
	long ans=0;
	for (int i = 1; i <=n; i++) {
		a[i]=scan.nextInt();
	}
	for (int i = 1; i <=n; i++) {
		b[i]=scan.nextInt();
	}
	for (int i = 1; i <=n; i++) {
	c[i]=scan.nextInt();
	}
	c[n+1]=Integer.MAX_VALUE;
	Arrays.sort(a);
	Arrays.sort(b);
	Arrays.sort(c);//且条件，可相乘求结果
	for (int i = 1; i <= n; i++) {//枚举bi，满足条件ai<bi且bi<ci
		int al=coms_a(a, b[i]);
		int cr=n+1-coms_c(c, b[i]);
		ans+=al*cr;
	}
	System.out.println(ans);
	scan.close();
}
public static int coms_a(int a[],int k) {
	int left=0,right=a.length-1;
	while(left<right) {
		int mid=(left+right+1)>>1;
		if(a[mid]<k) left=mid;
		else right=mid-1;
	}
	return left;
}
public static int coms_c(int a[],int k) {
	int left=0,right=a.length-1;
	while(left<right) {
		int mid=(left+right)>>1;
		if(a[mid]>k) right=mid;
		else left=mid+1;
	}
	return left;
}

}
