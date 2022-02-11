package level7;

import java.util.*;
public class n10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		int[] arr=new int[26];
		
		Arrays.fill(arr, -1);
		
		//a의 아스키코드 : 97
		
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)-97] == -1) arr[s.charAt(i)-97] = i;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
