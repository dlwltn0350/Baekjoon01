package level7;

import java.io.*;
import java.util.Arrays;
public class n1157 {

	//A~Z: 65 ~ 90, a :97
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		int max=0, tmp=0, n=0;
		
		int[] arr=new int[26];
		Arrays.fill(arr, 0);
		
		for(int i=0;i<s.length();i++) {
			for(int j=65;j<=90;j++) {
				if((int)s.charAt(i)-j==0) arr[j-65]++;
				else if((int)s.charAt(i)-j-32==0) arr[j-65]++;
			}
		}
		
		max=arr[0];
		
		for(int i=1;i<26;i++) {
			if(max<arr[i]) {
				max=arr[i];
				tmp=i;
			}
			else if(max==arr[i] && max!=0) n=max;
		}
		
		if(n==max) System.out.println("?");
		else if(max!=0) System.out.println((char)(tmp+65));
	}

}
