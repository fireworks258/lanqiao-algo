package 洛谷;

import java.util.Scanner;

public class p8753 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double n=scan.nextInt();//一定要用double
	int ans=0;
	for (int i = 1; i < n; i++) {
		if((i*i)%n<n/2) {
			ans++;
		}
	}
	System.out.println(ans);
	scan.close();
}
}
