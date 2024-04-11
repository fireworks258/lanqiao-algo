package 洛谷;

import java.util.Scanner;

public class p8647 {
	static int ch[][];
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	ch=new int[n][2];
	int max=Integer.MIN_VALUE;
	for (int i = 0; i <n; i++) { 
		max=(ch[i][0]=scan.nextInt())>max?ch[i][0]:max;
		max=(ch[i][1]=scan.nextInt())>max?ch[i][1]:max;
	}
	int a[]=new int[max+1];
	for (int i = 1; i <=max; i++) {
		a[i]=i;
	}
	System.out.println(coms(a, k));
	scan.close();
}
public static int coms(int a[],int k) {//二分搜素
	int left=0,right=a.length-1;
	while(left<right) {
		int mid=(left+right+1)>>1;
		if(kuai(a[mid])>=k) left=mid;
		else right=mid-1;	
	}
	return left;
}
public static int kuai(int x) {//分得块数
	int sum=0;
	for (int i = 0; i <ch.length; i++) {
		sum+=((ch[i][0]/x)*(ch[i][1]/x));
	}
	return sum;
}
}
