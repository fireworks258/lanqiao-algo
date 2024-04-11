package 洛谷;
import java.util.Scanner;
/*
 * void dfs(int deep) { // 搜索深度/状态变量作为参数
	if (符合某种要求||已经不能在搜了) { // 终止
		做一些操作；
		return;
	}
	if (符合某种条件且有地方可以继续搜索的) { //这里可能会有多种条件，可能要循环或者多写几个if什么的
		a[x][y]='x';// 状态转移
	    dfs(deep+1,sum+1);// 递归调用，搜索下一层
		a[x][y]='.';// 状态还原
	}
}
 * */
public class b3625迷宫深搜dfs {
	static char s[][];
	static int visit[][];
	static int n,m;
	static boolean flag;
	static int next[][];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		s=new char[n+1][m+1];
		for (int i = 1; i <=n; i++) {
			s[i]=('0'+scan.next()).toCharArray();
		}
		next=new int[][] {{1,0},{0,1},{0,1},{-1,0}};
		flag=false;
		visit=new int[n+1][m+1];
		dfs(1, 1);
		if(flag) System.out.println("Yes");
		else  System.out.println("No");
		scan.close();
	}
	public static void dfs(int n1,int m1) {
		if(n1==n&&m1==m) {
			flag=true;
			return;//出口
		}
		for (int i = 0; i <4; i++) {
			int n2=n1+next[i][0];
			int m2=m1+next[i][1];
			if(!(n2>=1&&m2>=1&&n2<=n&&m2<=m&&s[n2][m2]!='#'&&visit[n2][m2]==0)){//边界条件与限制
				continue;
		}
			visit[n2][m2]=1;
			dfs(n2, m2);
			visit[n2][m2]=0;
	}
}
}
