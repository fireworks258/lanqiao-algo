package 蓝桥;
import java.util.Arrays;
import java.util.Scanner;
public class lanqiao3532 {//https://www.lanqiao.cn/problems/3532/learning/
	public class num{
	int value=0;
	int key=0;
	public num(int i, int j) {
		// TODO 自动生成的构造函数存根
		value=i;
		key=j;
	}
}
	public static void main(String[] args) {
		int c=0,d=0;
		long ans=0;
        Scanner scan = new Scanner(System.in);
        lanqiao3532 it = new lanqiao3532();
        int n=scan.nextInt();
        int x=n/10;//每个数出现次数
        num[] a=new num[n];
        int[] b=new int[10];
        for (int i = 0; i < n; i++) {
        	c=scan.nextInt();
        	d=scan.nextInt();
			a[i]=it.new num(c,d);
			b[c]++;
		}
        Arrays.sort(a,(num p1,num p2)->{
        	if(p1.key>p2.key) {
        		return 1;
        	}
        	else
        		return 0;
        });
        for (int i = 0; i < n-1; i++) {
			if(b[a[i].value]>x) {
				ans+=a[i].key;
				b[a[i].value]--;
			}
		}
        System.out.println(ans);
        scan.close();
    }
}
