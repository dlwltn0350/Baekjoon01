package programmers;

import java.io.*;

public class m3진법뒤집기 {
	public static int solution(int n) {
        String str="";
        int answer=0;
        while(n>0) {
        	str=str+(n%3);
        	n/=3;
        }
   
        for(int i=str.length()-1;i>=0;i--) {
        	answer+=Math.pow(3,i)*(str.charAt(str.length()-i-1)-'0');
        	//System.out.println(str.charAt(str.length()-i-1)-'0');
        }
        
        return answer;
        
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
	}

}
