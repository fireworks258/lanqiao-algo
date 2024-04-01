package 洛谷;

import java.util.Scanner;
public class luogu{
	public static int getlie(int mo,int w,int hang) {
		if(hang>>1==0) {
			return (w-mo+1)%w;
		}
		else {
			if(mo==0) {
				return 6;
			}
			else {
			return mo;
			}
		}
	}
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int w=0,m=0,n=0,hang1=0,hang2=0,ans=0;
			w=in.nextInt();
			m=in.nextInt();
			n=in.nextInt();
			int mo1=m%w;
			int mo2=n%w;
			if(mo1==0) {
				hang1=m/w;
			}
			else {
				hang1=m/w+1;
			}
			if(mo2==0) {
				hang2=n/w;
			}
			else {
				hang2=n/w+1;
			}
			int lie1=getlie(mo1, w, hang1);
			int lie2=getlie(mo2, w, hang2);
			System.out.println(Math.abs(lie2-lie1)+Math.abs(hang1-hang2));
			in.close();
	}
}