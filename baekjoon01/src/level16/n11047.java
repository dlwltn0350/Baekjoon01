package level16;

import java.io.*;

public class n11047 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int k=Integer.parseInt(str[1]);
		int cnt=0;
		int[] coin =new int[n];
		for(int i=0;i<n;i++) {
			coin[i]=Integer.parseInt(br.readLine());
		}
		
		int index=n-1;
		while(true) {
			
			if(k<=0) break;
			
			if(k-coin[index]>=0) {
				k-=coin[index];
				cnt++;
			}
			else {
				index--;
			}
		}
		System.out.println(cnt);
	}

}
