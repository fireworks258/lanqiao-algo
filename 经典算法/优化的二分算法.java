package 经典算法;

import java.util.Scanner;

public class 优化的二分算法 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int l=0,r;
	int a[]=new int[] {1,2,3,4,5};
	int n=scan.nextInt();
	r=a.length-1;
//	while(l<r)
//	{
//		int mid=(l+r+1)/2;
//		if(a[mid]<=n)
//			l=mid;
//		else
//			r=mid-1;
//	}
//	while(l<r)
//	{
//		int mid=(l+r)/2;
//		if(a[mid]>n)
//			r=mid;
//		else
//			l=mid+1;???
//	}
	while(l<r) {
		int mid=(l+r+1)>>1;
		if(a[mid]<=n)
			l=mid;
		else {
			r=mid-1;
		}
			
	}
	System.out.println(r+1);
	scan.close();
}
}
