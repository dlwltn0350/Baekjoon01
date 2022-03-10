package level15;

import java.io.*;

public class n1932 {

	static int[][] triangle;
	static int[][] dp; 
	
	public static int f(int n) {
		
		dp[0][0]=triangle[0][0];
		int max=Integer.MIN_VALUE;
		
		if(n==1) return dp[0][0];
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) dp[i][j]=dp[i-1][j]+triangle[i][j];
				else if(i==j) dp[i][j]=dp[i-1][j-1]+triangle[i][j];
				else dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1])+triangle[i][j];
				max=Math.max(max, dp[i][j]);
			}
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		triangle=new int[n][];
		dp=new int[n][];
		
		for(int i=0;i<n;i++) {
			triangle[i]=new int[i+1];
			dp[i]=new int[i+1];
			if(i==0) {
				triangle[0][0]= Integer.parseInt(br.readLine());
			}
			else {
				String[] str=br.readLine().split(" ");
				
				for(int j=0;j<=i;j++) {
					triangle[i][j]=Integer.parseInt(str[j]);
				}
			}
			
		}
		System.out.println(f(n));
	}

}
