package level8;

import java.io.*;
public class n1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr=br.readLine().split(" ");
		
		long A=Integer.parseInt(arr[0]);
		long B=Integer.parseInt(arr[1]);
		long C=Integer.parseInt(arr[2]);
		
		long i=1;
		
		if(B<C) {
			for(i=1;;i++) {
				if(A+B*i<C*i) break;
			}
			System.out.println(i);
		}
		else System.out.println(-1);
	}

}
