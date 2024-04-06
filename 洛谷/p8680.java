package 洛谷;
import java.util.Scanner;
public class p8680 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	long ans=0;
	int num;
	for (int i = 1; i <=n; i++) {
		num=i;
		while(num!=0) {
			if(num%10==2||num%10==0||num%10==1||num%10==9) {
				ans+=i;
				break;
			}
			num/=10;
		}
	}
	System.out.println(ans);
	scan.close();
}
}
