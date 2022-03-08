package level15;

import java.io.*;

public class n9461 {
	static long dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		dp=new long[10000001];
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		dp[3]=1;
		dp[4]=2;
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			
			/*for(int j=4;j<=n;j++) {
				dp[j]=dp[j-2]+dp[j-3];
			}*/ //이 방법도 가능
			for(int j=5;j<=n;j++) {
				dp[j]=dp[j-1]+dp[j-5];
			}
			
			System.out.println(dp[n]);
		}
	}

}

/*
 * n=6일때, 첫번째와 다섯번째 삼각형과 인접한다.
 * n=7일때, 두번째와 여섯번째 
 * ..
 * 
 * 또는 n=4일때, n=1+n=2와 같다
 * ..
 * 
 */
