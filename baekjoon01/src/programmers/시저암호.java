package programmers;

import java.io.*;

public class ������ȣ {
	public static String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)+n>'z' || (s.charAt(i)+n>'Z'&& s.charAt(i)<='Z')) answer+=(char)(s.charAt(i)-25+(n-1));
        	else if(s.charAt(i)==' ') answer+=" ";
        	else answer+=(char)(s.charAt(i)+n);
        }
        
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=str.charAt(str.length()-1)-'0';
		String s=str.substring(0,str.length()-2);
		System.out.println(solution(s,n));
	}

}

//�빮�� 65~90
//�ҹ��� 97~122