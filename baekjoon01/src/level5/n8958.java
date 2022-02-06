package level5;

import java.util.*;
public class n8958 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0, sum=0;
		
		String[] text = new String[n];
		String[] result;
		
		for(int i=0;i<n;i++) text[i]=sc.next();
		for(int i=0;i<n;i++) {
			cnt=0;
			sum=0;
			result = text[i].split("");
			
			for(int j=0;j<result.length;j++) {
				if(result[j].equals("O"))
					cnt++;
				else cnt=0;
				sum+=cnt;
			}
			System.out.println(sum);
		}
	}
}
