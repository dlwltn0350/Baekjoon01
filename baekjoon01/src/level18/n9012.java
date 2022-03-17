package level18;

import java.io.*;
import java.util.Stack;

public class n9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			flag=false;
			String str=br.readLine();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='(') stack.push(1);
				else if(stack.empty() && str.charAt(j)==')') {
					System.out.println("NO");
					flag=true;
					stack.clear();
					break;
				}
				else stack.pop();
				
			}

			if(flag) continue;
			if(stack.empty()) System.out.println("YES");
			else System.out.println("NO");
			stack.clear();
		}
	}

}
