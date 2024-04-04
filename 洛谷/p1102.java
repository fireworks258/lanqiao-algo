package 洛谷;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class p1102 {
static int num[];
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int target=scan.nextInt();
	long ans=0;
	num=new int[n];
	Map<Integer, Integer> flag=new HashMap<>();
	for (int i = 0; i < n; i++) {
		if(flag.containsKey(num[i]=scan.nextInt())) {
			flag.replace(num[i], flag.get(num[i])+1);
		}
		else {
			flag.put(num[i], 1);
		}
		
	}
	for (int i = 0; i < n; i++) {
		if(flag.containsKey(num[i]-target)) {
			ans=ans+flag.get(num[i]-target);
		}
	}
	System.out.println(ans);
	scan.close();
}
}
