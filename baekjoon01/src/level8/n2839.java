package level8;

import java.io.*;
public class n2839 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
	
		int cnt=0;
		
		while(true) {
			if(n%5==0) {
				cnt+=n/5;
				break;
			}
			
			n-=3;
			cnt++;
			
			if(n<0) {
				cnt=-1;
				break;
			}
		}
		System.out.println(cnt);
	}

}

/*
 * Arrays.fill(dp, 10000);
        dp[3] = 1;
        dp[5] = 1;
        for(int i = 6; i <= N; i++) {
            dp[i] = Math.min(dp[i - 5], dp[i - 3]) + 1;
        }
 */
