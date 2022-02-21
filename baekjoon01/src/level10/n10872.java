package level10;

import java.io.*;
public class n10872 {
	
	public static int f(int n) {
		if(n<=1) return 1;
		else return n*f(n-1);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println(f(n));
	}

}
