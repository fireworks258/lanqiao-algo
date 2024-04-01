package 经典算法;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
/*哈希集合hashset
 * 用邻接表存储答案
 * 要过所有的点需要使用快速读入/快读，蓝桥杯暂时用不到，先挖个坑
 * 本体不要储存答案再输出，会爆内存
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class p4305不重复数字 {//解法是哈希去重，重点在于快速读取
//Scanner scan=new Scanner(System.in);
/*-----第一种错误解法，爆内存-----------------------------*/
//	int n=scan.nextInt();
//	int N;
//	Set<Integer> ans[]=new HashSet[n];
//	for (int i = 0; i < n; i++) {//不能这么写，哈希集合内部结构复杂，元素顺序不明，而题干需要
//		ans[i]=new HashSet<>();//按第一次出现位置输出
//	}
//	for (int i = 0; i < n; i++) {
//		N=scan.nextInt();
//		for (int j = 0; j < N; j++) {
//			ans[i].add(scan.nextInt());
//		}
//	}
//	for (int i = 0; i < n; i++) {
//		for (int j :ans[i]) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
		
		
/*--------第二种错误解法，爆内存------------------------*/		
		
		
//		int n=scan.nextInt();
//		int k;//每次输入元素个数
//		int num;
//		List<List<Integer>> ans=new ArrayList<>();
//	for (int i = 0; i < n; i++) {
//		k=scan.nextInt();
//		ans.add(new ArrayList<>());
//		Set<Integer> hset=new HashSet<>();
//		for (int j = 0; j < k; j++) {
//			num=scan.nextInt();
//			if(hset.contains(num)) continue;
//				ans.get(i).add(num);
//				hset.add(num);
//		}
//	}
//	for (int i = 0; i < n; i++) {
//	for(int j:ans.get(i)) {
//		System.out.print(j+" ");
//		}
//	System.out.println();
//	
//}	
/*------第三种错误解法,没使用快读------------------------*/
//	int t=scan.nextInt();
//	int n;
//	int num;
//	for (int i = 0; i < t; i++) {
//		n=scan.nextInt();
//		Set<Integer> hset=new HashSet<>();
//		for (int j = 0; j < n; j++) {
//			num=scan.nextInt();
//			if(hset.contains(num)) continue;
//			hset.add(num);
//			System.out.print(num+" ");
//		}
//		System.out.println();
//	}
/*---------使用快读---------------------------------*/
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int t=(int)in.nval;
		int n;
		int num;
		for (int i = 0; i < t; i++) {
			in.nextToken();
			n=(int)in.nval;
			Set<Integer> hset=new HashSet<>();
			for (int j = 0; j < n; j++) {
				in.nextToken();
				num=(int)in.nval;
				if(hset.contains(num)) continue;
				hset.add(num);
				out.print(num+" ");
			}
			out.println();
		}
		out.close();
	//scan.close();
}
}
