package programmers;

import java.io.*;

public class 콜라츠추측 {

	public static int solution(long num) {
        int answer = 0;
        
        for(int i=0;i<500;i++) {
        	
        	if(num==1) return i;
        	if(num%2==0) num/=2;
        	else num=num*3+1;
        }
        
        return -1;
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		System.out.println(solution(num));
	}

}
