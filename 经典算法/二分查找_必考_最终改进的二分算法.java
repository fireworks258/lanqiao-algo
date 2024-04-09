package 经典算法;

import java.util.Scanner;
/*二分算法
 * 用于在有序集合中查找元素，时间复杂度为ologN
 * 二分具有二段性：给定条件可以将集合中元素分为两部分，一部分满足条件，一部分不满足条件
 * 步骤！！！！！！！！！！！！！
 * 首先将（有序）集合分成两段，左边段[left,n-1][n,right]
 * 若mid落在左半段（<n）left=mid
 * 若mid落在右半段（>=n）right=mid
 * 然后else中left向右，right向左
 * 若出现left=mid,计算mid要向下取整
 * 勤加练习，必能掌握
 * */
public class 二分查找_必考_最终改进的二分算法 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[]=new int[]{1,2,4,5,6};
	int left=0,right=4;
	int left1=0,right1=4;
	int k=3;//要查找的值
	while(left<right) {//查找上界
		int mid=(left+right)>>1;
		if(arr[mid]>=k) {
			right=mid;
		}
		else {
			left=mid+1;
		}
	}
	System.err.println("done");
//---------------------------------------------
	while(left1<right1) {//查找下界
		int mid=(left1+right1+1)>>1;
		if(arr[mid]<k) {
			left1=mid;
		}
		else {
			right1=mid-1;
		}
	}
	System.out.println(left+" "+left1);
	scan.close();
}
}
