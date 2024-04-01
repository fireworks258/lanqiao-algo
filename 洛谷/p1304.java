package 洛谷;
import java.util.Scanner;
public class p1304 {
	public static Boolean check(int N) {
		for (int i = 2; i*i<= N; i++) {
			if(N%i==0) return false;
		}
		return true;
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int N=in.nextInt();
	for (int i = 4; i <=N; i=i+2) {
		for (int j = 2; j < i; j++) {
			if(check(j)&&check(i-j)) {
				System.out.println(i+"="+j+"+"+(i-j));
				break;
			}
		}
	}
}
}
