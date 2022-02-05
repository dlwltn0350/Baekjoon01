package level2;

import java.util.*;
public class n2884 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int h,m;
		h=sc.nextInt();
		m=sc.nextInt();
		
		if(m<45) {
			h--;
			if(h==-1) h=23;
			m=60+(m-45);
		}
		else {
			m=m-45;
		}
		
		System.out.println(h+" "+m);
	}
}
