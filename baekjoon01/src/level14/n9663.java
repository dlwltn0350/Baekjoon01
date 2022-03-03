package level14;
/**
 * ���Ұ��� ��, �� ������ index�� ���� �����Ѵ�.
 * queen�� ���� ��, ���� ��, �밢���� �����ؼ��� �ȵȴ�.
 * �� �������� ���̸� �����ϰ� Ž���Ѵ�.
 * queen�� ������ ������� ä��������.
 */
import java.io.*;

public class n9663 {
	
	static int[] arr;
	static int count=0;
	public static void queen(int n, int depth) {
		
		if(depth==n) {
			count++;
			return;
		}
		
		for(int i=0;i<n;i++) { 
			arr[depth]=i;
			
			if(check(depth)) { //�ش� �ڸ��� �־ �ȴٸ�
				queen(n, depth+1);
			}
		}
	}
	
	public static boolean check(int depth) { //���ݱ��� �÷��� queen ��ġ�� ���ο� queen�� �÷��θ� ������ ��ġ���� �ƴ��� check

		for(int i=0;i<depth;i++) { // i==depth�� ���� �̹� �ش� �࿡ queen�� �����ϴ� ����̹Ƿ� <=depth ����
			if(arr[i]==arr[depth]) // �̹� �ش� �࿡ queen�� �����Ѵٸ� false
				return false;
			
			if(Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) //�̹� �밢�� �� queen�� �����Ѵٸ� false
				return false;
			//�밢�� = ���� ���� ���� ���� ����.
		}
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		queen(n,0);
		System.out.println(count);
	}

}
