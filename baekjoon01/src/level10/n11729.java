package level10;

import java.io.*;

public class n11729 {
	
	static int k=0;
	static StringBuilder sb = new StringBuilder();
	public static void hanoi(int n, int from, int tmp, int to) {
		k++;
		if(n==1) {
			sb.append(from+" "+to+"\n");
		}
		else {
			hanoi(n-1,from,to,tmp); //3을 임시공간(거쳐가는 공간)으로 이용해 1에 쌓여있는 n-1개 원판을 2로 이동
			sb.append(from+" "+to+"\n");//1에 남아있는 가장 큰 원반을 3으로 이동
			hanoi(n-1,tmp,from,to); //1을 임시공간으로 이용해 2에 쌓여있는 n-1개의 원판을 3으로 이동
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); //장판의 개수
		hanoi(n,1,2,3);
		System.out.println(k);
		System.out.println(sb);
	}

}
