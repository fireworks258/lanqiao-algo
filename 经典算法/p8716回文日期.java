package 经典算法;

import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class p8716回文日期 {
	static int a[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
   
   int n=in.nextInt();
   int f=0;
   for(int i=n+1;;i++) {
  	 if(!check(i)) {
  		 continue;
  	 }
  	 if(f==0&&check2(i)) {
  		 System.out.println(i);
  		 f++;
  	 }
  	 if(f==1&&check3(i)) {
  		 System.out.println(i);
  		 break;
  	 }
  	 
   }
   
   in.close();
}
static boolean  check (int x) {//符合回文数条件
	 int y=0;
	 int num=x;
	 while(num!=0)
		{
			y=y*10+num%10;
			num/=10;
		}
		if(x==y)
			return true;
		else
			return false;
}
static boolean check2(int x) {//符合日期条件
	 int month=x/100%100;//月份。
		int day=x%100;//日期。
		if(month>=1&&month<=12&&day>=1&&day<=a[month])
		{
			return true;
		}
		return false;
}
static boolean check3(int x) {//符合abab
	 int n1=x/1000000,n2=x/10000%100;
		if(n1%10!=n1/10&&n1==n2)
		{
			return true;
		}
		return false;
}
}