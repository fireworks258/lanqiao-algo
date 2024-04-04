package 洛谷;
import java.util.Scanner;
import java.util.Stack;
/*易错点：当栈为空时再弹栈，会导致stackempty异常
 * */
public class p1739括号匹配 {
static	Stack<Character> stack=new Stack<>();
/*---解法1，用try,catch块捕获栈空异常---------*/
//public static void main(String[] args) {
//Scanner scan = new Scanner(System.in);
//String s=scan.nextLine();

//try {
//for (int i = 0; i <s.length(); i++) {
//	if(s.charAt(i)=='(') stack.add(s.charAt(i));
//	if(s.charAt(i)==')') stack.pop();
//}
//if(stack.isEmpty()) System.out.println("YES");
//else {
//	System.out.println("NO");
//}
//}
//catch (Exception EmptyStackException) {
//	// TODO: handle exception
//	System.out.println("NO");
//}
//scan.close();
//}
/*---解法2，不使用异常,分情况讨论------------*/
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	char[]str=scan.nextLine().toCharArray();//转化为字符串数组，便于操作
	for (int i = 0; i < str.length; i++) {
		if(str[i]=='@') break;
		if(str[i]=='(') stack.add(str[i]);
		if(str[i]==')') {
			if(stack.isEmpty()) {
				System.out.println("NO");
				return;
			}
			else {
				stack.pop();
			}
		}
	}
		if(stack.isEmpty()) System.out.println("YES");
		else {
			System.out.println("NO");
	}
	scan.close();
	}
}

