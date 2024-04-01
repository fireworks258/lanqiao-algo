package 洛谷;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改
public class lanqiao3518 {
	public static int findmaxn(int x ,int y ,int z,int sort[],int num[]){//贪心
		int max=0;int n=0;
		int a=0,b=0,c=0,t=0;
		for (int i = 0; i < sort.length; i++) {
			if(sort[max]>sort[i]) {
				max=i;
			}
		}
		a+=num[3*(max)+x];b+=num[3*(max)+y];c+=num[3*(max)+z];
		sort[max]=Integer.MAX_VALUE;
		while(a>b+c){
			n++;
			if(n>3)return -1;
			for (int i = 0; i < sort.length; i++) {
				if(sort[max]>sort[i]) {
					max=i;
				}
			}
			a+=num[3*(max)+x];b+=num[3*(max)+y];c+=num[3*(max)+z];
			sort[max]=Integer.MAX_VALUE;
		}
		return n;
	}
 public static void main(String[] args) {
     //Scanner scan = new Scanner(System.in);
     //在此输入您的代码...
     int n=3;//scan.nextInt();
     int n1=n,n2=n,n3=n;
     int sort1[]=new int[n];
     int sort2[]=new int[n];
     int sort3[]=new int[n];
     int num[]=new int[] {1 ,2 ,2,2 ,3, 2,1, 0, 7};
     for (int i = 0; i < num.length; i++) {
		//num[i]=scan.nextInt();
		if((i+1)%3==0) {
			sort1[((i+1)/3)-1]=num[i-1]+num[i]-num[i-2];
			sort2[((i+1)/3)-1]=num[i-2]+num[i]-num[i-1];
			sort3[((i+1)/3)-1]=num[i-1]+num[i-2]-num[i];
		}
	}
     n1=findmaxn(0, 1, 2, sort1,num);
     n2=findmaxn(1, 0, 2, sort2,num);
     n3=findmaxn(2, 1, 0, sort3,num);
     System.out.println(n1);
     System.out.println(n2);
     System.out.println(n3);
     System.out.println(Math.max(Math.max(n1, n2),n3));
     //scan.close();
 }
}