package level15;

import java.io.*;

public class n9184 {

	static int dp[][][];
	public static int w(int a, int b, int c) {
		
		if(a<=20 && b<=20 && c<=20 && a>=0 && b>=0 && c>=0) {
			if(dp[a][b][c] !=0) 
				return dp[a][b][c]; }//�̹� ������ ���� ���� �ִٸ�, �Ǵٽ� ��ꤤ��
		
		if(a<=0 || b<=0 || c<=0) return 1;

		if(a>20 || b>20 || c>20) return dp[20][20][20] = w(20, 20, 20); //dp�� 20�� �Ѿ�� �ʴ´�.
		
		if(a<b && b<c) 
			return dp[a][b][c]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		
		return dp[a][b][c]= w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		dp=new int[21][21][21];
		while(true) {
			String[] str=br.readLine().split(" ");
			
			if(Integer.parseInt(str[0])==-1 && Integer.parseInt(str[1])==-1 && Integer.parseInt(str[2])==-1) break;
			
			System.out.print("w("+str[0]+", "+str[1]+", "+str[2]+") = ");
			System.out.println(w(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2])));
			
		}
	}

}

//�޸������̼�(memoization) : ��ǻ�� ���α׷��� ������ ����� �ݺ��ؾ� �� ��, ������ ����� ���� �޸𸮿� ���������ν� ������ ����� �ݺ� ������ �����Ͽ� ���α׷� ���� �ӵ��� ������ �ϴ� ���

