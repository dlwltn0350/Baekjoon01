package programmers;

import java.io.*;
import java.util.*;
//완전탐색?
public class 두개뽑아서더하기 {
	public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<arr.length-1;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(!answer.contains(arr[i]+arr[j])) answer.add(arr[i]+arr[j]);
        	}
        }

        //정렬
        return selection_sort(answer);
    }
	public static ArrayList<Integer> selection_sort(ArrayList<Integer> answer) {
		int tmp, index;
		
		for(int i=0;i<answer.size()-1;i++) {
			index=i;
			for(int j=i+1;j<answer.size();j++) {
				if(answer.get(index)>answer.get(j)) index=j;
			}
			tmp=answer.get(index);
			answer.set(index, answer.get(i));
			answer.set(i, tmp);
		}
		
		return answer;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int[] arr=new int[str.length];
		
		for(int i=0;i<str.length;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		
		System.out.println(solution(arr));
	}

}
