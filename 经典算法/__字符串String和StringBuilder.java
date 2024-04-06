package 经典算法;

import java.util.Scanner;
/*------------------字符串类------------------
 *String类，即字符串，java中所有字符串皆为该类对象
 * String类固定用final修饰，创建后不可更改！！，而字符串缓冲区（StringBuffer）支持可变字符串
 * ！！由于String类对象都为final所以可被共享，即通过new申请内存空间后，只要字符序列（顺序和大小写）相同
 * 无论再程序不同位置出现几次，jvm都只会建立一个String对象
 * 创建空字符串：String snull=new String();
 * 参数为字符串的构造方法：String str=new String("value");
 * -----------------常用方法------------------
 * char charAt(int index)返回索引位置字符串
 * int length()返回字符串长度（字符个数）
 * int indexOf(string)返回指定子字符串第一次出现位置,不存在返回-1
 * String concat（String str）将str连接到字符串结尾
 * int compareTo(Object obj）重要！！以字典序进行比较，大于返回1，等于返回0，小于返回-1
 * char[] toCharArray()转化为字符串数组，便于操作，常用
 * ----------------StringBuilder----------------
 * 常用构造方法为无参构造：StringBuilder sb=new StringBuilder()
 * char charAt(int index)返回索引位置字符
 * int indexOf(string)返回指定子字符串第一次出现位置,不存在返回-1
 * 重点reveserse!!---StringBuilder reverse()返回顺序反转的StringBuilder对象-------------------------------------------------
 * boolen isEmpty()判断字符串是否为空
 * void append(Object obj)在末尾添加字符串
 * insert(int index, String x)在索引位置前面添加字符
 * */
public class __字符串String和StringBuilder {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String snull=new String();//创建空字符串
	String str=new String("value");
	System.err.println(str.charAt(0));
	System.err.println(str.indexOf("al"));
	str.toCharArray();
	StringBuilder sb=new StringBuilder();
	sb.append("wc");
	sb.insert(1, "NB");//添加到索引位置前面
	System.out.println(sb.reverse());
	scan.close();
}
}
