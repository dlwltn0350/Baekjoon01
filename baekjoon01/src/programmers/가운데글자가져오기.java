package programmers;

import java.io.*;

public class 가운데글자가져오기 {

	public static String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0) {
        	answer+=s.charAt(s.length()/2-1);
        	answer+=s.charAt(s.length()/2);
        	
        }
        else {
        	answer+=s.charAt(s.length()/2);
        }
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		System.out.println(solution(s));
	}

}
