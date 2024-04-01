package 蓝桥;
import java.util.Scanner;

//1:无需package
//2: 类名必须Main, 不可修改
public class lanqiao3521 {///70%
	public static int sum(int num[][],int a1,int a2,int b1,int b2) {
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for (int i = a1; i<=a2; i++) {
			for (int j = b1; j <= b2; j++) {
				max=num[i][j]>max?num[i][j]:max;
				min=num[i][j]<min?num[i][j]:min;
			}
		}
		return max*min;
	}
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int ans=0;
     int n=scan.nextInt();int m=scan.nextInt();
     int a=scan.nextInt();int b=scan.nextInt();
     int num[][]=new int[n][m];
     for (int i = 0; i <n; i++) {
		for (int j = 0; j <m; j++) {
			num[i][j]=scan.nextInt();
		}
	}
     for (int i = a-1; i <n; i++) {
		for (int j = b-1; j <m; j++) {
			ans+=sum(num, i+1-a, i, j+1-b, j);
		}
	}
     System.out.println(ans%998244353);
     scan.close();
 }
}