package 洛谷;

public class p1008 {
	public static	boolean check(int x,int y,int z) {
		int[] a=new int[10];
		a[0]=1;
		for (int i = 100; i >=1; i/=10) {
			if(a[x/i]>0)
				return false;
			else
				a[x/i]++;
			x%=i;
		}
		for (int i = 100; i >=1; i/=10) {
			if(a[y/i]>0)
				return false;
			else
				a[y/i]++;
			y%=i;
		}
		for (int i = 100; i >=1; i/=10) {
			if(a[z/i]>0)
				return false;
			else
				a[z/i]++;
			z%=i;
		}
		return true;
	}
public static void main(String[] args) {
	int x,y,z;
	for (int i = 192; i < 328; i++) {
		x=i;y=2*i;z=3*i;
		if(check(x, y, z))
			System.out.printf("%d %d %d \n",x,y,z);
	}
}
}
