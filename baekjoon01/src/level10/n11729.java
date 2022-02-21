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
			hanoi(n-1,from,to,tmp); //3�� �ӽð���(���İ��� ����)���� �̿��� 1�� �׿��ִ� n-1�� ������ 2�� �̵�
			sb.append(from+" "+to+"\n");//1�� �����ִ� ���� ū ������ 3���� �̵�
			hanoi(n-1,tmp,from,to); //1�� �ӽð������� �̿��� 2�� �׿��ִ� n-1���� ������ 3���� �̵�
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); //������ ����
		hanoi(n,1,2,3);
		System.out.println(k);
		System.out.println(sb);
	}

}
