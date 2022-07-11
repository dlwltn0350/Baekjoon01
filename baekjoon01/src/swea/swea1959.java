package swea;
import java.util.*;

public class swea1959 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++){
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			int A[]=new int[N];
			int B[]=new int[M];
			
			for(int i=0;i<N;i++) {
				A[i]=sc.nextInt();
			}
			for(int i=0;i<M;i++) {
				B[i]=sc.nextInt();
			}
			
			int max=-10000,sum=0;
			
			if(N<=M) {
				for(int i=0;i<=(M-N);i++) {
					for(int j=0;j<N;j++) {
						sum+=(A[j]*B[i+j]);
					}
					max=Math.max(sum, max);
					sum=0;
				}
			}
			else {
				for(int i=0;i<=(N-M);i++) {
					for(int j=0;j<M;j++) {
						sum+=(B[j]*A[i+j]);
					}
					max=Math.max(sum, max);
					sum=0;
				}
			}
			System.out.println("#"+test_case+" "+max);
		}
	}
}
