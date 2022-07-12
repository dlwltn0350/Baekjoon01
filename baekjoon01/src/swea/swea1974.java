package swea;

import java.util.Scanner;

public class swea1974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++){
			int[][] arr = new int[9][9];
			int[] nums= new int[9];
			boolean flag = false;
			
			for(int i=0;i<9;i++) {
				nums[i]=0;
			}
			
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			//가로 check
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					nums[arr[i][j]-1]++;
				}
				for(int k=0;k<9;k++) {
					if(nums[k]>1) {
						flag=true;
						break;
					}
					nums[k]=0;
				}
				
				if(flag) break;
			}
			
			if(!flag) {
				//세로 check
				for(int i=0;i<9;i++) {
					for(int j=0;j<9;j++) {
						nums[arr[j][i]-1]++;
					}
					
					for(int k=0;k<9;k++) {
						if(nums[k]>1) {
							flag=true;
							break;
						}
						nums[k]=0;
					}
					
					if(flag) break;
				}
			}
			
			if(!flag) {
				//3*3 check
				for(int s=0;s<3;s++) {
					
					for(int i=0;i<9;i++) {
						if(i%3==0) {
							for(int k=0;k<9;k++) {
								if(nums[k]>1) {
									flag=true;
									break;
								}
								nums[k]=0;
							}
							
							if(flag) break;
						}
						
						for(int j=s*3;j<s*3+3;j++) {
							nums[arr[i][j]-1]++;
						}
						
					}
					if(flag) break;
				}
				
			}
			
			if(!flag) System.out.println("#"+test_case+" 1");
			else System.out.println("#"+test_case+" 0");
			
		}
	}

}
