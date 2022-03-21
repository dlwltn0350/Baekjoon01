package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
	public static long[] solution(long x, int n) {
        long[] answer = {};
        answer=new long[n];
        long interval=x;
        x=0;
        for(int i=0;i<n;i++){
            answer[i]=x+interval;
            x=answer[i];
        }
        return answer;
    }
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		long x=Long.parseLong(str[0]);
		int n=Integer.parseInt(str[1]);
		
		long[] answer=solution(x,n);
		System.out.println(Arrays.toString(answer));
	}
}
