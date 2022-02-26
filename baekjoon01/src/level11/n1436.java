package level11;

import java.io.*;
public class n1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int cnt=0, tmp=0;
		String str;
		
		for(int i=666; ; i++) {
			str=Integer.toString(i);
			tmp=0;
			
			//charAt() 방식말고, String.valueOf(num).contains("666")로 문제 해결 가능
			for(int j=0;j<str.length();j++) {
				if(tmp == 3) break;
				if(str.charAt(j)=='6') tmp++;
				else tmp=0; //str.charAt(j)!='6'
			}
			
			if(tmp>=3) cnt++;
			if(n==cnt) {
				System.out.println(i);
				break;
			}
		}
	}

}
