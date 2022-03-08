package level15;

import java.io.*;

public class n1904 {

	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		dp=new int[10000001];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		if(n>=3) {
			for(int i=3;i<=n;i++) {
				dp[i]=(dp[i-1]+dp[i-2])%15746;
			}
		}
		
		System.out.println(dp[n]);
	}

}

/*
 * n=1) 1 ->1
 * n=2) 00 11 ->2
 * n=3) 001 100 111 ->1+2=3
 * n=4) 0011 1100 1001 1111 0000 ->2+3=5
 * n=5) 00001 00100 10000 11100 00111 11001 10011 11111
 * 
 */
