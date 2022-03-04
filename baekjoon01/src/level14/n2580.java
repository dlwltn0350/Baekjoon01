package level14;
/**
 * 3*3 ����, ��ư ��, ������ ���� �ٸ� ���ڷθ� �̷����� �Ѵ�.(��ģ ���� X)
 * return�� ��Ͱ� ���������� �����̴�.
 */
import java.io.*;

public class n2580 {

	static int[][] arr;
	
	public static void stoku(int row, int col) {
		if(col == 9) {
			stoku(row+1,0);//����������
			return; //���� row�� �߸��� ���� ä������ �� ���ư��� ���� return
		}
		
		if(row == 9) { //��� �������� �� ä���� ����
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
			System.exit(0);
			
		}
		
		if(arr[row][col] == 0) { //�ش� ĭ�� ���� ä���־�� �Ѵٸ�
			for(int value=1; value<=9; value++) {
				if(check(row,col,value)) {
					arr[row][col]=value;
					stoku(row,col+1);
				} 
			}
			arr[row][col]=0; //���� �ùٸ��� ���� ������ ä������ ��� 0���� �ʱ�ȭ��Ű�� ��͸� �������� �ٽ� �ùٸ� ���� ã�ƾ��ϱ� ������ 0���� �����ϰ� return
			return; //�ش� check�Ǵ����� ���� ä���־ �ùٸ��� ���� ���� �־��� ���, ��ͷ� �ٽ� ���� ���������鼭 ��ĭ���� �ٽ� �� ��.
		}
		//return�� ��͸� ���������� �����̴�.
		
		stoku(row,col+1);
		
	}
	
	public static boolean check(int i, int j, int value) { //�ش� ���� arr[i][j]�� �����ص� �Ǵ��� check
		
		for(int a=0; a<9; a++) { 
			if(arr[a][j] == value ) //���� ���� ���� �ٸ� ���ڷθ� �̷����� �Ѵ�.
				return false;
			
			if(arr[i][a] == value) //���� �࿣ ���� �ٸ� ���ڷθ� �̷����� �Ѵ�.
				return false;
			
		}
		//012 / 345 / 678
		int row=(i/3) * 3; //value�� ���� 3*3 ������ ù��° ��
		int col=(j/3) * 3;
		
		for(int a=row; a<row+3; a++) { //3*3����
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
