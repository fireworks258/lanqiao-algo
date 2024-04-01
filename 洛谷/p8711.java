package 洛谷;

import java.math.BigInteger;
import java.util.*;
//1:无需package
//2: 类名必须Main, 不可修改

public class p8711 {
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   //在此输入您的代码...
   BigInteger n= scan.nextBigInteger();
   while(n.compareTo(new BigInteger("0"))>0) {
  	 System.out.print(n+" ");
  	 n=n.divide(new BigInteger("2"));
   }
   scan.close();
}
}