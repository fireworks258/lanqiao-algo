package 蓝桥;
import java.util.*;
//第一行包含两个整数 N,K 
//以下 N 行每行包含两个整数 Hi,Wi
public class lanqiao99分巧克力 {
	public static int findfirst(qiaokeli[] arr,int key,int MAX) {
		int left=0,right=MAX;
		int mid=(right+left)/2;
		while(left<right) {
			mid=(right+left+1)>>1;
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			sum+=((arr[j].H/mid)*(arr[j].W/mid));
		}
			if(sum>=key) {
				left=mid;
			}
			else {
				right=mid-1;
			}
		}
		return left;
	}
	public static class qiaokeli{
			int H=0;
			int W=0;
			public qiaokeli(int h,int w) {
				H=h;
				W=w;
			}
		}
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int MAX=0,ans=1;
		qiaokeli[] num=new qiaokeli[N];
		for (int i = 0; i < N; i++) {
			num[i]=new qiaokeli(in.nextInt(), in.nextInt());
			MAX=Math.max(num[i].H, num[i].W)>MAX?Math.max(num[i].H, num[i].W):MAX;//找到搜索上界
		}
		/*for (int i = 1; i < MAX; i++) {//暴力解法（过一个点）
			int sum=0;
			for (int j = 0; j < N; j++) {
				if(num[j].H>=i&&num[j].W>=i) {
				sum+=(num[j].H/i+num[j].W/i);
				}
				else continue;
			}
			if(sum<K) break;
			else ans=i;
		}
		*/
		//使用二分(放弃重写API，麻烦)
		ans=findfirst(num, K, MAX);
		System.out.println(ans);
		in.close();
	}
}