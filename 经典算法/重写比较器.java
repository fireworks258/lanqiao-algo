package 经典算法;
import java.util.Arrays;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class 重写比较器 {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n=scan.nextInt();
     Integer array[]=new Integer[n];
     for (int i = 0; i < n; i++) {
		array[i]=scan.nextInt();
	}
     Arrays.sort(array, (a,b)->{
    	 if(a%2!=b%2) {
		 if(a%2==0)
			 return 1;
		 else 
			 return -1;
	 }
	 else 
		 return a>b?1:-1;
     } );
     for (int i = 0; i < array.length; i++) {
		System.out.printf("%d " ,array[i]);
	}
     scan.close();
 }
}