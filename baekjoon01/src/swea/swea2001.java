package swea;

import java.util.Scanner;

public class swea2001 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++){
			int N=sc.nextInt();
			int M=sc.nextInt();
			int arr[][]=new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			int max=0, sum=0, flagX=0, flagY=0;
			int k=0;
			
			for(int i=0;i<N;i++) {
				flagY=0;
				for(int j=k;j<N;j++) {
					if(flagY==M) {
						flagY=0;
						break;
					}
					sum+=arr[j][i];//���η� MȽ����ŭ ���� (flagY)
					flagY++;
				}
				flagX++;
				if(flagX==M) { //���ηε� MȽ����ŭ ���ߴٸ� sum��
					max=Math.max(max, sum);
					i=i-M+1;
					flagX=0;
					sum=0;
				}
				if(i==N-1 && k!=N-M) { //���� �ٲٱ� ����
					i=-1;
					k++;
					flagX=0;
					sum=0;
				}
			}
			System.out.println("#"+test_case+" "+max);
		}
	}
}
