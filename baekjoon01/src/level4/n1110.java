package level4;

import java.io.*;

public class n1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int tmp=n, left=0, right=0, cnt=0;
		
		while(true) {
			left=n/10;
			right=n%10;
			n=right*10+(left+right)%10;
			cnt++;
			
			if(n==tmp) break;
		}
		
		System.out.println(cnt);
	}

}
