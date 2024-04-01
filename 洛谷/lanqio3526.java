package 洛谷;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改
//对于结点i,本题如果能找到i的最左孩子和最右孩子的下标,便可以迎刃而解
//对于第i个结点,其前面有i-1个结点,每个结点各有m个孩子,再加上1号结点
//可得第i个结点的最左孩子下标为(i-1)*m+2
//同理可得第i个结点的最右孩子下标为i*m+1(前i个结点各有m个孩子,再加上1号结点)
//故对于子树根结点,只需逐层累加最右孩子-最左孩子即可 
//只需要处理最后一层的特殊情况:
//1、最左孩子下标超出n,说明子树在最后一层没有结点,直接退出
//2、最右孩子下标超出n,说明子树在最后一层的结点是非满的,将最右孩子下标改为n,累加后退出
//有1e5组询问,对于每组询问,可在近似logm n的时间复杂度内得出结果,不会超时 
public class  lanqio3526{//https://www.lanqiao.cn/problems/3526/learning/
	public static long solve(long n,long m,long k) {
		long l_child=k,r_child=k,node=1;
		int f=0;
		while(true) {
			l_child=((l_child-1)*m)+2;
			r_child=(r_child*m)+1;
			if(l_child>n) {
				return node;
			}
			if(r_child>n) {
				f=1;
				r_child=n;
			}
			node+=r_child-l_child+1;
			if(f==1)
				break;
		}
		return node;
	}
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int t=scan.nextInt(); 
     long n[]=new long[t];long[] m=new long[t];long k[] =new long[t];
     for (int i = 0; i < t; i++) {
		n[i]=scan.nextLong();
		m[i]=scan.nextLong();
		k[i]=scan.nextLong();
	}
     for (int i = 0; i < t; i++) {
		System.out.println(solve(n[i], m[i], k[i]));
	}
     //在此输入您的代码...
     scan.close();
 }
}