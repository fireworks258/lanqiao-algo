package 经典算法;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*2024.4.1
 * Arraylist是一个可以动态修改的数组，与普通数组不同，没有固定大小限制
 * 实现方法：List<Integer>=new ArrayList<>();
 * addd(Object obj)
 * size()返回元素个数
 * get(int index)获取索引位置元素
 * isEmpty()判断列表是否为空，为空返回true,否则返回false
 * contains(Object obj)如果列表包含指定元素。返回true,要注意该方法复杂度为o(n)
 * remove(Object obj)移除列表中元素，返回值是被删除元素
 * */
/*-------------------------------------------------------------------
 * HashMap类的特点*
 * HashMap是一个散列表（哈希表），存储内容是键值对（key-value）的映射
 * HashMap实现了map接口，根据键（key）的hashcode值储存数据，具有很快的访问速度
 * HashMap是无序的，即不会记录插入的顺序，内部涉及红黑树转换等复杂操作，可以有效应对哈希注入
 * 实现方法：Map<Integer,Integer>=new HashMap<>();
 * put(K key,V value)将键（key）值（value）映射存放在Map集合中
 * get(Object key)获取键映射的值（value），不存在则返回null
 * size()返回map集合中数据数量，即key-value对数
 * getOrdefault(K key,Object default)返回key对应的值，若不存在，则返回默认值（default）
 * */
public class __list和map {
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Map<Integer, Integer> map1=new HashMap<>();
		map1.put(1, 2);
		map1.put(2, 3);
		System.out.println(map1.get(2));
		System.out.println(map1.getOrDefault(3, 100));
		scanner.close();
	}
}
