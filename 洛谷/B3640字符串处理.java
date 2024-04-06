package 洛谷;

import java.util.Scanner;

public class B3640字符串处理 {//
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	StringBuilder sb1=new StringBuilder();
	char[] s=(scan.nextLine()+' ').toCharArray();
	int l=0,r=0;
	for(int i=0;i<s.length;i++) {
		if(s[i]!=' ') {
			sb1.append(s[i]);
			continue;
		}
		if(sb1.charAt(0)>='a'&&sb1.charAt(0)<='z') {//小写
			sb.insert(0,sb1.toString().toUpperCase()+" ");
		}
		if(sb1.charAt(0)>='A'&&sb1.charAt(0)<='Z') {//大写
			sb.insert(0,sb1.toString().toLowerCase()+" ");
		}
		if(sb1.charAt(0)>='0'&&sb1.charAt(0)<='9') {//自然数
			sb.insert(0, sb1.reverse()+" ");
		}
		sb1=new StringBuilder();
	}
	System.out.println(sb);
	scan.close();
}
}
