package 洛谷;
import java.util.Scanner;
public class p1157组合输出 {//组合输出
static void backtrack(int k,int r,int n,int a[]) {
	if(k>r) {
		for (int i = 1; i <= r; i++) {
			System.out.print("  "+a[i]);
		}
		System.out.println();
		return;
	}
	for (int i = a[k-1]+1; i <= n; i++) {
		a[k]=i;
		backtrack(k+1,r,n,a);
	}
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int r=scan.nextInt();
	int a[] = new int[100];
	backtrack(1,r,n,a);
	scan.close();
}
}
