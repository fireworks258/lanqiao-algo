package 洛谷;
import java.util.*;
public class lanqiao110 {
	static int num[];
	public static int find(int x) {
		if(num[x]!=x) num[x]=find(num[x]);
		return num[x];
	}
	public static void connect(int a,int b) {
		int roota=find(a);
		int rootb=find(b);
		if(roota!=rootb) {
			num[rootb]=roota;
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int m=scan.nextInt();
	int n=scan.nextInt();
	num=new int[m*n+1];
	for (int i = 0; i < m*n+1; i++) {
		num[i]=i;
	}
	int k=scan.nextInt();
	int a=0,b=0;
	for (int i = 0; i < k; i++) {
		a=scan.nextInt();
		b=scan.nextInt();
		connect(a,b);
	}
	int ans=0;
	for (int i = 1; i < m*n+1; i++) {
		if(num[i]==i) ans++;
	}
	System.out.println(ans);
	scan.close();
}
}
