package level15;

import java.io.*;

public class n1003 {

	static Integer[][] dp = new Integer[41][2];
	
	public static Integer[] f(int n) {
		if(dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = f(n-1)[0] + f(n-2)[0];
			dp[n][1] = f(n-1)[1] + f(n-2)[1];
		}
		return dp[n];
 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			f(n);
			System.out.println(dp[n][0] + " " + dp[n][1]);
			
		}
	}

}
