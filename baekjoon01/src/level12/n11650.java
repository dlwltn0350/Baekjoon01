package level12;
/**
 * 
 * 시간복잡도 O(n^2)이상이 되면 안된다.
 * 내 생각 : 2차원 배열을 사용해야 하므로 O(nlongn)이 걸리는 정렬을 사용하고 이후 y좌표를 비교
 * 다른 방식 : Arrays.sort()에 람다식을 확장 // Arrays.sort(arr, (arr_1, arr_2) -> {} 의 형식 (?) // Comparator
 */
import java.io.*;
import java.util.Arrays;

public class n11650 {

	public static void insertion_sort(int[][] arr, int n) { // x값을 기준으로 정렬
		
		int key=0, key2;
		
		for(int i=1; i<n;i++) {
			key=arr[i][0];
			key2=arr[i][1];
			for(int j=i-1; j>=0 && key<arr[j][0] ;j--) {
				arr[j+1][0]=arr[j][0];
				arr[j+1][1]=arr[j][1];
				
				arr[j][0]=key;
				arr[j][1]=key2;
			}
		}
	}
	
	public static void f(int[][] arr, int n) {
		int tmp=0;
		
		for(int i=1;i<n;i++) {
			if(arr[i][0] == arr[i-1][0]) {
				if(arr[i][1]<arr[i-1][1]) swap(i,i-1,arr);
			}
		}
	}
	
	public static void swap(int x, int y, int[][] arr) {
		int tmp=0;
		
		tmp=arr[x][1];
		arr[x][1]=arr[y][1];
		arr[y][1]=tmp;
		
		tmp=arr[x][0];
		arr[x][0]=arr[y][0];
		arr[y][0]=tmp;
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		String[] str = new String[2];
		int[][] arr = new int[n][2];
		
		for(int i=0;i<n;i++) {
			str=br.readLine().split(" ");
			arr[i][0]=Integer.parseInt(str[0]);
			arr[i][1]=Integer.parseInt(str[1]);
		}
		
		//insertion_sort(arr,n);
		//f(arr,n);
		
		Arrays.sort(arr,(a,b)->{
			if(a[0] == b[0]) {
				return a[1] - b[1];
			}else {
				return a[0] - b[0];
			}
		});
	
		for(int i=0;i<n;i++){
			System.out.println(arr[i][0]+ " "+ arr[i][1]);
		}
		
		
	}

}
