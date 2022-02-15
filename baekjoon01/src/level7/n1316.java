package level7;
/*
 * 그룹단어체커
 */
import java.util.*;
import java.io.*;

public class n1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String[] arr =new String[n];
		boolean[] bl=new boolean[26];
		int cnt=0;
		int j=0;
		
		Arrays.fill(bl, false);
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine();
		}
		
		for(int i=0;i<n;i++) {
			bl[(int)(arr[i].charAt(0))-97]=true;
			
			for(j=1;j<arr[i].length();j++) {
				if(bl[(int)(arr[i].charAt(j))-97]==true && arr[i].charAt(j-1)!=arr[i].charAt(j)) break;
				bl[(int)(arr[i].charAt(j))-97]=true;
			}
			
			if(j==arr[i].length()) cnt++;
			
			Arrays.fill(bl, false);
		}
		
		System.out.println(cnt);
	}

}
