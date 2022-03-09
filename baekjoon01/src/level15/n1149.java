package level15;
/**
 * 인접한 색이 같으면 안된다.
 */
import java.io.*;

public class n1149 {

	static int[][] rgb ;
	static int[][] dp;
	
	public static int minCost(int n) {
		dp[0][0]=rgb[0][0]; 
		dp[0][1]=rgb[0][1]; 
		dp[0][2]=rgb[0][2];
		
		for(int i=1;i<n;i++) {
			//빨강으로 시작하면 양 사이드에 초록, 파랑 둘 중 하나가 올 수 있다.
			dp[i][0]=Math.min(dp[i-1][1], dp[i-1][2])+rgb[i][0]; //빨강으로 시작했을때의 최소비용계산
			dp[i][1]=Math.min(dp[i-1][0], dp[i-1][2])+rgb[i][1];
			dp[i][2]=Math.min(dp[i-1][0], dp[i-1][1])+rgb[i][2];
		}
		
		return Math.min(Math.min(dp[n-1][0],dp[n-1][1]), dp[n-1][2]);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		rgb = new int[n][3];
		dp=new int[n][3];
		
		for(int i=0;i<n;i++) {
			String[] str=br.readLine().split(" ");
			rgb[i][0]=Integer.parseInt(str[0]);
			rgb[i][1]=Integer.parseInt(str[1]);
			rgb[i][2]=Integer.parseInt(str[2]);
		}
		System.out.println(minCost(n));
	}

}
