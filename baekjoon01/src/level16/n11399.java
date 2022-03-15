package level16;

import java.io.*;
import java.util.Arrays;

public class n11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] str=br.readLine().split(" ");
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		
		int result=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++)
				result+=arr[j];
		}
		System.out.println(result);
	}

}
