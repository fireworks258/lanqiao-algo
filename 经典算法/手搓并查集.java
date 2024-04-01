package 经典算法;
import java.util.*;
public class 手搓并查集 {
	public static class bcj{
		static int num[];
		public bcj(int n) {//参数是并查集的大小
			// TODO 自动生成的构造函数存根
		 num=new int[n+1];
		 for (int i = 1; i <=n; i++) {
			num[i]=i;//初始化 所有的节点祖先指向自身
		}
		}
		
	public int find(int a) {
		if (num[a]==a) return a;
		else {
			num[a]=find(num[a]);//路径压缩,find函数的参数一定要填数组的值，一层一层找上去，否则无限循环
			return num[a];
		}
	}
	public void add(int a,int b) {//链接节点
		int a_value=find(a);
		int b_value=find(b);
		num[a_value]=b_value;//次序不重要
	}
	public int sumnode() {
		int ans=0;
		for (int i = 1; i < num.length; i++) {
			if(num[i]==i) ans++;
		}
		return ans;
	}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	bcj a=new bcj(scan.nextInt()*scan.nextInt());
	int N=scan.nextInt();
	for (int i = 0; i < N; i++) {
		a.add(scan.nextInt(), scan.nextInt());
	}
	System.out.println(a.sumnode());
	scan.close();
}
}
