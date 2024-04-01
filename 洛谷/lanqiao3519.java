package 洛谷;
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class lanqiao3519 {//通过80%（屎山超时）
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String s=scan.nextLine();
     char num[]=s.toCharArray();
     int flag=-1,ans=0;
     for (int i = 0; i < num.length; i++) {
    	if(flag!=num[i]){
    		if(num[i]=='?') {
    			if(flag==-1) {
    				flag=num[i+1];
    			}
    			else {
    				flag=-1;
    	    		ans++;
    			}
		}
    		else {
    			flag=num[i];
    		}
    	}
    	else{
    		flag=-1;
    		ans++;
		}
	}
     System.out.println(ans);
     scan.close();
 }
}