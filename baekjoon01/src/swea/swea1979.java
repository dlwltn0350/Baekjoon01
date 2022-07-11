package swea;

import java.util.Scanner;

public class swea1979 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++){
			int N=sc.nextInt();
			int k=sc.nextInt();
			
			int arr[][]=new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			int cnt=0, flag=0;
			//가로 check 연속 1인
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j]==1) flag++;
					if(flag!=0 && arr[i][j]==0) {//연속값이 끊긴다면
						if(flag==k) cnt++;
						flag=0;
					}
				}
				if(flag==k) cnt++;
				flag=0;
			}
			//세로 check
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[j][i]==1) flag++;
					if(flag!=0 && arr[j][i]==0) {
						if(flag==k) cnt++;
						flag=0;
					}
				}
				if(flag==k) cnt++;
				flag=0;
			}
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
