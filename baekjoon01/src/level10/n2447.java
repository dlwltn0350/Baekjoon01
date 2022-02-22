package level10;
/**
 * ���� : https://hyunipad.tistory.com/88
 * ����� ������ ������ 8������ ���� ������ ��Ÿ���ϱ�, ������ ����ϵ��� �ϴ� ��� ȣ����� �ϰԲ� �Լ��� �ۼ�
 */
import java.io.*;
import java.util.Arrays;
public class n2447 {

	static char[][] arr;
	public static void f(int n, int x, int y) {
		//������ �ݺ��Ǵ� ������ n/3
		//�迭�� �߰� (1,1)�� ������̴�.
		if(n==1) arr[x][y]='*';
		else {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==1 && j==1) ;
					else f(n/3,x+i*(n/3),y+j*(n/3));
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr = new char[n][n];

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) arr[i][j]=' ';
		}
		
		f(n,0,0);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) System.out.print(arr[i][j]);
			System.out.println();
		}
	}

}

/*
 * ��ͽ�������
 * ũ�Ⱑ 27�϶� ũ�� 9�� ���Ϻ���
 * x=0 y=0 n=9 / x=9 y=0 n=9 / x=18 y=0 n=9
 * 
 * ũ�Ⱑ 9�϶� ũ�� 3�� ����
 * x=0 y=0 n=3 / x=3 y=0 n=3 / x=6 y=0 n=3
 * 
 * x=i*n
 * �ٸ���ġ��� x��ǥ+i*n
 * */

