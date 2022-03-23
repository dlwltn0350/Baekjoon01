package programmers;

import java.io.*;

public class 핸드폰번호가리기 {
	public static String solution(String phone_number) {
        String answer = "";
        int len=phone_number.length();
        for(int i=0;i<len-4;i++)
        	answer=answer+"*";
        answer=answer+phone_number.substring(len-4,len);
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String phone_number=br.readLine();
		
		String answer=solution(phone_number);
		System.out.println(answer);
		
	}

}
