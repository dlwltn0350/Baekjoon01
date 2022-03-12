/**
 * ���̳��� ���α׷���
 * 1.���̺�(dp[num])���� : �ּ� ���갳��
 * 2.��ȭ�� : dp[i] = Math.min(dp[i-1]+1, dp[i/2]+1, dp[i/3]+1);
 * 3.�ʱⰪ���� : dp[1]=0
 */
package level15;
import java.io.*;

public class n1463 {

	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		dp=new int[n+1];
		dp[1]=0; //1�� ����Ƚ���� 0�̱� ����
		
		
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+1;
			if(i%2==0) {
				dp[i]=Math.min(dp[i], dp[i/2]+1);
				//dp[i]=Math.min(dp[i-1], dp[i/2])+1;
			}
			if(i%3==0) {
				dp[i]=Math.min(dp[i], dp[i/3]+1);
				//dp[i]=Math.min(dp[i-1], dp[i/3])+1;
			}
		}
		
		System.out.println(dp[n]);
	}

}


