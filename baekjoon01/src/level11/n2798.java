package level11;
/*
 * 블랙젝
 * 완전탐색문제
 * 3중포문으로 모든 경우의 수를 탐색
 */
import java.io.*;
import java.util.*;

public class n2798 {

	public static int f(int n, int m, int[] arr) {
		int tmp=0, result=0;
		
		for(int i=0;i<n-2;i++) {
			if(arr[i]>m) continue; 
			for(int j=i+1;j<n-1;j++) {
				if(arr[i]+arr[j]>m) continue;
				for(int k=j+1;k<n;k++) {
					tmp=arr[i]+arr[j]+arr[k];
					
					if(tmp == m) return tmp;
					else if(result<tmp && tmp<m) result=tmp;
				}
			}
		}
		return result;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		String[] str2 = br.readLine().split(" ");
		int m=Integer.parseInt(str[1]), n=Integer.parseInt(str[0]), result=0;
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(str2[i]);
		
		//Arrays.sort(arr);
		result = f(n,m,arr);
		
		System.out.println(result);
	}

}
