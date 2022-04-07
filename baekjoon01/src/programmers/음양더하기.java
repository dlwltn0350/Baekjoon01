package programmers;

import java.io.*;

public class 음양더하기 {
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0;i<absolutes.length;i++) {
        	if(signs[i]==true) {
        		answer+=absolutes[i];
        	}
        	else
        		answer-=absolutes[i];
        	
        }
        
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int[] absolutes=new int[str.length];
		for(int i=0;i<str.length;i++) {
			absolutes[i]=Integer.parseInt(str[i]);
		}
		
		str=br.readLine().split(" ");
		boolean[] signs=new boolean[str.length];
		for(int i=0;i<str.length;i++) {
			signs[i]=Boolean.parseBoolean(str[i]);
		}
		
		System.out.println(solution(absolutes,signs));
	}

}
