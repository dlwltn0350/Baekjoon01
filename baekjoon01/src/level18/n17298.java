package level18;

import java.io.*;
import java.util.*;

public class n17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		//int[] arr=new int[n];
		Stack<Integer> stack=new Stack<>();
		
		String[] str=br.readLine().split(" ");
		for(int i=n-1;i>=0;i--) {
			stack.push(Integer.parseInt(str[i]));
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		int index, tmp;
		
		boolean flag=false;
		for(int i=0;i<n;i++) {
			flag=false;
			index=stack.pop(); //top 1°³ ÃßÃâ
			//System.out.println(index);
			int sz=stack.size();
			
			for(int j=0;j<sz;j++) {
				if(stack.isEmpty()) break;
				tmp=stack.pop();
				list.add(tmp);
				if(index<tmp) {
					bw.write(tmp+" ");
					flag=true;
					break;
				}
			}
			
			if(stack.empty() && flag==false) {
				bw.write(-1+" ");
			}
			
			for(int j=list.size()-1;j>=0;j--) {
				stack.push(list.get(j));
			}
			list.clear();
		}
		bw.flush();
		bw.close();
		
	}

}
