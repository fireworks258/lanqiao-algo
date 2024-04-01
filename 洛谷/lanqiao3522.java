package 洛谷;
import java.util.Scanner;

public class lanqiao3522{//欧拉公式+快速幂https://zh.wikipedia.org/zh-cn/%E6%AC%A7%E6%8B%89%E5%87%BD%E6%95%B0
  static int mod = 998244353;
  //快速幂
  static long qmi(long a,long b){
    long res = 1;
    while(b>0){
      if((b&1)>0){
        res = (res*a)%mod;
      }
      a = (a*a)%mod;
      b>>=1;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
    long b=scan.nextLong();
    long res = a; 
    long temp = a;
    for(int i=2;i<=temp/i;i++){
      if(temp%i==0){
        res = res/i*(i-1);
        while(temp%i==0) temp/=i;
      }
    }
    if(temp>1) res = res/temp*(temp-1);
    long t = qmi(a,b-1);
    res = (res*t)%mod;
    System.out.println(res);
  }
}