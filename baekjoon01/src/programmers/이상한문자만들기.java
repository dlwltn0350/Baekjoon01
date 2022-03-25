package programmers;

import java.io.*;

public class 이상한문자만들기 {

	public static String solution(String s) {
        String answer = "";
        String[] tmp=s.split(" ");
        for(int i=0;i<tmp.length;i++) {
        	for(int j=0;j<tmp[i].length();j++) {
            	if(j%2==0 && (tmp[i].charAt(j)>=97 && tmp[i].charAt(j)<=122) ) answer+=(char)(tmp[i].charAt(j)-32);
            	else if(j%2!=0 && (tmp[i].charAt(j)>=65 && tmp[i].charAt(j)<=90)) answer+=(char)(tmp[i].charAt(j)+32);
            	else answer+=tmp[i].charAt(j);
            }
        	if(i!=tmp.length-1) answer+=" ";
        }
        for(int i=s.length()-1;i>=0;i--) {
        	if(s.charAt(i)!=' ') break;
        	answer+=" ";
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
