package 洛谷;

import java.util.Arrays;
import java.util.Scanner;
public class p4414 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[]num=new int[3];
	for (int i = 0; i < 3; i++) {
		num[i]=scan.nextInt();
	}
	Arrays.sort(num);
	char s[]=scan.next().toCharArray();
	for (int i = 0; i < 3; i++) {
		System.out.print(num[s[i]-65]+" ");
	}
	scan.close();
}
}
