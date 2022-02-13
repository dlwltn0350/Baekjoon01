package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s= br.readLine().split(" ");
		String[] r = new String[2];
		Arrays.fill(r, "");
		int[] arr= new int[2];
		char tmp;
		for(int i=0;i<2;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {
				r[i]=r[i]+s[i].charAt(j);
			}
		}
		
		if(Integer.parseInt(r[0])>Integer.parseInt(r[1])) System.out.println(r[0]);
		else System.out.println(r[1]);
		
		
		
	}

}
