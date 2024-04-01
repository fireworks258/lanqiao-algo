package 洛谷;
import java.io.*;
public class 快速读入 {
	    // 重点：在洛谷中BufferedReader和StreamTokenizer在同一个程序中只能使用一个，否则会出现不能够正常读取数据的情况
	    //       其他的刷题网站不确定。

	    static BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
	    // ins 用于读入字符串这样的数据，当然也可以读入数字等，不过是String转变为基本类型数据
	    static StreamTokenizer in = new StreamTokenizer(ins);
	    // in 用于读入int、long、double等基本数据类型,当然也可以用来读入String（有一定的限制条件）
	    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	    // out 用于输出，代替以前的System.out.println();

	    public static void main(String[] args) throws IOException {
	        int a = 0;                          // 不要忘记在main函数上抛异常
	        int b = 0;
	        in.nextToken();                  	 // 读入数据时，记得每一次读取，都要先in.nextToken()
	        a = (int)in.nval;                   // 因为in.nval接收的是double类型，所以要强制类型转换
	        in.nextToken();
	        b = (int)in.nval;
	        out.println("a + b = "+(a+b));

	        // 此时输入：hello world!
	        in.nextToken();
	        String s1 = in.sval;                // 类似于以前的Scanner的next（）方法。
	        in.nextToken();                     // 同时也不要忘了in.nextToken()！！！
	        String s2 = in.sval;
	        out.println(s1);                    // hello
	        out.println(s2);                    // world
	        // 细心就会发现，为什么读入的是world,而不是world!
	        // 此时输入：你好，世界！             // 因为上面输入的是：hello world！所以，下面就还没输入，程序就结束了
	        String s = ins.readLine();          // 而输入：hello world 就可以正常进行。

	        // 如果要用ins.readLine()读取数字
	        // 此时输入类似于 (int)数字 (int)数字
	        // 根据题目，我们应该知道输入几个数字，和他们的类型，并根据这些读入读入数据。
	        String string = ins.readLine();
	        String[] strings = string.split(" ");
	        int sa = Integer.parseInt(strings[0]);          // 类似的String转变为Integer方法见下方的图片
	        int st = Integer.parseInt(strings[1]);
	        out.println(sa);
	        out.println(st);

	        out.println(s);                     // 所以sval用的时候一定要谨慎考虑输入的数据是否会影响后面数据的读入！！
	        out.close();                        // out.close()一定不能忘！否则不输出数据
	}

}
