package level11;
/*
 * 체스판 다시 칠하기
 * 맨 첫째줄은 wbwbwbwb 이거나 bwbwbwbw로 되어 있어야 함
 * 알고리즘 : 완전탐색
 */
import java.io.*;

public class n1018 {

	public static int f(int a, int b, char[][] arr) {
		int W=0, B=0; // W: W로 시작할때 바꿔야 하는 사각형 개수, B : B로 시작할때 ~
		
		for(int i=a; i<a+8; i++) {
			for(int j=b; j<b+8; j++) {
				//if(arr[i][j]=='W') W++;
				//else B++;
				
				if((i+j)%2 == 0) {//교차로 값이 변경되어야 하기 때문에 -> ex. i=1, j=2 시작점이 w일때 해당 위치에 w로 시작해야 함
					if(arr[i][j]=='W') W++;
					else B++;
				}
				else {
					if(arr[i][j]=='B') W++;
					else B++;
				}
			} // W,B 각각의 개순
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


