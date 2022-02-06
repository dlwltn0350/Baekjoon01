package level5;

import java.util.*;
public class n2577 {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int a,b,c,result;
		int num[]= new int[11];
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		result=a*b*c;
		
		for(;;) {
			if(result <= 0) break;
			num[result%10]++;
			result=result/10;
		}
		
		for(int i=0;i<10;i++)
			System.out.println(num[i]);
	}
}
