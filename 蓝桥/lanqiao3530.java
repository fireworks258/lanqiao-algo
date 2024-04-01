package 蓝桥;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class lanqiao3530 {//https://www.lanqiao.cn/problems/3530/learning/
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     //在此输入您的代码...
     int n=scan.nextInt();
     int m=scan.nextInt();
     int num[]=new int[n];
     for (int i = 0; i < n; i++) {
		num[i]=scan.nextInt();
	}
     scan.close();
 }
}