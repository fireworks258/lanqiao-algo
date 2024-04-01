package 洛谷;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class p8604连通地道危险系数 {	
static List<Integer>[] graph;
static int ans;
static int end;
static boolean flag;
static Set<Integer> set;
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	ans=0;
	int u=0,v=0;
	int n=scan.nextInt();
	int m=scan.nextInt();
	graph=new ArrayList[n+1];
	for (int i = 0; i < n+1; i++) {
		graph[i]=new ArrayList<>();
	}
	for (int i = 0; i < m; i++) {
	u=scan.nextInt();
	v=scan.nextInt();
	graph[u].add(v);
	graph[v].add(u);
	}
	int start=scan.nextInt();
	end=scan.nextInt();
	flag=false;
	set=new HashSet<>();
	dfs(start, 0);
	if(!flag) System.out.println(-1);//图不连通，输出-1
	else
	for (int i = 1; i <graph.length; i++) {//从一开始删去节点
		if(i==start||i==end||graph[i].size()==0) continue;
		set=new HashSet<>();
		dfs(start,i);
		if(!flag) ans++;
		flag=false;
	}
	System.out.println(ans);
//	if(deans==0) System.out.println(-1);老写法，统计能走通的点，再用数学方法相减得
//	else {
//	System.out.println(n-deans-2);
//	}
	scan.close();
}
public static void dfs(int start,int i) {//参数：起始点，删除点，哈希标记集合
	if(start==end) {
		flag=true;
		return;//递归出口
	}
	for(int j:graph[start]) {
		if(j==i||set.contains(j)) continue;//该节点被删去或已经走过
		set.add(j);
		dfs(j, i);
	}
}
}
