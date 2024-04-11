package 洛谷;

import java.util.Scanner;
public class p1451并查集 {
static int bcj[];
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
	char [][] num=new char[n+1][m+1];
	for (int i = 0; i <n; i++) {
		num[i]=(scan.next()+'0').toCharArray();
	}
	bcj=new int[m*n+1];
	for (int i = 0; i <=m*n; i++) {
		bcj[i]=i;//初始化指向自身
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if(!(num[i][j]>='1'&&num[i][j]<='9')) {
				continue;
			}
			if(num[i][j+1]>='1'&&num[i][j+1]<='9') {//右
				add(i*m+j+1, i*m+j+2);
			}
			if(num[i+1][j]>='1'&&num[i+1][j+1]<='9') {//下
				add(i*m+j+1, (i+1)*m+j+1);
			}
		}
	}
	int ans=0;
	for (int i = 1; i <m*n+1; i++) {
		if(bcj[i]==i&&num[(i-1)/m][(i-1)%m]!='0') {
			ans++;
		}
	}
	System.out.println(ans);
	scan.close();
}
	public static int find(int x) {//查找祖先
		if(bcj[x]==x) {
			return x;
		}
		else {
			bcj[x]=find(bcj[x]);//路径压缩
			return bcj[x];
		}
	}
	public static void add(int a,int b) {//合并节点
		bcj[find(a)]=find(b);
	}
}
