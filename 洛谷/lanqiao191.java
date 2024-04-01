package 洛谷;
import java.util.*;
public class lanqiao191 {
public static void main(String[] args) {
	Scanner sacn = new Scanner(System.in);
	int n=sacn.nextInt();
	int num=0,ans=0,partofans=0;
	for (int i = 1; i <=n; i++) {
		partofans=i;
		while(partofans!=0) {
			num=partofans%10;
			if(num==2||num==0||num==1||num==9) {
				ans+=i;
				break;
			}
			partofans/=10;
		}
	}
	System.out.println(ans);
	sacn.close();
}
}
