package level12;
/*
 * 선택, 삽입, 버블, 합병, 퀵정렬
 * 
 */
import java.io.*;
public class 정렬 {

	static int[] arr; 
	
	public static void selection_sort() {//선택정렬 O(n^2) : n개의 수 중에서 가장 작은 수를 선택해서 앞으로 이동
		int tmp, index;
		
		for(int i=0;i<arr.length-1;i++) {
			index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) index=j;//"가장 작은 값"을 찾는다
			}
			
			tmp=arr[index];
			arr[index]=arr[i];
			arr[i]=tmp;
		}
	}
	
	public static void insertion_sort() { //삽입정렬 O(n^2) : n개의 수 중에서 i번째 수를 올바른 위치에 삽입
		int key=0;
		
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			
			for(int j=i-1; j>=0 && arr[j]>key; j--) { //이미 지나간 수들을 비교하면서 (0~i) arr[j]>arr[i]지점에 해당 수를 놓는다.
				arr[j+1]=arr[j];
				arr[j]=key;//해당값(key)은 앞으로 자리이동
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
