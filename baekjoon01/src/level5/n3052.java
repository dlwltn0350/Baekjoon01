package level5;

import java.util.*;
public class n3052 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int num[]=new int[10];
		int tmp[]=new int[42];
		int cnt=0;
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
			num[i]=num[i]%42;
			tmp[num[i]]++;
		}
		for(int i=0;i<42;i++) {
			if(tmp[i]!=0) cnt++;
		}
		System.out.println(cnt);
	}
}
