package 洛谷;

import java.util.Scanner;
import java.util.Stack;

public class p1427 {//栈的应用
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Stack<Integer> stack=new Stack<>();
	int num;
	while((num=scan.nextInt())!=0) {
		stack.add(num);//push
	}
	while(!stack.isEmpty()) {
		System.out.print(stack.pop()+" ");
	}
	scan.close();
}
}
