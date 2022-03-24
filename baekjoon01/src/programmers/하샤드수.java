package programmers;

import java.io.*;

public class ÇÏ»þµå¼ö {
	public static boolean solution(int x) {
        boolean answer = true;
        int sum=0, tmp=x;
        
        while(x>=10) {
        	sum+=x%10;
        	x=x/10;
        }
        
        sum+=x;
        
        if(tmp%sum!=0) answer=false;
        
        return answer;
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		System.out.println(solution(x));
	}

}
