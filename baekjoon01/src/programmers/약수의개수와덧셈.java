package programmers;

import java.io.*;

public class ¾à¼öÀÇ°³¼ö¿Íµ¡¼À {

	public static int solution(int left, int right) {
        int answer = 0;
        int sum=0, cnt=0;
        
        for(int i=left;i<=right;i++) {
        	for(int j=i;j>=1;j--) {
        		if(i%j==0) {
        			cnt++;
        		}
        	}
        	if(cnt%2==0) answer+=i;
        	else answer-=i;
        	
        	cnt=0;
        	
        }
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		
		System.out.println(solution(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
	}

}
