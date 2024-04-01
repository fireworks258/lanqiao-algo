package 经典算法;//p1706/b3623
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//题干：输入一个整数N，输出从1到N的全排列
public class 全排列dfs_p1706 {//dfs怎么写,有边界条件（N），有递归出口，记录是否访问（v）,for循环，递归后进行回退
	static List<List<Integer>> ans=new ArrayList<>();//存储所有排列
    public static void main(String[] args) {//n<=9爆搜可通过
	int N=0;
	Scanner scan = new Scanner(System.in);
	N=scan.nextInt();
	int v[]=new int[N+1];//标记数组
	List<Integer> t=new ArrayList<>();
	dfs(N, v, t);
	for (int i = 0; i < ans.size(); i++) {//将答案输出，存储格式为list集合嵌套list集合，所以进行两重循环
		for (int j = 0; j < ans.get(i).size(); j++) {
			System.out.print("    "+ans.get(i).get(j));
		}
		System.out.println();
	}
	scan.close();
}
    public static void dfs(int N,int v[],List<Integer>t) {
		if(t.size()==N) {
			ans.add(new ArrayList<>(t));//符合条件，加入答案
			return;//递归出口，return后进行回退操作
		}
		for (int i = 1; i <=N; i++) {//for循环执行完，程序退出
			if(v[i]==1)continue;
			v[i]=1;//标记已访问，下一次搜索不选取
			t.add(i);//将当前数加入t
			dfs(N, v, t);//dfs前后操作相反
			t.remove(t.size()-1);//删除t最后一位,减一是因为下标从0开始
			v[i]=0;//由于for循环一直向前，不会回退，可以将visit改成0
		}
	}
}