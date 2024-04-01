
package 经典算法;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
public class 字典序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int N=scan.nextInt();
        String s []=new String[N];
        String ans="";
        for (int i = 0; i < N; i++) {
			s[i]=scan.next();
		}
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1+s2).compareTo(s2+s1);//我草泥马那个出生出的题，要求字典序最小（所有组合中字典序最小的一种
            }                                   //就要保证结果前面的字符尽可能小，依照贪心算法，需比较两字符串正逆排列的大小
            });
        for (int i = 0; i < s.length; i++) {
			ans+=s[i];
		}
        System.out.println(ans);
        scan.close();
    }
}