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
					sum+=arr[j][i];//세로로 M횟수만큼 더함 (flagY)
					flagY++;
				}
				flagX++;
				if(flagX==M) { //가로로도 M횟수만큼 더했다면 sum비교
					max=Math.max(max, sum);
					i=i-M+1;
					flagX=0;
					sum=0;
				}
				if(i==N-1 && k!=N-M) { //줄을 바꾸기 위함
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
