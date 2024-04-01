package 经典算法;
import java.util.Arrays;
import java.util.Scanner;
public class 二分搜索{
	public static int findlower(int a[],int target) {//二分查找
		int l=0,r=a.length-1;
		while(l<=r) {
		int mid	=(l+r)>>1;
			if(a[mid]>target) {
				r=mid-1;
			}
			else if(a[mid]<target){
				l=mid+1;
			}
			else {
				return mid;
			}
		}
			
	return -1;
	}
	public static int findfirst(int[] arr,int key) {//不完善
		int left=0,right=arr.length-1;
		int mid=(right+left)>>1;
		if(arr[arr.length-1]<key) {
			return -1;
		}
		while(left<right) {
			mid=(right+left+1)>>1;
			if(arr[mid]>=key) {
				left=mid;
			}
			else {
				right=mid-1;
			}
		}
		return left;
	}
	public static int commonBinarySearch(int[] arr,int key){
		int low = 0;
		int high = arr.length - 1;
		int middle = 0;			//定义middle
		
		if(key < arr[low] || key > arr[high] || low > high){
			return -1;				
		}
		
		while(low <= high){
			middle = (low + high) / 2;
			if(arr[middle] > key){
				//比关键字大则关键字在左区域
				high = middle - 1;
			}else if(arr[middle] < key){
				//比关键字小则关键字在右区域
				low = middle + 1;
			}else{
				return middle;
			}
		}
		
		return -1;		//最后仍然没有找到，则返回-1
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int c=in.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);//排序后才能用二分
		System.out.println(findfirst/*commonBinarySearch*/(a,c));
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		in.close();
	}
}