package level14;

import java.io.*;

public class n14888 {
	static int[] arr;
	static int[] four;
	static int max=-1000000000, min=1000000000;
	public static void f(int num, int index) {
		if(index >= arr.length) {
			max=Math.max(max, num);
			min=Math.min(min, num);
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(four[i]>0) {
				four[i]--;
				
				switch(i) {
					case 0 : f(num+arr[index],index+1); break;
					case 1 : f(num-arr[index],index+1); break;
					case 2 : f(num*arr[index],index+1); break;
					case 3 : f(num/arr[index],index+1); break;

				}
				four[i]++;
			}
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr = new int[n];
		four = new int[4];
		
		String[] str=br.readLine().split(" ");
		for(int i=0;i<n;i++) 
			arr[i]=Integer.parseInt(str[i]);
		
		str=br.readLine().split(" ");
		
		for(int i=0;i<4;i++)
			four[i]=Integer.parseInt(str[i]); //µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼À
		
		//f(0,0);
		f(arr[0],1);
		System.out.println(max);
		System.out.println(min);
	}

}
