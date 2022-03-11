package level15;

import java.io.*;

public class n2579 {
	static int[] score;
	static int[] dp;
	
	public static void f(int n) { //1+2�� ū�� 2+3�� ū�� ���ϴ°� �ʿ���
		int cnt=0;
		dp[0]=0;
		boolean flag=false;//������ ��ĭ�� �ǳʶپ����� Ȯ��
		
		for(int i=1;i<n;i++) {
			if(cnt!=2 && i+1!=n) {
				if(Math.max(score[i-1]+score[i], score[i])==score[i]){//��ĭ�ǳʶڴٸ�
					cnt=0;
					if(flag) dp[i]=score[i]+dp[i-2]; //������ ��ĭ�� �� ���� �ִٸ�, dp[i-2]
					else dp[i]=score[i]+dp[i-1];
					i++;
					flag=true;
				}
				else {//��ĭ�ǳʶڴٸ�
					cnt++;
					if(flag) {
						dp[i]=score[i-1]+dp[i-2];
						flag=false;
					}
					else dp[i]=score[i-1]+dp[i-1];
				}
			}
			else {//���ӵ� ����°��� ������ ��ĭ �ǳʶپ����
				if(flag) dp[i]=score[i]+dp[i-2]; //������ ��ĭ�� �� ���� �ִٸ�, dp[i-2]
				else dp[i]=score[i]+dp[i-1];
				flag=true;
				i++;
			}
		}
		
		if(dp[n-1]<=0) dp[n-1]=score[n-1]+dp[n-2];
		
		//for(int i=0;i<n;i++)
		//	System.out.println(dp[i]);
		System.out.println(dp[n-1]);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		score=new int[n+1];
		dp=new int[n+1];
		
		//for(int i=0;i<n;i++) {
		for(int i=1;i<=n;i++) {
			score[i]=Integer.parseInt(br.readLine());
		}
		//f(n);
		dp[1]=score[1];
		if(n>=2) {
			dp[2]=dp[1]+score[2];
			
			for(int i=3;i<=n;i++) {
				dp[i]=Math.max(dp[i-2]+score[i], dp[i-3]+score[i-1]+score[i]);
			}
		}
		System.out.println(dp[n]);
	}

}
