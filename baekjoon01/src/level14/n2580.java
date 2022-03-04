package level14;
/**
 * 3*3 내부, 값튼 행, 열에는 서로 다른 숫자로만 이뤄져야 한다.(겹친 숫자 X)
 * return은 재귀가 빠져나가기 위함이다.
 */
import java.io.*;

public class n2580 {

	static int[][] arr;
	
	public static void stoku(int row, int col) {
		if(col == 9) {
			stoku(row+1,0);//다음행으로
			return; //이전 row에 잘못된 값이 채워졌을 때 돌아가기 위한 return
		}
		
		if(row == 9) { //모든 스토쿠값이 다 채워진 상태
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
			System.exit(0);
			
		}
		
		if(arr[row][col] == 0) { //해당 칸에 값을 채워넣어야 한다면
			for(int value=1; value<=9; value++) {
				if(check(row,col,value)) {
					arr[row][col]=value;
					stoku(row,col+1);
				} 
			}
			arr[row][col]=0; //만약 올바르지 못한 값으로 채워넣을 경우 0으로 초기화시키고 재귀를 빠져나가 다시 올바른 값을 찾아야하기 때문에 0으로 지정하고 return
			return; //해당 check판단으로 값을 채워넣어도 올바르지 않은 값을 넣었을 경우, 재귀로 다시 쭉쭉 빠져나오면서 빈칸으로 다시 둘 것.
		}
		//return은 재귀를 빠져나가기 위함이다.
		
		stoku(row,col+1);
		
	}
	
	public static boolean check(int i, int j, int value) { //해당 값을 arr[i][j]에 삽입해도 되는지 check
		
		for(int a=0; a<9; a++) { 
			if(arr[a][j] == value ) //같은 열엔 서로 다른 숫자로만 이뤄져야 한다.
				return false;
			
			if(arr[i][a] == value) //같은 행엔 서로 다른 숫자로만 이뤄져야 한다.
				return false;
			
		}
		//012 / 345 / 678
		int row=(i/3) * 3; //value가 속한 3*3 내부의 첫번째 행
		int col=(j/3) * 3;
		
		for(int a=row; a<row+3; a++) { //3*3내부
			for(int b=col; b<col+3; b++) {
				if(arr[a][b] == value) return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr=new int[9][9];
		
		for(int i=0;i<9;i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0;j<9;j++) {
				arr[i][j]=Integer.parseInt(str[j]);
			}
		}
		
		stoku(0,0);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
