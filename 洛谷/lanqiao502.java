package 洛谷;

import java.util.Scanner;
public class lanqiao502 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N=scan.nextInt();
	float n=0,sum=0,max=0,min=Integer.MAX_VALUE;
	for (int i = 0; i < N; i++) {
		n=scan.nextInt();
		sum+=n;
		max=n>max?n:max;
		min=n<min?n:min;
	 }
	float a=Math.round(sum/N*100);
	System.out.println((int)max);
	System.out.println((int)min);
	System.out.printf("%.2f",a/100);
	scan.close();
	}
}
