package level5;

import java.util.*;
public class n4344 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		int c=sc.nextInt();
		int n;
		int cnt=0;
		
		double avg = 0.0;
		int[][] num = new int[c][1000];
		double[] r=new double[c];
		
		for(int i=0;i<c;i++) {
			n=sc.nextInt();
			avg=0.0;
			cnt=0;
			for(int j=0;j<n; j++) {
				num[i][j]=sc.nextInt();
				avg += num[i][j];
			}
			avg/=n;
			
			for(int j=0;j<n;j++) {
				if(num[i][j]>avg) cnt++;
			}
			r[i]= (double)100/n*cnt;
		}
		
		for(int i=0;i<c;i++) {
			System.out.printf("%.3f",r[i]);
			System.out.println("%");
		}
		
	}
}
