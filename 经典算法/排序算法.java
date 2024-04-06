package 经典算法;
import java.util.Arrays;
import java.util.Scanner;
/*数组排序
 * Arrays.sort(int a[])对数组所有元素进行排序，默认升序
 * 使用Lamda表达式修改排序
 * 升序：Arrays.sort(int a[]，(o1,o2)->o1-o2)
 * 降序：Arrays.sort(int a[]，(o1,o2)->o2-o1)
 * 对二维数组按第n个值排序
 * Arrays.sort(nums,(o1,o2)->o1[n]-o2[n])！！可以应对复杂比较规则
 * ----------------------------------------
 * 集合排序，使用与Arraylist，set等集合结构
 * Collections.sort(List<>arr)
 * 也可以使用lamada表达式重写比较器
 * */
public class 排序算法 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num=new int[] {1,7,9,4,7,3};
		int[][] nums=new int[][] {{1,4,9},{2,5,8},{6,9,45},{5,8,10},{0,1,7}};
		Arrays.sort(num);
		Arrays.sort(nums,(o1,o2)->(o1[0]-o2[0])-(o1[2]));//可以这样重写
		//Arrays.sort(nums);报错
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.err.println("------num");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
