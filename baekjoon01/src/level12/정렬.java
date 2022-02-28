package level12;
/*
 * ����, ����, ����, �պ�, ������
 * 
 */
import java.io.*;
public class ���� {

	static int[] arr; 
	static int[] tmp; //arr�迭�� ������ ����
	
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
	
	public static void merge_sort() { //�պ����� -> https://todaycode.tistory.com/54 ����
		tmp=new int[arr.length];
		merge_sort(0,arr.length-1);
	}
	private static void merge_sort(int start, int end) {
		int mid;
		
		if(start<end) { // ���Ұ� 2�� �̻�
			mid=(start+end)/2; // 2�� �׷����� ����
			merge_sort(start,mid);
			merge_sort(mid+1,end);
			
			merge(start,mid,end); //����
		}
	}
	private static void merge(int start, int mid, int end) {
		tmp=arr.clone(); // arr �迭 �����ص�
		
		int part1=start; //���ʱ׷��� ù��° �ε���
		int part2=mid+1; //�����ʱ׷��� ù��° �ε���
		int index=start;
		
		while(part1<=mid && part2 <=end) {
			if(tmp[part1]<=tmp[part2]) {
				arr[index++]=tmp[part1++];
			}
			else
				arr[index++]= tmp[part2++];
		}
		
		for(int i=0; i<=mid-part1; i++) {//���ʱ׷��� ���°��
			arr[index+i]=tmp[part1+i];
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		//merge_sort();
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}

}
