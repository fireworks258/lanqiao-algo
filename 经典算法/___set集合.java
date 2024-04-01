package 经典算法;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;
public class ___set集合 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean flag=false;
		Set<Integer> hset=new HashSet<>();
		/*hashset类常用方法
		 * add(Object obj)向集合中添加元素，添加成返回true，失败（集合中已有该元素）返回false
		 * size()返回集合中元素个数
		 * remove（Object obj）删除set集合元素，成功返回true，失败返回false
		 * contains(Object obj)若set包含元素，返回true，否则返回false
		 * clear()清除集合中所有元素
		*/
		flag=hset.add(1);
		System.out.println(flag);//add成功，返回true
		flag=hset.add(1);
		System.out.println(flag);//add失败，返回false
		scan.close();
	}
}

