package level8;

import java.io.*;
public class n10250 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int H,W,N;
		int h=1,w=1;
		
		for(int i=0;i<n;i++) {
			h=0;
			w=0;
			String[] str=br.readLine().split(" ");
			H=Integer.parseInt(str[0]);
			W=Integer.parseInt(str[1]);
			N=Integer.parseInt(str[2]);
			
			for(int j=0;j<N;j++) {
				if(h==H) {
					h=1;
					w++;
					continue;
				}
				h++;
			}
			
			if(w<9) System.out.println(h+"0"+(w+1));
			else System.out.println(h+""+(w+1));
		}
		
		
	}

}
