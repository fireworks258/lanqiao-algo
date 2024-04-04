package 经典算法;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*队列是一种先进后出的数据结构，就像排队一样，由于每次添加元素都是从队尾添加，所以使用双向链表的内置接口实现较好
 *创建：Queue<Integer>queue=new LinkList<>();使用LinkList内置接口实现双端队列
 * Boolen add(Object obj)入队，队尾压入元素，成功返回true，失败返回false
 * Object pull(),出队，删除队头元素并返回
 * Object peek(),返回队头元素，但是不删除
 * Boolen isEmpty，判断队列是否为空
 * */
public class __队列Queue {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Queue<Integer> queue=new LinkedList<>();
	queue.add(1);
	queue.add(2);
	queue.add(3);
	while(!queue.isEmpty()) {
		System.out.println(queue.poll());
	}
	scan.close();
}
}
