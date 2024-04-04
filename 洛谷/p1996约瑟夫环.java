package 洛谷;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1996约瑟夫环 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Queue<Integer> queue=new LinkedList<>();
	int loop=1;
	int n=scan.nextInt();int m=scan.nextInt();
	for (int i = 1; i <=n; i++) {
		queue.add(i);
	}
	while(!queue.isEmpty()) {
		if (loop==m) {
			System.out.print(queue.poll()+" ");//数到m，出队
			loop=0;
		}
		else {
			queue.add(queue.poll());//未数到m，将对头挪到队尾
		}
		loop++;
	}
	scan.close();
}
}
