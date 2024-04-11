package 经典算法;

public class __最大公约数gcd最小公倍数lcm {
public static void main(String[] args) {
	System.out.println(wcs(7, 10));
	System.out.println(lcm(10, 3));
}
//public static int wcs(int m,int n) {
//		return n!=0?wcs(n, m%n):m;
//	}
public static int lcm(int n,int m) {
	return n*m/wcs(n, m);
}
public static int wcs(int m,int n) {
	return n!=0?wcs(n, m%n):m;//n(你)!(不)=0?wcs(n,m%n):m;
}
}
