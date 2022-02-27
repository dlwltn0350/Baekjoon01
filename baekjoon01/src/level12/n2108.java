package level12;

import java.io.*;
import java.util.Arrays;

public class n2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int sum=arr[0], mid=arr[0], tmp=arr[0], cnt=1, max=0, cnt2=0, mode=0;
		
		if(n>1) {
			for(int i=1;i<n;i++) {
				sum+=arr[i];
				if(n%2==0 && n/2==i-1) mid=arr[i-1];
				else if(n%2==1 && n/2==i) mid=arr[i];
				
				if(tmp == arr[i]) cnt++;
				else {
					max=Math.max(max, cnt);
					cnt=1;
					tmp=arr[i];
				}
			}
		}
		max=Math.max(max, cnt);
		cnt=0;
		
		tmp=arr[0];
		for(int i=0;i<n;i++) {
			if(tmp==arr[i]) cnt++;
			else {
				cnt=1;
				tmp=arr[i];
			}
			
			if(cnt==max) {
				mode=arr[i];
				cnt2++;

			}
			if(cnt2==2) break;
		}
		
		if(sum>0) System.out.println(Math.round((double)sum/n));
		else System.out.println(-Math.round((double)(-sum)/n));
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(arr[n-1]-arr[0]);
	}

}
