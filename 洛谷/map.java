package 洛谷;

import java.util.ArrayList;
import java.util.Scanner;
public class map {
static ArrayList<Integer>[] map;
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int N=scan.nextInt();
	map=new ArrayList[N+1];
	for (int i = 1; i <= N; i++) {
		map[i]=new ArrayList<>();
	}
	map[3].add(4);
	map[3].add(3);
	map[3].add(2);
	map[3].add(1);
	scan.close();
	for (int i : map[3]) {
		System.out.println(i);
	}
}
}
