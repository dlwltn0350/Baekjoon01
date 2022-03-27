package programmers;

import java.io.*;
import java.util.*;

public class 중복값제거 {

	public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        answer.add(arr[0]);
        
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]!=arr[i-1]) answer.add(arr[i]);
        	else if(!answer.contains(arr[i])) answer.add(arr[i]);
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
