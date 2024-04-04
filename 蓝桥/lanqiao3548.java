package 蓝桥;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class lanqiao3548{//迪杰斯特拉加DP未通过，放弃
	static int[] ans;//答案，共有n个
	static List<Integer>[] graph;
	static int[] thisanser;
	static int min;
	static int sum;
	static int weight[][];
	static Set<Integer> set;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		int u=0,v=0,c=0;//输入，点1，点2，权值
		ans=new int[n+1];
		graph=new ArrayList[n+1];
		weight =new int[n+1][n+1];//储存权值
		for (int i = 0; i <=n; i++) {
			graph[i]=new ArrayList<>();//初始化邻接表
		}
		for (int i = 0; i < m; i++) {//存图
			v=scan.nextInt();
			u=scan.nextInt();
			c=scan.nextInt();
			graph[u].add(v);
			graph[v].add(u);//无向图储存两次
			weight[v][u]=c;
			weight[u][v]=c;
		}
	}
}