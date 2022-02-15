package level8;

import java.io.*;
public class n2292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i, cnt=1;
		
		if(n==1) System.out.println(1);
		else {
			for(i=1;;i++) {
				if(n<=cnt+6*i) break;
				cnt=cnt+6*i;
			}
			
			System.out.println(i+1);
		}
	}

}
