package programmers;

import java.io.*;
import java.util.*;

public class 없는숫자더하기 {

	public static int solution(int[] numbers) {
        int answer = 0;
        boolean[] bl=new boolean[10];
        Arrays.fill(bl, false);
        
        for(int i=0;i<numbers.length;i++) {
        	bl[numbers[i]]=true;
        }
        
        for(int i=0;i<bl.length;i++) {
        	if(!bl[i]) answer+=i;
        }
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int[] numbers=new int[str.length];
		for(int i=0;i<str.length;i++) {
			numbers[i]=Integer.parseInt(str[i]);
		}
		System.out.println(solution(numbers));
	}

}
