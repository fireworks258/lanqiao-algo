package 洛谷;
import java.math.BigInteger;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class 超大幂次末尾 {//通过80%，原因未知
	//数论中的欧拉定理。
	//它指出，如果两个整数a和m互质（即它们只有公约数1），那么a^(φ(m))
	//（其中φ(m)是m的所有正因数（所有小于等于该数的因子，如3有1，3）的和）与1模m同余。
	//可推得，自然数幂次末尾最多四位一循环（有3存在）
	 public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     int N=scan.nextInt();
	     int x=0;BigInteger q;
	     int m[][]=new int[][] {
	    	 {0,0,0,0,},
	    	 {1,1,1,1,},
	    	 {6,2,4,8},
	    	 {1,3,9,7},
	    	 {6,4,4,4},
	    	 {5,5,5,5},
	    	 {6,6,6,6},
	    	 {1,7,9,3},
	    	 {6,8,4,2},
	    	 {1,9,1,9}
	    	 };
	     for (int i = 0; i < N; i++) {
	    	 x=scan.nextInt();
	    	 q=scan.nextBigInteger();
	    	 System.out.println(m[x%10][(q.mod(BigInteger.valueOf(4))).intValue()]);
		}
	     
	     scan.close();
	 }
}

