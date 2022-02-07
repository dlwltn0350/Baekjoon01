package level6;

import java.util.*;

class Test{
	long sum(int[] a) {
		long cnt=0;
		for(int i=0;i<a.length;i++) {
			cnt+=a[i];
		}
		return cnt;
	}
}
public class n15596 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Test test=new Test();
		System.out.println(test.sum(a));
		
	}
}
