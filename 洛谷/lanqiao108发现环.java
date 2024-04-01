package 洛谷;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class lanqiao108发现环 {
static	ArrayList<Integer>[] map;//使用邻接表存图
static int[] in;
static int vis[];
 static void sortAll(){
	for (int i = 1; i < in.length; i++) {
		if(in[i]==1) {
			dfs(i);
		}
	}
}
 static void dfs(int i) {
	 vis[i]=1;
	 for(int j:map[i]) {
		 in[j]--;
		 if(in[j]==1) {
			 dfs(j);
		 }
	 }
 }
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N=scan.nextInt();
	in=new int[N+1];
	vis=new int[N+1];
	map=new ArrayList[N+1];//初始化邻接表，大小为N+1
	for (int i = 1; i <=N; i++) {
		map[i]=new ArrayList<>();//分配动态空间
	}//邻接表创建完成
	int a=0,b=0;
	for (int i = 0; i < N; i++) {
		a=scan.nextInt(); b=scan.nextInt();
		in[a]++;in[b]++;//无向图两点分别加一次入度
		map[a].add(b);map[b].add(a);
	}
	sortAll();
	ArrayList<Integer> ans=new ArrayList<>();
	for (int i = 1; i <=N; i++) {
		if(vis[i]==0) {
			ans.add(i);
		}
		
	}
	Collections.sort(ans);
	for (int i:ans) {
		System.out.print(i+" ");
	}
	scan.close();
}
}
