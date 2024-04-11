package 经典算法;
import java.util.Scanner;
public class __浮点二分 {//浮点二分模板题
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		double num[]=new double[n];
		for (int i = 0; i <n; i++) {
			num[i]=scan.nextDouble();
		}
		double l=0,r=1e9;
		while((r-l)>1e-2) {
		double	mid=(l+r)/2;
			if(check(num,mid,k)) 
			r=mid;
			else l=mid;
		}
		System.out.println(l);
		scan.close();
	}
	public static boolean check(double a[],double mid,int k) {
		int res=0;
		for(double x:a) {
			res+=(int)(x/mid);
		}
		return res<k;//这里一定要写小于，原因不明2024.4.9
	}
}
