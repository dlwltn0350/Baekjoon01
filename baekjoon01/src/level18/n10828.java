package level18;

import java.io.*;
import java.util.*;

public class n10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0;i<n;i++) {
			String[] str=br.readLine().split(" ");
			
			switch(str[0]) {
			case "push":
				stack.push(Integer.parseInt(str[1]));
				break;
				
			case "top":
				if(stack.empty()) System.out.println(-1);
				else System.out.println(stack.peek());
				break;
				
			case "size":
				System.out.println(stack.size());
				break;
				
			case "empty":
				if(stack.empty()) System.out.println(1);
				else System.out.println(0);
				break;
				
			case "pop":
				if(stack.empty()) System.out.println(-1);
				else System.out.println(stack.pop());
				break;
			}
				
		}
	}

}
