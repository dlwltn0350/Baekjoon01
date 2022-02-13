package level7;

import java.util.*;
import java.io.*;
public class n1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s= br.readLine().split(" ");
		
		int cnt=0;
		
		for(int i=0;i<s.length;i++) {
			if(s[i]==" ") continue;
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
