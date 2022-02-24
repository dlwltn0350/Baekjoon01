package level11;

import java.io.*;

public class n7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] arr=new int[n][2];
		int rank=1;
		
		for(int i=0;i<n;i++) {
			String[] str=br.readLine().split(" ");
			arr[i][0]=Integer.parseInt(str[0]);
			arr[i][1]=Integer.parseInt(str[1]);
		}
		
		
		for(int i=0;i<n;i++) {
			rank=1;
			for(int j=0;j<n;j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
			}
			System.out.print(rank + " ");
		}
	}
}