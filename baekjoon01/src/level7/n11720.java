package level7;

import java.util.*;
public class n11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();//엔터제거
		String str=sc.nextLine();
		String[] arr=str.split("");
		int cnt=0;
		
		for(int i=0;i<arr.length;i++) {
			cnt+=Integer.parseInt(arr[i]);
		}
		System.out.println(cnt);
		
	}

}
