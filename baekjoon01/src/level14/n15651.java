package level14;

import java.io.*;

public class n15651 {

	static int[] arr;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void dfs(int n, int m, int depth) throws IOException {

		
		if(depth==m) {
			for(int i=0; i<m; i++)
				bw.write(arr[i]+" ");
			bw.write("\n");
			return;
		}
		
		for(int i=0;i<n;i++) {
				arr[depth]=i+1;
				dfs(n,m,depth+1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str= br.readLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		
		arr= new int[m];//결과를 담을 배열
		
		dfs(n,m,0);
		bw.flush();
	}

}
