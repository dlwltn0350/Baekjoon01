package level10;
/**
 * 참고 : https://hyunipad.tistory.com/88
 * 가운데를 제외한 나머지 8군데에 같은 패턴이 나타나니까, 각각을 담당하도록 하는 재귀 호출들을 하게끔 함수를 작성
 */
import java.io.*;
import java.util.Arrays;
public class n2447 {

	static char[][] arr;
	public static void f(int n, int x, int y) {
		//패턴이 반복되는 지점이 n/3
		//배열의 중간 (1,1)은 빈공간이다.
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
 * 재귀시작지점
 * 크기가 27일때 크기 9로 패턴분할
 * x=0 y=0 n=9 / x=9 y=0 n=9 / x=18 y=0 n=9
 * 
 * 크기가 9일때 크기 3로 분할
 * x=0 y=0 n=3 / x=3 y=0 n=3 / x=6 y=0 n=3
 * 
 * x=i*n
 * 다른위치라면 x좌표+i*n
 * */

