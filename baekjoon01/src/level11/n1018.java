package level11;
/*
 * ü���� �ٽ� ĥ�ϱ�
 * �� ù°���� wbwbwbwb �̰ų� bwbwbwbw�� �Ǿ� �־�� ��
 * �˰��� : ����Ž��
 */
import java.io.*;

public class n1018 {

	public static int f(int a, int b, char[][] arr) {
		int W=0, B=0; // W: W�� �����Ҷ� �ٲ�� �ϴ� �簢�� ����, B : B�� �����Ҷ� ~
		
		for(int i=a; i<a+8; i++) {
			for(int j=b; j<b+8; j++) {
				//if(arr[i][j]=='W') W++;
				//else B++;
				
				if((i+j)%2 == 0) {//������ ���� ����Ǿ�� �ϱ� ������ -> ex. i=1, j=2 �������� w�϶� �ش� ��ġ�� w�� �����ؾ� ��
					if(arr[i][j]=='W') W++;
					else B++;
				}
				else {
					if(arr[i][j]=='B') W++;
					else B++;
				}
			} // W,B ������ ����
		}
		/*tmp = Math.min(Math.abs((W+B)/2-W),Math.abs((W+B)/2-B));
		min = Math.min(tmp, min);*/
		return Math.min(W, B);
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		String str2;
		int n=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		char[][] arr= new char[n][m];
		int min=100000, tmp=0;
		
		for(int i=0; i<n; i++) {
			str2=br.readLine();
			for(int j=0;j<m;j++)
				arr[i][j]=str2.charAt(j);
		}
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				min=Math.min(min, f(i,j, arr));
			}
		}
		
		System.out.println(min);
	}

}


