package level12;
/*
 * ����, ����, ����, �պ�, ������
 * 
 */
import java.io.*;
public class ���� {

	static int[] arr; 
	
	public static void selection_sort() {//�������� O(n^2) : n���� �� �߿��� ���� ���� ���� �����ؼ� ������ �̵�
		int tmp, index;
		
		for(int i=0;i<arr.length-1;i++) {
			index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) index=j;//"���� ���� ��"�� ã�´�
			}
			
			tmp=arr[index];
			arr[index]=arr[i];
			arr[i]=tmp;
		}
	}
	
	public static void insertion_sort() { //�������� O(n^2) : n���� �� �߿��� i��° ���� �ùٸ� ��ġ�� ����
		int key=0;
		
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			
			for(int j=i-1; j>=0 && arr[j]>key; j--) { //�̹� ������ ������ ���ϸ鼭 (0~i) arr[j]>arr[i]������ �ش� ���� ���´�.
				arr[j+1]=arr[j];
				arr[j]=key;//�ش簪(key)�� ������ �ڸ��̵�
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		
	}

}
