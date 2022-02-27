package level12;

import java.io.*;
import java.util.*;

public class n1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n=br.readLine();
		Integer[] arr=new Integer[n.length()];
		
		for(int i=0;i<n.length();i++) {
			arr[i]=n.charAt(i)-'0'; //Character.getNumericValue(n.charAt(i))
		}
		Arrays.sort(arr, Collections.reverseOrder()); //reverseOrder를 사용하려면 Integer 형태여야함 (int X)
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
