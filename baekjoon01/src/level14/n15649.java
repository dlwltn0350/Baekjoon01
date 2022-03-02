/**
 * 백트래킹(dfs)
 */

package level14;

import java.io.*;

public class n15649 {

	static boolean[] visit;
	static int[] arr;
	
	public static void dfs(int n, int m, int depth) {
		
		if(depth==m) {
			for(int i=0; i<m;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true; //방문한 걸로 표시
				arr[depth]=i+1; //0+1
				dfs(n,m,depth+1);
				visit[i]=false; //자식노드 방문하고 빠져나옴
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str= br.readLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		
		visit=new boolean[n];
		arr= new int[m];//결과를 담을 배열
		
		dfs(n,m,0);
		
	}

}
