package level18;

import java.io.*;
import java.util.Stack;

public class n10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0;i<k;i++) {
			int n=Integer.parseInt(br.readLine());
			if(n==0) stack.pop();
			else stack.push(n);
		}
		
		int cnt=0;
		int sz=stack.size();
		for(int i=0;i<sz;i++) {
			cnt+=stack.pop();
		}
		
		System.out.println(cnt);
	}

}
