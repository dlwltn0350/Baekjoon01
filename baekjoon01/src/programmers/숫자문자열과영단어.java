package programmers;

import java.io.*;

public class 숫자문자열과영단어 {
	public static int solution(String s) {
		String[] nums= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String answer = "";
        String tmp="";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)-'0'<10) answer=answer+s.charAt(i);
        	else tmp+=s.charAt(i);
        	
        	for(int j=0;j<nums.length;j++) {
        		if(tmp.equals(nums[j])) {
        			answer=answer+Integer.toString(j);
        			tmp="";
        			break;
        		}
        	}
        }
        
        return Integer.parseInt(answer);
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		System.out.println(solution(s));
	}

}
