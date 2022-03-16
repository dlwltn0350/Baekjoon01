package level16;

import java.io.*;

public class n13305 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		long[] length= new long[n-1];
		long[] cost=new long[n];
		
		for(int i=0;i<2;i++) {
			String[] str=br.readLine().split(" ");
			
			for(int j=0;j<str.length;j++) {
				if(i==0) length[j]=Integer.parseInt(str[j]);
				else cost[j]=Integer.parseInt(str[j]);
			}
		}
		
		long min=cost[0];//최소비용
		long result=0;
		
		for(int i=0;i<n-1;i++) {
			if(cost[i]<min) {
				min=cost[i];
			}
			result+=min*length[i];	
		}
		
		System.out.println(result);
		
	}

}
